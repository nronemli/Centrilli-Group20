@wip
Feature: Surveys Functionality
  Background: User is logged in
    Given User is logged in the application

    Scenario Template: User can create a survey
      When User licks on Surveys module
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



