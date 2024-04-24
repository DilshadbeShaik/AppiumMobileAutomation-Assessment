package Stepdefinition;

import io.cucumber.java.en.*;

import static Pages.Actions.LoginActions.*;
import static Utility.BrowserDriver.*;

public class LoginStep {
    @Given("^that I am on login page of \"([^\\\"]*)\" website$")
    public void that_i_am_on_login_page_of_website(String websiteURL) throws Exception {
//		Thread.sleep(3000);
        openPage(websiteURL);
    }

    @When("^I move to homepage then it shows \"([^\\\"]*)\"$")
    public void i_move_to_homepage_then_it_shows(String loginTitle) throws Exception {
        Thread.sleep(3000);
        searchLoginTitle(loginTitle);
    }

    @Then("^I enter the \"([^\\\"]*)\" as username$")
    public void i_enter_the_as_username(String username) throws Exception {
        Thread.sleep(1000);
        enterUsername(username);
    }

    @Then("^I enter the \"([^\\\"]*)\" as password$")
    public void i_enter_the_as_password(String password) throws Exception {
        Thread.sleep(1000);
        enterPassword(password);
    }

    @Then("click on the login button")
    public void click_on_the_login_button() throws Exception {
        Thread.sleep(3000);
        clickLogin();

    }

    @Then("it moves to dashboard")
    public void it_moves_to_dashboard() throws Exception {
        Thread.sleep(5000);
        dashboardTitle();
        System.out.println("Now you are in dashboard ");


    }

    @Then("it shows the invalid credentials error message")
    public void it_shows_the_invalid_credentials_error_message() throws Exception {
        Thread.sleep(3000);
        invalidErrorMsg();
        System.out.println("Please check your credentials");

    /*OrangeHRMLoginActions orangeHRMLoginActions = null;
    BeforeActions beforeActions =null;
    public LoginStep() {
        this.orangeHRMLoginActions=new OrangeHRMLoginActions();
        PageFactory.initElements(SeleniumDriver.getDriver(), orangeHRMLoginActions);
    }

    @Given("^that I am on login page of \"([^\\\"]*)\" website$")
    public void that_i_am_on_login_page_of_website(String websiteURL) throws Exception {
//		Thread.sleep(3000);
        SeleniumDriver.openPage(websiteURL);
    }

    @When("^I move to homepage then it shows \"([^\\\"]*)\"$")
    public void i_move_to_homepage_then_it_shows(String loginTitle) throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginActions.searchLoginTitle(loginTitle);
    }

    @Then("^I enter the \"([^\\\"]*)\" as username$")
    public void i_enter_the_as_username(String username) throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginActions.enterUsername(username);
    }

    @Then("^I enter the \"([^\\\"]*)\" as password$")
    public void i_enter_the_as_password(String password) throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginActions.enterPassword(password);
    }

    @Then("click on the login button")
    public void click_on_the_login_button() throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginActions.clickLogin();

    }

    @Then("it moves to dashboard")
    public void it_moves_to_dashboard() throws Exception {
        Thread.sleep(5000);
        orangeHRMLoginActions.dashboardTitle();
        System.out.println("Now you are in dashboard ");


    }
    @Then("it shows the invalid credentials error message")
    public void it_shows_the_invalid_credentials_error_message() throws Exception {
        Thread.sleep(3000);
        orangeHRMLoginActions.invalidErrorMsg();
        System.out.println("Please check your credentials");

    }*/

    }
}
