
Feature: Surveys Functionality

  Background: User is logged in
    Given  User is logged in the application

  Scenario Template: User can create a survey
    When User clicks on Surveys module
    And User clicks create button
    And User enters "<Survey title>"
    And User clicks add an item
    And user enters in the "<Page Title>"
    And user clicks to add an item
    And User enters "<Question Name>" inputBox
    And user chooses Multiple choice option button
    And User clicks add an item to Question
    And user enters in the "<choices>" box
    And User clicks add an item choices button
    And User enters "<choices2>" in the input box
    And user clicks on the Save&Close
    And user clicks Save&Close page button
    Then User clicks save button and should see surveys created
    Examples: Input
      | Survey title                 | Page Title | Question Name            | choices                                                                 | choices2                                                 |
      | Group20-Collaboration Survey | Github     | What is GitHub used for? | GitHub is a code hosting platform for version control and collaboration | Github is a DevOps tool used for source code management. |

  Scenario Template: Verify that user cannot create a survey without typing title (empty title)
    When User clicks on Surveys module
    And User clicks create button
    And User clicks add an item
    And user enters in the "<Page Title>"
    And user clicks Save&Close page button
    Then user clicks save button to see the error message

    Examples: Page title
      | Page Title |
      | Github     |


  Scenario Template: Verify that user can cancel the process by clicking Discard button
    When User clicks on Surveys module
    And User clicks create button
    And User enters "<Survey title>"
    And user clicks Discard button
    And user clicks ok button
    Then user is back on the surveys module

    Examples: Survey title
      | Survey title                 |
      | Group20-Collaboration Survey |


  Scenario Template: Verify that page title is changed to the new survey name after user create the survey
    When User clicks on Surveys module
    And User clicks create button
    And User enters "<Survey title>"
    Then User clicks save and see the title changed to "<Expected Title>"

    Examples: Title
      | Survey title   | Expected Title        |  |
      | Discord Survey | Discord Survey - Odoo |  |


  Scenario Template: Verify that “Survey created” message is displayed at the bottom of the page (after creating a new survey).
    When User clicks on Surveys module
    And User clicks create button
    And User enters "<Survey title>"
    Then User clicks save button and should see surveys created

    Examples: Title
      | Survey title              |  |
      | Team collaboration survey |  |


  Scenario Template: Verify that user can find the new created survey under permanent survey list by using search box
    When User clicks on Surveys module
    And user clicks permanent button
    And user types in the search box "<New survey name partial>"
    Then user sees the new created survey under permanent survey list

    Examples: New Survey name
      | New survey name partial |  |
      | Github                  |  |


  Scenario: Verify that user can change surveys display to Kanban / List
    When User clicks on Surveys module
    And User clicks on list button
    Then user clicks on kanban button

  Scenario Template: Verify that the number of surveys increased 1
    When User clicks on Surveys module and click list to verify number
    And User clicks create button
    And User enters "<Survey title>"
    And User clicks save button
    And user clicks surveys button
    Then user click list and number increased by one

    Examples: Survey name
      | Survey title          |  |
      | Testing survey number |  |




