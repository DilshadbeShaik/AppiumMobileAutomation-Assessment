package Pages.Actions;

import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.By;

import static Pages.Locations.LoginLocations.*;
import static Utility.BrowserDriver.driver;

public class LoginActions {
    public static void searchLoginTitle(String logintitle){
        Assert.assertTrue( driver.findElement(By.xpath(loginTitle)).getText().contains(logintitle));
    }
    public static void enterUsername(String username1) throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath(username)).sendKeys(username1);
    }

    public static void enterPassword(String password1) throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath(password)).sendKeys(password1);
    }
    public static void clickLogin() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath(loginButton)).click();
    }
    public static void dashboardTitle() {
        Assert.assertTrue(driver.findElement(By.xpath(dashboardTitle)).getText().contains("Dashboard"));
    }
    public static void invalidErrorMsg() {
        Assert.assertTrue(driver.findElement(By.xpath(invalid_error_msg)).getText().contains("Invalid credentials"));
    }

    /*LoginLocations loginLocations =null;

    public LoginActions() {
        this.loginLocations=new LoginLocations();
        PageFactory.initElements(WebDriver.getDriver(), orangeHRMLoginLocators);
    }
    public void searchLoginTitle(String logintitle) {
        Assert.assertTrue(orangeHRMLoginLocators.loginTitle.getText().contains(logintitle));
    }
    public void enterUsername(String username) throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginLocators.username.sendKeys(username);
    }
    public void enterPassword(String password) throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginLocators.password.sendKeys(password);
    }
    public void clickLogin() throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginLocators.loginButton.click();
    }
    public void dashboardTitle() {
        Assert.assertTrue(orangeHRMLoginLocators.dashboardTitle.getText().contains("Dashboard"));
    }
    public void invalidErrorMsg() {
        Assert.assertTrue(orangeHRMLoginLocators.invalid_error_msg.getText().contains("Invalid credentials"));
    }*/
}
