
@CENT-1360
Feature: User should be able to verify
  sales functionality works succesfully as a salesmanager


  Background: user is on the login page
    Given user is on the login page

  @CENT-1352
  Scenario Outline: User login scenario

    When user clicks on sales module and then customers module
    And user clicks create button
    And user types a customer "<Name>"
    And user clicks create contact button and type contact "<Name>"
    Then user clicks save button
    And verify that user see the customer name on page

    Examples:
    |Name|
    |Ali Gungor|



  @CENT-1357
  Scenario: Verify that user can cancel creating by clicking Discard button
    When user clicks on sales module and then customers module
    And user clicks create button
    And User click on discard button
    Then Verify that user cancel creating by clicking Discard button

  @CENT-1353
  Scenario Outline: Verify that page title is changed to the new Customer name after user create the Customer

    When user clicks on sales module and then customers module
    And user clicks create button
    And user types a customer "<Name>"
    And user clicks create contact button and type contact "<Name>"
    Then user clicks save button
    And Verify that page title is changed to the new Customer name after user create the Customer "<Name>"


    Examples:
      |Name|
      |Ali Gungor|

    @CENT-1354
    Scenario Outline: Verify that “Contact created” message is displayed at the

    When user clicks on sales module and then customers module
    And user clicks create button
    And user types a customer "<Name>"
    And user clicks create contact button and type contact "<Name>"
    Then user clicks save button
    And Verify that “Contact created” message is displayed at the

    Examples:
      |Name|
      |Ali Gungor|

      @CENT-1355
      Scenario Outline: Verify that user can find the new created Customer under Customers list by using search box.

    When user clicks on sales module and then customers module
    And user clicks create button
    And user types a customer "<Name>"
    And user clicks create contact button and type contact "<Name>"
    Then user clicks save button
    And User clicks customers clicks searchbox and type "<Name>" and press enter
    And Verify that user can find the "<Name>" under Customers list by using search box.


    Examples:
      |Name|
      |Ali Gungor|

        @CENT-1358
  Scenario: Verify that user can change Customers display to Kanban / List
    When user clicks on sales module and then customers module
    And user clicks list button
    Then Verify that user can change Customers display  Kanban to List



    @CENT-1356
    Scenario Outline: Verify that all Customers number increased 1

    When user clicks on sales module and then customers module "<Name>" and get the customer amount before create,verify



    Examples:
      |Name|
      |Ali Gungor|

  @CENT-1359
  Scenario: Verify that user cannot create a Customer without typing name (empty name)
    When user clicks on sales module and then customers module
    And user clicks create button
    Then user clicks save button
    And verify that user cant save without typing name















