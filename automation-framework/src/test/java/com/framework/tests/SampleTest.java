package com.framework.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.framework.base.BaseTest;
import com.framework.pages.HomePage;
import com.framework.reports.ExtentManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test(description = "Open app and validate title")
    public void verifyHomePageTitle() {
        ExtentReports extent = ExtentManager.getExtent();
        ExtentTest test = extent.createTest("verifyHomePageTitle");
        driver.get(config.get("app.url"));
        HomePage home = new HomePage(driver);
        String title = home.getTitle();
        test.info("Title: " + title);
        // Basic assertion - update expected as needed
        Assert.assertTrue(title != null && !title.isEmpty(), "Title should be present");
    }
}
