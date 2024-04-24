package Pages.Locations;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class WesternUnionLocations {
    public  static  By usernameTextBox = By.id("com.maxsoftlk.loginapplication:id/etUserName");
    public  static By passwordTextBox = By.id("com.maxsoftlk.loginapplication:id/etPassword");
    public static By loginButton = By.id("com.maxsoftlk.loginapplication:id/btnLogin");
    public static By attemptsCounterLabel = By.id("com.maxsoftlk.loginapplication:id/tvAttemptsInfo");
    public static By trackLocation =By.xpath("//android.widget.Button[@text=\"Track transfer\"]");

}
