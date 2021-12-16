Feature: Check Login functionality

  @SmokeTest
  Scenario: 
    Given user is on login page
    When user neters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @Regression
  Scenario: 
    Given user is on login page
    When user neters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @CoreTC
  Scenario: 
    Given user is on login page
    When user neters valid username and password
    And clicks on login button
    Then user is navigated to the home page
