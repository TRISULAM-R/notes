package com.framework.base;

import com.framework.factory.DriverFactory;
import com.framework.reports.ExtentManager;
import com.framework.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        ExtentManager.initReports();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        ExtentManager.flushReports();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        config = new ConfigReader();
        driver = DriverFactory.createDriver(config.getBrowser(), Boolean.parseBoolean(config.get("headless")));
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
