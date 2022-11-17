Feature: User User should be able to verify Vehicle Contracts Function
  works succesfully

  Background: user is on the login page
    Given user is on the login page


  @CENT-1430
  Scenario: User login scenario
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user cliks on Create button
    And user select a vehicle name "FORD/Granada"
    And user cliks Vehicle Contracts Save button
    Then verify that user see the Vehicle name on page

  @CENT-1431
  Scenario:  User cannot create a Vehicle Contract without selecting vehicle
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user cliks on Create button
    And user cliks Vehicle Contracts Save button
    Then verify that user see the error message

  @CENT-1432
  Scenario: User can cancel creating by clicking Discard button
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user cliks on Create button
    And user clicks Vehicle Contracts Discard Button
    Then Then Verify that user cancel creating by clicking Discard button

    @CENT-1433
  Scenario: Verify that page title is changed to the new Vehicle Contract value after user create the Vehicle Contract
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user cliks on Create button
    And user select a vehicle name "FORD/Granada"
    And user cliks Vehicle Contracts Save button
    Then page title is changed to the new Vehicle Contract value after user create the Vehicle Contract

   @CENT-1434
  Scenario: Verify that “Attachment” and Action buttons are displayed at the top of the page (after creating a new Vehicle Contract)
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user cliks on Create button
    And user select a vehicle name "FORD/Granada"
    And user cliks Vehicle Contracts Save button
    Then Verify that Attachment and Action buttons are displayed at the top of the page

     @CENT-1435
  Scenario: Verify that user can change Vehicle Contract display to Kanban / List / Graph
    When user cliks on More module
    And user cliks on Fleet module
    And user cliks on Vehicles Contracts button
    And user clicks on Kanban List and graph Button
    Then Verify that user can change Vehicle Contract display to Kanban  List Graph

    @CENT-1436
    Scenario: Verify that user can change Vehicle Contract page number by right and left arrow, up right corner of screen
      When user cliks on More module
      And user cliks on Fleet module
      And user cliks on Vehicles Contracts button
      And user cliks cancel in Progress button in the search box
      And user cliks right and left arrows
      Then user can change Vehicle Contract page number by right and left arrow