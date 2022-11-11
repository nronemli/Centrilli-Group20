
@CENT-1466 @Regression
Feature: As a POS Manager I should be able to create Repairs / Repair Orders

  Background:
    Given User is logged in the application

 @CENT-1461
  Scenario: Verify that user can create Repair Orders
   When user clicks on Repair modules
   And user clicks on Create Button(repair)
   And user select the product in Product to Repair input box
   And user clicks on Save button(repair)
   Then verify that user can create repair orders

 @CENT-1462
  Scenario: Verify that user can delete Repair Orders
    When user clicks on Repair modules
    And user clicks on Create Button(repair)
    And user select the product in Product to Repair input box
    And user clicks on Save button(repair)
    And user delete repair orders

 @CENT-1463
  Scenario: Verify that user can edit Repair Orders
    When user clicks on Repair modules
    And user clicks on Create Button(repair)
    And user select the product in Product to Repair input box
    And user clicks on Save button(repair)
    Then user clicks edit button(repair)
    Then user edits product in Product to Repair input box
    And user clicks on Save button(repair)
    Then verify that user can edit repair orders

 @CENT-1464
  Scenario: Verify that user can switch Kanban-List view
    When user clicks on Repair modules
    And user clicks Kanban Button(repair)
    Then verify that user can switch kanban view(repair)

 @CENT-1465 @Smoke
  Scenario: Verify that the user can discard changes
    When user clicks on Repair modules
    And user clicks on Create Button(repair)
    And user select the product in Product to Repair input box
    Then user clicks discard button(repair)
    Then verify that user can discard repair orders



