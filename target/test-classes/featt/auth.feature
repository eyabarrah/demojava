#Author
#Date
#Description
Feature: feature to test login functionality

  Scenario: Check login with successful credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
