package Stepdefinition;

import Pages.Actions.WesternUnionApplicationActions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import static Pages.Actions.WesternUnionApplicationActions.*;
import static Utility.Hooks.androidDriver;


public class WesternUnionApplicationStep  {
WesternUnionApplicationActions westernUnionApplicationActions=null;
    public WesternUnionApplicationStep(){
        this.westernUnionApplicationActions=new WesternUnionApplicationActions();
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),westernUnionApplicationActions);
    }

    @Given("^I open the application$")
    public void i_open_the_application() throws InterruptedException {
        welcome();
    }
    @Then("^click on Menu option$")
    public void click_on_menu_option() throws InterruptedException {
        menu_button();
    }
    @Then("^click on Track transfer$")
    public void click_on_track_transfer() throws InterruptedException {
        trackTransfer();
    }
    @Then("^click on I am sender$")
    public void click_on_i_am_sender() throws InterruptedException {
        i_am_sender();
    }
    @Then("^Enter MTCN \"([^\\\"]*)\"$")
    public void enter_mtcn(String mtcn_number) throws InterruptedException {
       enter_mtcn_number(mtcn_number);
    }
    @Then("^click on next$")
    public void click_on_next() throws InterruptedException {
        nextButton();
        not_found_transfer_popup();
    }
    @Then("^click on Where can I find MTCN$")
    public void click_on_where_can_i_find_mtcn() throws InterruptedException {
        where_find_mtcn();
    }
    @Then("^click on I am receiver$")
    public void click_on_i_am_receiver() throws InterruptedException {
        i_am_reciver();
    }
    @Then("^click on Ask the sender for MTCN$")
    public void click_on_ask_the_sender_for_mtcn() throws InterruptedException {
        ask_sender_mtcn();
        share_via();
    }
    @Then("^click on Manage Alerts$")
    public void click_on_manage_alerts() throws InterruptedException {
        menuManageAlerts();
    }
    @Then("^Verify text on screen$")
    public void verify_text_on_screen() throws InterruptedException {
        verify_menuManageAlerts_msg();
    }
    @Then("click on Find Locations")
    public void click_on_find_locations() throws InterruptedException {
        menuFindLoactions_click();
    }
    @Then("^enter location \"([^\\\"]*)\"$")
    public void enter_location(String location1) throws InterruptedException {
        menuFindLoactions_enter(location1);
    }
    @Then("click on help")
    public void click_on_help() throws InterruptedException {

        menu_help_click();
    }
    @Then("verify customer care name and number")
    public void verify_customer_care_name_and_number() throws InterruptedException {
        menu_help_verify();
    }
    @Then("click on Settings")
    public void click_on_settings() throws InterruptedException {
       settings_click();
    }
    @Then("change color scheme")
    public void change_color_scheme() throws InterruptedException {
        settings_click_change();
    }
    @Then("Verify Terms and conditions and Privacy Statements")
    public void verify_terms_and_conditions_and_privacy_statements() throws InterruptedException {
    termsAndConditions_PrivacyStatements();
    }
    @Then("Verify app version")
    public void verify_app_version() throws InterruptedException {
        appversion();
    }


    }
