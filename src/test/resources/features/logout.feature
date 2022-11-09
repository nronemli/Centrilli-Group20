
Feature: Logout Functionality

  Background: User is logged in
    Given User is logged in the application
  @Smoke
  Scenario:  User can log out and ends up in login page.
    When user clicks username
    And user clicks logout option
    Then user is on the login page


  Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
    When user is logged out
    And user clicks back button
    Then user sees warning message Odoo Session expired

