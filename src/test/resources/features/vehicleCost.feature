@wip
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

