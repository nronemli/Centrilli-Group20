
@CENT-1451 @Regression
Feature: User should be able to verify
  that notes module works succesfully



  Background: User is on the dashboard as a posmanager
     Given User is logged in the application

    @CENT-1446
    Scenario: Verify that user can create a note
      Then User clicks note button
      And User lans on notes then clicks create button
      And User types something on notes body
      And User clicks save button after write a note
      And Verify that user can create a note

    @CENT-1447 @Smoke
    Scenario: Verify that the user can switch Kanban-List view
      Then User clicks note button
      And User clicks list button
      And Verify that the user can switch Kanban-List view

    @CENT-1448
    Scenario: Verify that the user can discard changes
      Then User clicks note button
      And User lans on notes then clicks create button
      And User types something on notes body
      And User clicks Discard button and to cancel note
      And Verify that the user can discard changes

    @CENT-1449
    Scenario: Verify that the user can edit notes
      Then User clicks note button
      And User lans on notes then clicks create button
      And User types something on notes body
      And User clicks save button after write a note
      Then User clicks edit button
      Then User edits the note
      And User clicks save button after write a note
      And Verify that the user can edit notes

    @CENT-1450
    Scenario: Verify that the user can delete notes
      Then User clicks note button
      And User lans on notes then clicks create button
      And User types something on notes body
      And User clicks save button after write a note
      And User clicks action button
      Then User clicks delete button
      And Verify that the user can delete notes