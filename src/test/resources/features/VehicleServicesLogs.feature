@Regression
@CENT-1416
Feature: Create Vehicle Service Logs

  AC: As a user I should be able to create A Vehicle service Logs


  Background: user successfully accessed to login page with valid credentials
    Given is on the home page

  @CENT-1409
  Scenario: Vehicle Service Logs scenario
    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"

    Then user clicks the save button


  @CENT-1410
  Scenario: Error message appears

    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
   Then user clicks Save button without selecting Vehicle and see "The following fields are invalid. Vehicle"


  @CENT-1411
  Scenario: User can cancel creating by clicking Discard button

    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"
    Then user user clicks Discard button and see Warning message and clicks Ok Button

  @CENT-1412
  Scenario: : User can see that title is changed to the new Service Logs value

    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"
    Then User clicks the save and see the title changed to "Audi/A1/-Odoo"


  @CENT-1413
  Scenario: verify that “Attachment” and Action buttons are displayed
    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"
    Then user clicks save button and Attachment and Action buttons are displayed

  @CENT-1414
  Scenario: new created Service Logs value under Service Logs list by using search box.
    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"
    And user enters the Save button
    And user clicks Vehicles services Logs Button
   Then user enters new created value "Audi/A1/" under Service Logs list by using search box.

  @CENT-1415
  @cydeo
  Scenario: user change Service Logs display to Kanban, list, Graph
    When user clicks on More button
    When user clicks on Fleet module
    Then user clicks the Vehicle Service Logs module
    And user clicks Create button
    And user clicks  Vehicle title and enters "Audi/A1/"
    And user enters the Save button
    And user clicks Vehicles services Logs Button
    And user clicks on List button and see list of "Vehicles"
    And user clicks on Kanban button and see "Repaired and Maintenanced" vehicles
    Then user clicks in Graph button and see "Measures Stacked" vehicles