@Regression
Feature: Inventory Functionality
  As a user (posmanager) I should be able to create a new product, search and view the products that I have created,
  display the products with different styles and see the total number of different types of products I have.

  Background: For the scenarios in this future file, user is expected to be logged in as posmanager
  and is in the Products page under Inventory module
    Given User is on Products page under Inventory module

  @CENT-1336
  Scenario: Verify that user can create a Product
    When User clicks on Create button next to the Import button
    And User types "Swan 2 Slice Nordic Style Toaster" product name into Product Name input box
    And User clicks on Save button next to the Discard button
    Then Verify that "Swan 2 Slice Nordic Style Toaster" product name is contained on the name of the page.

  @CENT-1337
  Scenario: Verify that user cannot create a Product without typing name (empty name)
    When User clicks on Create button next to the Import button
    And User clicks on Save button next to the Discard button
    Then Verify that warning message appears on the top right corner of the page

  @CENT-1338
  Scenario: Verify that user can cancel creating by clicking Discard button
    When User clicks on Create button next to the Import button
    And User clicks on Discard button next to the Save button
    Then Verify that current title of the page is  "Products - Odoo"

  @CENT-1339
  Scenario: Verify that page title contains the new Product name after user create the Product
    When User clicks on Create button next to the Import button
    And User types "Swan 2 Slice Nordic Style Toaster" product name into Product Name input box
    And User clicks on Save button next to the Discard button
    Then Verify that "Swan 2 Slice Nordic Style Toaster" product name is contained on the title of the page.

  @CENT-1340
  Scenario: Verify that “Product Template created” message is displayed at the bottom of the page (after creating a new Product)
    When User clicks on Create button next to the Import button
    And User types "Swan 2 Slice Nordic Style Toaster" product name into Product Name input box
    And User clicks on Save button next to the Discard button
    Then Verify that creation message is displayed at the bottom of the page (after creating a new Product)

  @CENT-1341
  Scenario: Verify that user can find the new created Product under Product list by using search box
    When User clicks on Create button next to the Import button
    And User types "Swan 2 Slice Nordic Style Toaster" product name into Product Name input box
    And User clicks on Save button next to the Discard button
    And User clicks on the Products hyperlink  on the left side of the page
    And User types the "Swan 2 Slice Nordic Style Toaster" product name into Search box on the top right corner of the page and press enter
    Then Verify that user can find the new created Product under Product list by using search box

  @CENT-1341
  Scenario: Verify that user can change Product display to Kanban / List
    When User clicks on the List button at the top right corner of the page
    And User clicks on the Kanban button at the top right corner of the page
    Then Verify that user changed back to Kanban view

  @CENT-1341
  Scenario: Verify that the number of Product increased by 1
    When User views the current total product number
    And User clicks on Create button next to the Import button
    And User types "Swan 2 Slice Nordic Style Toaster" product name into Product Name input box
    And User clicks on Save button next to the Discard button
    And User clicks on the Products hyperlink  on the left side of the page
    Then Verify that the number of Product (at the top right corner of the page, left to the left arrow button) increased by one













