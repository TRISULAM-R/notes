import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.beans.DesignMode;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchApp
{
    public static void main(String[] args) throws MalformedURLException
    {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","android");
        dc.setCapability("automationName","uiautomator2");
        dc.setCapability("deviceName","");
        dc.setCapability("UDID","");

        dc.setCapability("ignoreHiddenApiPolicyError",true);
        dc.setCapability("autoGrantPermissions",true);
        dc.setCapability("noReset",true);

        dc.setCapability("appPackage","");
        dc.setCapability("appActivity","");

        URL url = new URL("http://localhost:4723");
        AndroidDriver driver = new AndroidDriver(url, dc);

        System.out.println("App Launched");

//  Chapter: Locators

        //AccessibilityId
        driver.findElement(AppiumBy.accessibilityId("2")).click();
        //id
        driver.findElement(AppiumBy.id("2")).click();
        //androidUIAutomator
        driver.findElement(AppiumBy.androidUIAutomator("2")).click();
        //className
        driver.findElement(AppiumBy.className("2")).getText();
        // xpath
        driver.findElement(AppiumBy.xpath("2")).getText();

//  Guestures
    }
}
