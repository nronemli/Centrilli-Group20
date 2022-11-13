@CENT-1473
Feature: POS Manager should be able to create new PURCHASE - Vendor Bill

  Background: User is logged in
    Given User is logged in the application

  @CENT-1468
  Scenario Outline: Verify that the user can create new  Vendor Bill
    When User clicks on Purchases module
    And User clicks on Vendor Bills
    And User clicks on Create button (Vendor Bills)
    And User enters "<Vendor>" into Vendor input box
    And User clicks Save button (Vendor Bills)
    Then User verify a Vendor Bill is created and displayed from the Vendor "<Vendor>"

    Examples: Data
      | Vendor |
      | Ova    |
      | Sutas  |

  @CENT-1469
  Scenario: Verify that the user can switch Kanban-List view
    When User clicks on Purchases module
    And User clicks on Vendor Bills
    And User clicks on Kanban button (Vendor Bills)
    And User clicks on List button (Vendor Bills)
    Then User verify that the view has changed from Kanban to List (Vendor Bills)

  @CENT-1470
  Scenario: Verify that the user can discard changes
    When User clicks on Purchases module
    And User clicks on Vendor Bills
    And User clicks on Create button (Vendor Bills)
    And User enters "Muhavzkasku" into Vendor input box
    And User clicks Discard button (Vendor Bills)
    And User clicks Ok button of the Warning message
    Then User verifies that vendor bill is not created

  @CENT-1471
  Scenario: Verify that the user can edit Vendor Bill
    When User clicks on Purchases module
    And User clicks on Vendor Bills
    And User clicks on Create button (Vendor Bills)
    And User enters "vemedu" into Vendor input box
    And User clicks Save button (Vendor Bills)
    And User clicks on edit button (Vendor Bills)
    And User enters "-jagardoden" into Vendor input box
    And User clicks Save button (Vendor Bills)
    Then User verifies that the vendor bill is edited and displayed as "vemedu-jagardoden"

  @CENT-1472
  Scenario: Verify that the user can delete Vendor Bill
    When User clicks on Purchases module
    And User clicks on Vendor Bills
    And User clicks on Create button (Vendor Bills)
    And User enters "minkropparradd" into Vendor input box
    And User clicks Save button (Vendor Bills)
    And User clicks on Vendor Bills
    And User clicks on the vendor bill that is created
    And User clicks on Action drop down (Vendor Bills)
    And User clicks on Delete option
    And User clicks on Vendor Bills
    Then User verify that vendor bill is deleted








