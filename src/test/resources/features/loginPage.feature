@Regression
@Smoke
Feature: User should be able to login with valid credentials

  Background: user is on the login page
    Given user is on the login page


  Scenario Template: User login scenario
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then user should login and see their "<expectedUsername>"

    Examples: Valid salesmanager credentials
      | username                | password     | expectedUsername |
      | salesmanager20@info.com | salesmanager | SalesManager20   |
      | posmanager10@info.com   | posmanager   | POSManager10     |

  Scenario Template: Message displayed for invalid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks login button
    Then user sees warning message displayed Wrong login password
    Examples: Invalid credentials
      | username                | password |
      | posmanager10@info.com   | sales    |
      | salesmanager20@info.com | pos      |

  Scenario: Message displayed if username or password is empty
    When user enters password "<username>"
    And user clicks login button
    Then user sees warning message Please fill out this field

  Scenario: User lands on reset password page
    When user clicks to reset password link
    Then user lands on reset password page

  Scenario Template: Verify if the enter key is working on the login page
    When user enters username "<username>"
    Then user enters password "<password>"
    Then user enters enter key from keyboard
    Then user should login to the application

    Examples: Valid credentials
      | username                | password     |
      | posmanager10@info.com   | posmanager   |

    Scenario: User should see the password in bullet signs by default
      When user enters password "<password>"
      Then user should see bullet signs in "<password"> inputbox