@CENT-1286
Feature: Vehicle Fuel Logs page functionality

 Background:User is logged in as posmanager and lands on Vehicle Fuel Logs page via Fleet Module
   Given User is logged in the application
   When user clicks more button
   And User clicks on fleet button
   And User clicks on Vehicle Fuel Logs module


  @CENT-1375
   Scenario: User creates a vehicle fuel log
     Given User clicks on create button
     And User clicks on vehicle dropdown input box
     And User clicks on vehicle option
     And User enters odometer value
     And User enters liter value
     And User enters price value
     Then User clicks on save button and sees fuel log created


  @CENT-1383
   Scenario: User cannot create a Vehicle Fuel Logs without selecting vehicle
    Given User clicks on create button
    Then User clicks on save button and sees error message


  @CENT-1394
   Scenario: User can cancel creating by clicking Discard button
    Given User clicks on create button
    Then User clicks on discard button and returns back fuel log page


  @CENT-1395
   Scenario: User sees page title is changed to the new Vehicle Fuel Logs value after user creates the Vehicle Fuel Log
    Given User creates a vehicle fuel log
    Then User sees title is changed to Vehicle Fuel Logs


  @CENT-1396
   Scenario: User sees Attachment and Actions modules after creation fuel log
    Given User creates a vehicle fuel log
    Then User sees Attachment and Actions modules displayed


  @CENT-1397
   Scenario Template: User can find the new created Vehicle Fuel Logs value under Vehicle Fuel Logs list by using search box
    Given User creates a vehicle fuel log
    And User clicks on Vehicle Fuel Logs module
    And User enters "<vehicle fuel log value>" inside vehicle fuel log searchbox
    And User clicks on kanban view and sees new fuel log displayed
    Examples: New Fuel Log Value
      | vehicle fuel log value |  |
      | Audi/A1/               |  |


  @CENT-1398
   Scenario: User can change Vehicle Fuel Logs page display to Kanban / List / Graph
    Given User clicks on kanban view button
    Then User clicks on graph view button
    And User clicks on list view button


  @CENT-1399
   Scenario: User can change Vehicle Fuel Logs page number by right and left arrow, up right corner of screen
    Given The user clicks on the X mark on the Vehicle label inside the Search input box
    Then User clicks on the right arrow button to change the page number
    And User clicks on the left arrow button to change the page number


  @CENT-1400
   Scenario: User sees that the number of Vehicle Fuel logs increased by 1
    Given The user clicks on the X mark on the Vehicle label inside the Search input box and sees the number of the total items
    Given User creates a vehicle fuel log
    And User clicks on Vehicle Fuel Logs module
    Given The user clicks on the X mark again and sees number of logs increased








