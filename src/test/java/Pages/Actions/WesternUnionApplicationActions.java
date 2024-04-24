package Pages.Actions;

import Pages.Locations.WesternUnionApplicationLocations;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import static Pages.Locations.WesternUnionApplicationLocations.*;
import static Utility.Hooks.androidDriver;


public class WesternUnionApplicationActions{

     WesternUnionApplicationLocations westernUnionApplicationLocations =null;
     public WesternUnionApplicationActions(){
         this.westernUnionApplicationLocations=new WesternUnionApplicationLocations();
         PageFactory.initElements(new AppiumFieldDecorator(androidDriver),westernUnionApplicationLocations);
     }
    public static void welcome() throws InterruptedException {
        Thread.sleep(20000);
        WesternUnionApplicationLocations.welcome.isDisplayed();
        System.out.println(WesternUnionApplicationLocations.welcome.getText());
        Thread.sleep(1000);
    }

    public static void menu_button() throws InterruptedException {
        WesternUnionApplicationLocations.menu_button.click();
        Thread.sleep(1000);
    }
    public static void trackTransfer() throws InterruptedException {
        menu_track_transfer.click();
        Thread.sleep(1000);
    }

    public static void i_am_sender() throws InterruptedException {
         System.out.println(i_am_sender.isDisplayed()+" : "+i_am_sender.getText());
        i_am_sender.click();
        Thread.sleep(1000);
    }
    public static void enter_mtcn_number(String mtcnNumber) throws InterruptedException {
        WesternUnionApplicationLocations.enter_mtcn.sendKeys(mtcnNumber);
        Thread.sleep(1000);
    }
    public static void nextButton() throws InterruptedException {
        click_next.click();
        Thread.sleep(10000);

    }
    public static void not_found_transfer_popup() throws InterruptedException {
        System.out.println(not_found_transfer_msg.isDisplayed()+" : "+not_found_transfer_msg.getText());
        msg_ok.click();
        Thread.sleep(1000);
    }
    public static void where_find_mtcn() throws InterruptedException {
        Thread.sleep(2000);
         find_mtcn.click();
         Thread.sleep(2000);
        System.out.println(mtcn_tracker_number_msg.isDisplayed()+" : "+mtcn_tracker_number_msg.getText());
        msg_ok.click();
        Thread.sleep(1000);
    }
    public static void i_am_reciver() throws InterruptedException {
        System.out.println(i_am_reciver.isDisplayed()+" : "+i_am_reciver.getText());
        i_am_reciver.click();
        Thread.sleep(1000);
    }
    public static void ask_sender_mtcn() throws InterruptedException {
        ask_sender_mtcn.click();
        Thread.sleep(10000);
    }
    public static void share_via() throws InterruptedException {
        System.out.println(share_via.isDisplayed()+": Share Via");
        Thread.sleep(1000);
        share_via_cancel.click();
        Thread.sleep(1000);
    }
    public static void menuFindLoactions_click() throws InterruptedException {
        menu_find_locations.click();
        Thread.sleep(2000);
    }
        public static void menuFindLoactions_enter(String locationName) throws InterruptedException {
            Thread.sleep(20000);
            search_loaction.click();
            Thread.sleep(10000);
            search_location_enter.sendKeys(locationName);
        Thread.sleep(2000);
        }
    public static void menu_help_click() throws InterruptedException {
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Help\"))")).click();
        Thread.sleep(2000);}
    public static void menu_help_verify() throws InterruptedException {
        System.out.println(customer_care_name.getText().equals("Customer Care")+" : "+customer_care_name.getText());
        Thread.sleep(10000);
        System.out.println(customer_care_number.getText().contains("08000228781")+" : "+customer_care_number.getText());
        Thread.sleep(10000);
    }
    public static void settings_click() throws InterruptedException {
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Settings\"))")).click();
        Thread.sleep(2000);}
    public static void settings_click_change() throws InterruptedException {
        color_change_scheme.click();
        Thread.sleep(2000);
    }
    public static void menuManageAlerts() throws InterruptedException {
        menu_manageAlerts.click();
         Thread.sleep(2000);
    }
    public static void verify_menuManageAlerts_msg() throws InterruptedException {
        System.out.println(menu_manage_alerts_msg.getText().equals("You haven't set any exchange rate alerts.") + " : " + menu_manage_alerts_msg.getText());
        Thread.sleep(2000);
    }
    public static void termsAndConditions_PrivacyStatements() throws InterruptedException {
    System.out.println("Terms and Conditions : "+terms_and_conditions.isDisplayed());
    System.out.println("Privacy Statements : "+privacy_statements.isDisplayed());
    Thread.sleep(2000);
     }
    public static void appversion() throws InterruptedException {
        System.out.println("App Version : "+app_version.isDisplayed());
        Thread.sleep(2000);
    }



}
