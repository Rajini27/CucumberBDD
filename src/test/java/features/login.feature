
Feature: To test Login Functionality

  Scenario: To login the page
    Given User is on Login page
    When user enters user name and password
    And click on login button
    Then User is navigated  to home page
