Feature: To validate the login functionality

  Background: 
    Given User is in facebook login page

  Scenario: To validate the login using invalid credentials
    When User enter invalid username password
    And User click login button
    Then User should be displayed with error message

  
