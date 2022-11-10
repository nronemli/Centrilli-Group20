
Feature: As a POS Manager I should be able to create Purchase / Incoming Product

  Background:
    Given User is logged in the application


  Scenario: Verify that user can create Incoming Product
    When user clicks on Purchases module
    And user clicks on Incoming Products
    And user clicks on Create button
    And user enters Partner LocationsCustomers Source in Location input box
    #And user enters Partner LocationsVendors in Destination Location input box
    And user enters "Partner Locations/Vendors" in Destination Location input box
    And user enters Product in Product input box
    Then user clicks SAVE button
    Then Verify that the user can create Incoming Product


  Scenario: Verify that user can delete Incoming Product
    When user clicks on Purchases module
    And user clicks on Incoming Products
    And user clicks on Create button
    And user enters Partner LocationsCustomers Source in Location input box
    And user enters "Partner Locations/Vendors" in Destination Location input box
    And user enters Product in Product input box
    Then user clicks SAVE button
    Then user delete created incoming product


  Scenario: Verify that user can switch Kanban-List view
    When user clicks on Purchases module
    And user clicks on Incoming Products
    And user clicks Kanban Button
    Then verify that user can switch kanban view


  Scenario: Verify that user can discard changes
    When user clicks on Purchases module
    And user clicks on Incoming Products
    And user clicks on Create button
    And user enters Partner LocationsCustomers Source in Location input box
    And user enters Product in Product input box
    Then user click on Discard button
    Then verify that user can discard changes and back incoming products page

  Scenario: Verify that user can move to the next records page by right-left buttons
    When user clicks on Purchases module
    And user clicks on Incoming Products
    And user clicks right arrow
    Then verify that user can move to the next page







