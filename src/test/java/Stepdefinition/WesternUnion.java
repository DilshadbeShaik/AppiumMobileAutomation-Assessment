package Stepdefinition;

import Pages.Actions.WesternUnionActions;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static Pages.Actions.WesternUnionActions.trackThelocation;
import static java.util.concurrent.TimeUnit.SECONDS;

public class WesternUnion {
//    private final DesiredCapabilities caps = new DesiredCapabilities();
    private AndroidDriver driver;
//    private WesternUnionActions westernUnionActions;


  /*  public void setupDeviceCapabilities() {
        caps.setCapability("deviceName", "Galaxy Nexus API 24");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0.0");
        caps.setCapability("app", new File(System.getProperty("user.dir")
                + "/src/test/resources/loginApp.apk").getAbsolutePath());
        caps.setCapability("appPackage", "com.maxsoftlk.loginapplication");
        caps.setCapability("appActivity", "com.maxsoftlk.loginapplication.MainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
    }*/

   /* @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
            driver = new AndroidDriver(url, caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
//        westernUnionActions = new WesternUnionActions(driver);
    }*/
    @Given("^Login to Western union$")
    public void login_to_Western_union() throws MalformedURLException, InterruptedException {
       /* DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("deviceName", "Medium Phone API 34");
        cap.setCapability("platformVersion", "14.0");
        cap.setCapability("noReset", "true");
        cap.setCapability("appPackage", "com.android.chrome");
        cap.setCapability("appActivity", "org.chromiun.android_webview.devui.MainActivity");*/
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "honor7C_3233");
        cap.setCapability("udid", "WDM3Y18529017062");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("platformName", "Android");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("noReset", "true");
        cap.setCapability("appPackage", "com.westernunion.moneytransferr3app.in");
        cap.setCapability("appActivity", "com.westernunion.moneytransferr3app.MainActivity");

        URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
        driver = new AndroidDriver(url, cap);
        System.out.println("ApplicationStarted");
        Thread.sleep(20000L);
//        WebElement el = driver.findElement(By.xpath("//android.widget.Button[@text=\"Track transfer\"]"));
//        el.click();


    }
    @Then("^click on track the transfer$")
    public void click_on_track_the_transfer() throws InterruptedException {
        trackThelocation();
        Thread.sleep(20000L);
    }
    @Then("^verify the title$")
    public void verify_the_title(String username){
        System.out.println("Application Logging off---");
        driver.quit();
    }

    /*@AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }*/
}

