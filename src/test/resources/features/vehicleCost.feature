
  Feature: Vehicle Cost


    Scenario: Verify that user can create a Vehicle Cost
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page
      And User clicks Create button and enter vehicle information and click Save button
      Then User verify Vehicle cost in Cost Details page


    Scenario: Verify that user can not create vehicle cost without Vehicle name
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page
      And User clicks Create button and enter vehicle information without vehicle name and click Save button
      Then User verify error message that Vehicle cost is not created


    Scenario:  Verify that page title is changed to the new Vehicle Cost value after user create the Vehicle Cost
    Given User is logged in the application
    When User click More tab on the right top side and click Fleet then select Vehicle Cost Page
    And User clicks Create button and enter vehicle information
    Then User Verifies the page title is not equal after saving the Vehicle Cost page title


    Scenario:Verify that user can cancel creating by clicking Discard button
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page
      And User clicks Create button and enter vehicle information
      Then User clicks Discard button and to cancel vehicle cost


    Scenario: Verify that Attachment and Action buttons are displayed at the top of the page (after creating a new Vehicle Cost)
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page
      And User clicks Create button and enter vehicle information and click Save button
      Then User verify Attachments and Action button is displayed



    Scenario: Verify that user can find the new created Vehicle Cost value under Vehicle Cost list by using search box
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page then take the vehicle count
      And User clicks Create button and enter vehicle information and click Save button
      Then User verify that the Vehicle cost  value is increased by one after creating new vehicle cost


    Scenario: Verify that user can change Vehicle Cost display to Kanban / List / Graph
      Given User is logged in the application
      When User click More tab on the right top side and click Fleet then select Vehicle Cost Page then take the vehicle count
      And User clicks Create button and enter vehicle information and click Save button
      Then User verify that the Vehicle Cost page can be displayed List, Kanban, Graph
