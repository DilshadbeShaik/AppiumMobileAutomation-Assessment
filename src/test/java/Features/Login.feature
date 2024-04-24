@test
Feature: OrangeHRM Login
  In order to login to the website orange HRM

  @testscenario1
  Scenario: Verify the login of OrangeHRM with valid credentials
    Given that I am on login page of "https://opensource-demo.orangehrmlive.com/" website
    When I move to homepage then it shows "Login"
    Then I enter the "Admin" as username
    Then I enter the "admin123" as password
    Then click on the login button
    And it moves to dashboard

