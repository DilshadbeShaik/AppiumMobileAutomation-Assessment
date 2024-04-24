package Pages.Actions;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import static Pages.Locations.WesternUnionLocations.*;

public class WesternUnionActions {
    public static AndroidDriver driver;

    public WesternUnionActions(AndroidDriver driver) {
        this.driver = driver;
    }
    public static void  trackThelocation(){
        WebElement el=driver.findElement(trackLocation);
        el.click();
    }

    public void setUsername(String username) {
        driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

    public String getAttemptsCounterLabelText() {
        return driver.findElement(attemptsCounterLabel).getText();
    }
}
