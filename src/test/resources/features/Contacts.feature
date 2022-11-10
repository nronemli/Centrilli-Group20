Feature: Create new Contacts

  AC: As a POS Manager should be able to create CONTACTS

  Background: user successfully accessed to login with valid credentials
    Given is on the home page


  Scenario: Create a New Contact
    When user clicks on Contact button
    When user clicks on Create button
    When user clicks Name box and enters "Denis"
    And user clicks the Save button
    Then verify that user can create a new contact


    Scenario: Switch Kanban-List view
      When user clicks on Contact button
      And user clicks Kanban button
      And user clicks List button and switches the view



    Scenario: User can discard changes

    When user clicks on Contact button
    And user clicks on Create button
    And user clicks Name box and enters "Denis"
    And user clicks the Discard button
    And user see the warning pop up message
    Then user should click Ok button


    Scenario: user can edit contact
      When user clicks on Contact button
      And user clicks on Create button
      And user clicks Name box and enters "Denis"
      And user clicks the Save button
      And user clicks Edit button
      And user clicks Address button and enters "Frederick 5"
      And user clicks Save button
      Then user verifies that can edit the page

  @project
    Scenario: user can delete contact
      When user clicks on Contact button
      And user clicks on Create button
      And user clicks Name box and enters "Denis"
      And user clicks Address button and enters "Frederick 5"
      And user clicks the Save button
      And user clicks Action dropdown
      And user clicks Delete button
      And user see Confirmation pop up
      And user clicks Ok button(contacts)
      Then user verifies that he is back to Contacts page






