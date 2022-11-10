@Regression
@CENT-1419
Feature: As a POS Manager I should be able to create CUSTOMER

  Background: User is logged in
    Given  User is logged in the application

    @CENT-1452 @Smoke
    Scenario Outline: User can create new CUSTOMER
    When User clicks on CRM module
    And User clicks on Customers
    And User clicks on Create button
    And User enters "<name>" name text box
    And User enters "<address street>" street text box
    And User enters "<email address>" email address text box
    Then User clicks (Customers)save button

    Examples: Details
      | name       | address street   | email address       |  |
      | nur onemli | 123 cydeo street | nuronemli@cydeo.com |  |

     @CENT-1453
     Scenario: User can switch Kanban-List view
    When User clicks on CRM module
    And User clicks on Customers
    Then user clicks to List button
    Then User clicks to Kanban button

     @CENT-1454
  Scenario: User can discard changes
    When User clicks on CRM module
    And User clicks on Customers
    And User clicks on Create button
    And User enters "testing" name text box
    And User clicks discard button
    And User clicks OK warning button
    Then User is on the CRM module

       @CENT-1455
       Scenario Outline: User can edit CUSTOMER
    When User clicks on CRM module and clicks customers
    And User searches for "<name>" name on search box
    And User clicks on found "<expected customer name>"
    And User clicks on edit button
    And User re-enters "<new name>" new name
    And User clicks save button(customer)
    Then User sees edited "<new name>"

Examples: customer name
  | name       | expected customer name | new name     |
  | nur onemli | nur onemli             | Aynur Onemli |

  @CENT-1456
  Scenario: User can delete CUSTOMER
    When User clicks on CRM module
    And User clicks on Customers
    And User clicks on Create button
    And User enters "testing" name text box
    And User clicks save button(customer)
    And User clicks on actions drop down
    And User clicks delete button(customer)
    And User clicks OK button



