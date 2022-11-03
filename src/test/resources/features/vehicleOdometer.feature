
Feature: Fleet, Vehicles, Vehicle Odometer Function

  Background: User is logged in
    Given User is logged in the application

    Scenario Template: Verify that users create a vehicle odometer
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user clicks create Button
      And user types "<vehicle>" in the vehicle box
      And user clicks odometer value box
      And user types "<odometer value>" in the odometer value box
      And user clicks save Button-B
      Examples: input
        | vehicle            | odometer value |
        | Volvo/Volvo/BTL 35 | 35             |



    Scenario: Verify that user cannot create a Vehicle Odometer without selecting vehicle
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user clicks create Button
      And user clicks save Button-B
      Then verify that user should see an errorB message



    Scenario: Verify that user can cancel creating by clicking Discard button
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user clicks create Button
      And user clicks discardB Button
      Then users should see the Vehicle Odometer create page again


    Scenario Template: Verify that page title is changed to the new Odometer value
                         after user create the Odometer
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user clicks create Button
      And user types "<vehicle>" in the vehicle box
      And user clicks odometer value box
      And user types "<odometer value>" in the odometer value box
      And user clicks save Button-B
      Then verify that page title include the new "<vehicle>" value after user create the Vehicle Model
        Examples: input
          | vehicle            | odometer value |
          | Volvo/Volvo/BTL 35 | 26             |



    Scenario Template: Verify that “Attachment” and Action buttons are displayed
                       at the top of the page (after creating a new Odometer)
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user clicks create Button
      And user types "<vehicle>" in the vehicle box
      And user clicks odometer value box
      And user types "<odometer value>" in the odometer value box
      And user clicks save Button-B
      Then attachment and actions button are displayed
      Examples: input
        | vehicle            | odometer value |
        | Volvo/Volvo/BTL 35 | 35             |



    Scenario Template: Verify that user can find the new created Odometer value
                       under Odometer list by using search box
      When user clicks more button
      And user clicks fleet button
      And user clicks vehicle odometers button
      And user type "<vehicle>" in the search button
      Then Users should see "<vehicle>" is displayed in the list.
      Examples: input
        | vehicle            |
        | Volvo/Volvo/BTL 35 |


  Scenario: Verify that user can change Odometer display to Kanban, List, Graph
    When user clicks more button
    And user clicks fleet button
    And user clicks vehicle odometers button
    And user clicks kanban Button-B


  Scenario Template: Verify that the number of Odometer increased 1
    When user clicks more button
    And user clicks fleet button
    And user clicks vehicle odometers button
    And user clicks create Button
    And user types "<vehicle>" in the vehicle box
    And user clicks odometer value box
    And user types "<odometer value>" in the odometer value box
    And user clicks save Button-B
    Then the number of odometer is increased
    Examples: input
      | vehicle            | odometer value |
      | Volvo/Volvo/BTL 35 | 35             |


