@Regression
Feature: Repair Orders Functionality

  Background: User is logged in as posmanager and lands on Repair Orders Page
    Given User is logged in the application
    When User clicks on repairs button

  Scenario Template: Verify that the user can create new Repair Order
    When User clicks on create button for Repair Orders Functionality
    And User types "<product type>" inside product to repair input box
    And User selects the product shown in the dropdown
    And User clicks on save button for repair order functionality
    Then User sees that repair order has been created and "<product type>" info is shown on the page
    Examples: Product Info
      | product type |  |
      | Screen       |  |


    @Smoke
    Scenario: Verify that the user can switch Kanban-List view
      When User clicks on kanban view button for repairs
      Then User clicks on list view button for repairs


  Scenario: Verify that the user can discard changes
      When User clicks on create button for Repair Orders Functionality
      Then User clicks on discard button and sees they land on repair orders page back


  Scenario: Verify that the user can edit Repair Order
    When User clicks on the repair order created newly
    And User clicks on the edit button
    And User clicks on save button for repair order functionality
    Then User sees that repair order edited


  Scenario: Verify that the user can delete Repair Order
    When User clicks on the repair order created newly
    And User clicks on the action button
    And User clicks on delete button
    And User clicks on the OK option to proceed with deleting
    When User clicks on Repairs Orders link on the left
    Then User sees that first repair order on the list is different














