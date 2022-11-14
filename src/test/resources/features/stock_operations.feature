@Regression
Feature: Pos manager should be able to create Inventory / Transfers / Stock operations


  Background: User is logged in
    Given User is logged in the application


    Scenario Template: Verify that the user can create new Stock operation

      When user clicks inventory button
      And user clicks transfers button
      And user clicks Create Button
      #And user clicks partner box
      And user types "<partner>"
      And user clicks Additional Info button
      And user clicks Operation Type
      And user type "<Operation Type>"
      Then user clicks save button

      Examples: input
      |partner|Operation Type|
      | AAAAAA      |My Company, Chicago|


  Scenario: Verify that the user can switch Kanban-List view
    When user clicks inventory button
    And user clicks transfers button
    And user clicks kanban Button-B


    Scenario Template: Verify that the user can discard changes

      When user clicks inventory button
      And user clicks transfers button
      And user clicks Create Button
      And user types "<partner>"
      And user clicks Additional Info button
      And user clicks Operation Type
      And user type "<Operation Type>"
      Then user clicks discardB Button

      Examples: input
        |partner|Operation Type|
        | AAAAAA      |My Company, Chicago|

    @Smoke
    Scenario Template: Verify that the user can edit Stock operation

      When user clicks inventory button
      And user clicks transfers button
      And user clicks Create Button
      And user types "<partner>"
      And user clicks Additional Info button
      And user clicks Operation Type
      And user type "<Operation Type>"
      And user clicks save button
      Then user clicks Edit button

      Examples: input
        |partner|Operation Type|
        | AAAAAA      |My Company, Chicago|




    Scenario Template: AC5 Verify that the user can delete Stock operation

      When user clicks inventory button
      And user clicks transfers button
      And user clicks search box
      And user type "<partner>" in search box
      And user clicks small select box
      And user clicks action button
      And user clicks delete35 button
      Then user clicks ok button in deleting


      Examples: input
      |partner|
      | AAAAAA      |



