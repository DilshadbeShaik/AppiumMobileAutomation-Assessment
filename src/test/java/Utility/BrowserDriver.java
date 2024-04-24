package Utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
   public  static ChromeOptions options;
    public BrowserDriver(){

//        options = new ChromeOptions();
//        options.addArguments("--remote.allow.origins**");

        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void openPage(String url) throws Exception {
        Thread.sleep(2000);
        driver.get(url);
        Thread.sleep(10000);
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public void close(){

        this.driver.close();
    }
}
