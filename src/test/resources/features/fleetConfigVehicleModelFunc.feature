@Regression
@CENT-1382
  Feature: Verify that  Fleet / Configuration / Vehicle Model Function works successfully as a PosManager

  Background:
  Given User is logged in the application

  @CENT-1372
  Scenario Outline: Verify that user can create a Vehicle Model

    When user clicks more module and then fleet module
    And user clicks vehicle model module
    And user clicks Create Button
    And user types Model Name "<Model Name>"
    And user types Make "<Make>"
    And user clicks Save button
    And user clicks create button on popup page
    And user clicks Save button
    Then verify that user see new Vehicle Model page

    Examples: Model name and Make
      | Model Name | Make |
      | F1         | Fori |

    @CENT-1374
    Scenario: Verify that user cannot create a Vehicle Model without selecting vehicle
      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user clicks Create Button
      And user clicks Save button
      Then verify that user should see an error message

    @CENT-1376
    Scenario: Verify that user can cancel creating by clicking Discard button
      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user clicks Create Button
      And user types Model Name "A3"
      And user types Make "Audi"
      And user clicks Discard button
      Then verify that user should see warning popup message
      And user clicks Ok button
      Then verify that User should back on the Vehicle Model page

  @CENT-1377
  Scenario Outline: Verify that page title is changed to the new Vehicle Model value after user create the Vehicle Model

    When user clicks more module and then fleet module
    And user clicks vehicle model module
    And user clicks Create Button
    And user types Model Name "<Model Name>"
    And user types Make "<Make>"
    And user clicks Save button
    And user clicks create button on popup page
    And user clicks Save button
    Then verify that page title is changed to the new "<Make>/<Model Name>" value after user create the Vehicle Model


    Examples: Model name and Make
      | Model Name | Make |
      | F1         | Fori |

   @CENT-1378
    Scenario Outline:  Verify that Attachment and Action buttons are displayed at the top of the page (after creating a new Vehicle Model).

      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user clicks Create Button
      And user types Model Name "<Model Name>"
      And user types Make "<Make>"
      And user clicks Save button
      And user clicks create button on popup page
      And user clicks Save button
      Then verify that User should see Attachment  and Action buttons are displayed at the top of the new Vehicle Model page

      Examples: Model name and Make
        | Model Name | Make |
        | F1         | Fori |


    @CENT-1379
    Scenario Outline: Verify that user can find the new created Vehicle Model value under Vehicle Model list by using search box

      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user types the newly created vehicle model "<Make>" in the search box.
      Then user should see new vehicle model "<Make>" on the page

    Examples: Model name and Make
      | Model Name | Make |
      | F1         | Fori |

    @CENT-1380
    Scenario: Verify that user can change Vehicle Model page number by right and left arrow, up right corner of screen.
      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user clicks on Make Close button in the search box
      And user clicks on the right arrow
      And verify that Vehicle Model page number changed
      And user clicks on the left arrow
      Then verify that Vehicle Model page number changed


    @CENT-1381
    Scenario Outline:  Verify that the number of Vehicle Models increased 1

      When user clicks more module and then fleet module
      And user clicks vehicle model module
      And user clicks on Make Close button
      And user clicks Create Button
      And user types Model Name "<Model Name>"
      And user types Make "<Make>"
      And user clicks Save button
      And user clicks create button on popup page
      And user clicks Save button
      And user clicks vehicle model module
      And user clicks on Make Close button and see page numbers
      Then verify that User should be able see  Vehicle Models increase one

      Examples: Model name and Make
        | Model Name | Make |
        | F1         | Fori |



