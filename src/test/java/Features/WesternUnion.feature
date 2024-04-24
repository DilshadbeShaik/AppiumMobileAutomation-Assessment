@appium
Feature: WesternUnion application

  @appium_test
  Scenario: Track Transfer as a sender
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am sender
    Then Enter MTCN "1234567890"
    Then click on next

  @appium_test
  Scenario: Check Where Can I find MTCN link
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am sender
    Then click on Where can I find MTCN

  @appium_test
  Scenario: Track Transfer as a receiver
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am receiver
    Then Enter MTCN "1234567890"
    Then click on next

  @appium_test
  Scenario: Check Ask The Sender for MTCN link
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am receiver
    Then click on Ask the sender for MTCN

  @appium_test
  Scenario: Manage Alerts
    Given I open the application
    Then click on Menu option
    Then click on Manage Alerts
    Then Verify text on screen
  @appium_test
  Scenario:Find near By location
    Given I open the application
    Then click on Menu option
    Then click on Find Locations
    Then enter location "HimayathNagar"
  @appium_test
  Scenario:Customer care details
    Given I open the application
    Then click on Menu option
    Then click on help
    Then verify customer care name and number
  @appium_test
  Scenario:App Settings
    Given I open the application
    Then click on Menu option
    Then click on Settings
    Then change color scheme
  @appium_test
  Scenario:T&C and  Privacy Statements links
    Given I open the application
    Then click on Menu option
    Then Verify Terms and conditions and Privacy Statements
  @appium_test
  Scenario:App Version
    Given I open the application
    Then click on Menu option
    Then Verify app version



