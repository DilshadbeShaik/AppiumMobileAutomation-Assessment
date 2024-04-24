package Utility;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class Hooks {
    public static BrowserDriver driver;
    public static AndroidDriver androidDriver;

    @Before("@web")
    public void setup() {

        driver = new BrowserDriver();
    }

    @Before("@appium")
    public void setupAppium() throws MalformedURLException {
        initDriver();
    }

    public void initDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "honor7C_3233");
        cap.setCapability("udid", "WDM3Y18529017062");
        cap.setCapability("platformVersion", "8.0.0");
//        cap.setCapability("deviceName","Medium Phone API 34");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator2");
//        cap.setCapability("platformVersion","14.0");
        cap.setCapability("noReset", "true");
        cap.setCapability("appPackage", "com.westernunion.moneytransferr3app.nl");
        cap.setCapability("appActivity", "com.westernunion.moneytransferr3app.MainActivity");

        URL serverUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
        try {
            System.out.println("Argument to driver object : " + serverUrl);
            androidDriver = new AndroidDriver(serverUrl, cap);
        } catch (NullPointerException ex) {
            throw new RuntimeException("**Appium driver could not be initialised for device**");
        }

        System.out.println("<<  ApplicationStarted... >>");

    }

    @After("@web")
    public static void tearDown(Scenario scenario) {

        WebDriver driver = BrowserDriver.getDriver();
        System.out.println("*************************************************************");
        System.out.println("Taking Screenshot after scenario is fails : " + scenario.isFailed());

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("*************************************************************");

        driver.close();
    }

    @After("@appium")
    public static void tearDown_appium(Scenario scenario) {

//       AppiumDriver driver = AndroidDriver.getDriver_appium();
        System.out.println("*************************************************************");
        System.out.println("Taking Screenshot after scenario is fails : " + scenario.isFailed());

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("*************************************************************");
        System.out.println("*****  Application Logging off---  *****");
        androidDriver.quit();
    }


    public static BrowserDriver getDriver() {
        return driver;
    }

    public static AndroidDriver getDriver_appium() {
        return androidDriver;
    }
}