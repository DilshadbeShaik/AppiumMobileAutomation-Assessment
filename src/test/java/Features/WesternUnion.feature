@appium
Feature: WesternUnion application

  Scenario: Track Transfer as a sender
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am sender
    Then Enter MTCN "1234567890"
    Then click on next

  Scenario: Check Where Can I find MTCN link
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am sender
    Then click on Where can I find MTCN

  Scenario: Track Transfer as a receiver
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am receiver
    Then Enter MTCN "1234567890"
    Then click on next

  Scenario: Check Ask The Sender for MTCN link
    Given I open the application
    Then click on Menu option
    Then click on Track transfer
    Then click on I am receiver
    Then click on Ask the sender for MTCN

    Scenario: Manage Alerts
      Given I open the application
      Then click on Menu option
      Then click on Manage Alerts
      Then Verify text on screen

      Scenario:Find near By location
        Given I open the application
        Then click on Menu option
        Then click on Find Locations
        Then enter location "HimayathNagar"

  Scenario:Customer care details
    Given I open the application
    Then click on Menu option
    Then click on help
    Then verify customer care name and number

  Scenario:App Settings
    Given I open the application
    Then click on Menu option
    Then click on Settings
    Then change color scheme

  Scenario:T&C and  Privacy Statements links
    Given I open the application
    Then click on Menu option
    Then Verify Terms and conditions and Privacy Statements

  Scenario:App Version
    Given I open the application
    Then click on Menu option
    Then Verify app version



