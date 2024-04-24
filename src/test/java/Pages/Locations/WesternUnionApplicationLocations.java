package Pages.Locations;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static Utility.Hooks.androidDriver;

public  class WesternUnionApplicationLocations {
    AndroidDriver driver;
    public WesternUnionApplicationLocations(){
        this.driver=androidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Welcome\"]" )
    public static WebElement welcome;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Menu\"]" )
    public static WebElement menu_button;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Track transfer\"]" )
    public static WebElement menu_track_transfer;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"I'm the sender\"]")
    public static WebElement i_am_sender;
    @AndroidFindBy(xpath="//android.widget.EditText")
    public static WebElement enter_mtcn;
    @AndroidFindBy(xpath="//android.widget.Button[@text=\"Next\"]")
    public static WebElement click_next;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"We can't find that transfer. Re-enter the info. (C1620)\"]")
    public static WebElement not_found_transfer_msg;
    @AndroidFindBy(xpath="//android.widget.Button[@text=\"OK\"]")
    public static WebElement msg_ok;
    @AndroidFindBy(xpath="//android.widget.Button[@text=\"Where can I find MTCN?\"]")
    public static WebElement find_mtcn;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"If you sent money at a Western Union location, you can find your MTCN on the printed receipt of that transfer.\"]")
    public static WebElement mtcn_tracker_number_msg;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"I'm the receiver\"]")
    public static WebElement i_am_reciver;
    @AndroidFindBy(xpath="//android.widget.Button[@text=\"Ask the sender for MTCN.\"]")
    public static WebElement ask_sender_mtcn;
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]")
    public static WebElement share_via;
    @AndroidFindBy(xpath="//android.widget.Button[@resource-id=\"com.huawei.android.internal.app:id/button_cancel\"]")
    public static WebElement share_via_cancel;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Find locations\"]")
    public static WebElement menu_find_locations ;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"City, State, Country\"]")
    public static WebElement search_loaction;
    @AndroidFindBy(xpath="//android.widget.EditText")
    public static WebElement search_location_enter;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Customer Care\"]")
    public static WebElement customer_care_name;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Phone 08000228781\"]")
    public static WebElement customer_care_number;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Settings\"]")
    public static WebElement menu_settings;
    @AndroidFindBy(xpath="//android.webkit.WebView[@text=\"Western Union | Money Transfer App\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Image\n")
    public static WebElement color_change_scheme;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Manage alerts\"]")
    public static WebElement menu_manageAlerts;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"You haven't set any exchange rate alerts.\"]")
    public static WebElement menu_manage_alerts_msg;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Terms and Conditions\"]\n")
    public static WebElement terms_and_conditions;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Privacy Statement\"]\n")
    public static WebElement privacy_statements;
    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Version 5.2\"]")
    public static WebElement app_version;

    /*@AndroidFindBy(xpath="")
    public static WebElement ;
    */


}
