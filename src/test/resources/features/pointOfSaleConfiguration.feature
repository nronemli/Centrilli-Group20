
  Feature:POS Manager should be able to create new Point Of Sale Configuration

    Background: User is on the dashboard as a posmanager
      Given User is logged in the application


    Scenario: Verify that user can create a new  Point Of Sale
      Then User clicks Point of Sale module
      And User clicks on Point of Sale button on the left side
      And User clicks on Create Button
      And User enters name Point of Sale name text box
      And User select Operation Type
      And User drop down to Inventory module
      Then User clicks Save button and verify


    Scenario: User can switch Kanban List view
      When User clicks Point of Sale module
      And User clicks on Point of Sale button on the left side
      Then User clicks to List button
      Then User click to Kanban button

  Scenario: User can Discard changes
    Then User clicks Point of Sale module
    And User clicks on Point of Sale button on the left side
    And User clicks on Create Button
    And User enters name Point of Sale name text box
    And User select Operation Type
    And User drop down to Inventory module
    Then User clicks Discard button and verify


    Scenario: Verify that user can create a new  Point Of Sale
      Then User clicks Point of Sale module
      And User clicks on Point of Sale button on the left side
      And User clicks on Create Button
      And User enters name Point of Sale name text box
      And User select Operation Type
      And User drop down to Inventory module
      Then User clicks Save button and verify
      Then User clicks Edit button






















