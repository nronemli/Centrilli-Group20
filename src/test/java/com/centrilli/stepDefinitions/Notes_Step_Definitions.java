package com.centrilli.stepDefinitions;
import com.centrilli.pages.NotesPage;
import com.centrilli.utilities.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public final class Notes_Step_Definitions {

    NotesPage notesPage = new NotesPage();

    @Then("User clicks note button")
    public void user_clicks_note_button() {
        BrowserUtil.sleep(2);
        notesPage.notes.click();
    }
    @Then("User lans on notes then clicks create button")
    public void user_lans_on_notes_then_clicks_create_button() {
        BrowserUtil.sleep(3);
        notesPage.noteCreate.click();

    }
    @Then("User types something on notes body")
    public void user_types_something_on_notes_body() {

        //BrowserUtil.waitForVisibility(notesPage.tags);
        BrowserUtil.sleep(6);
        notesPage.tags.click();
        BrowserUtil.sleep(4);
        notesPage.tagChoose.click();
        BrowserUtil.sleep(4);
        notesPage.noteBody.sendKeys("hello");


    }
    @Then("User clicks save button after write a note")
    public void user_clicks_save_button_after_write_a_note() {
        BrowserUtil.sleep(3);
        notesPage.noteSavebutton.click();
    }
    @Then("Verify that user can create a note")
    public void verify_that_user_can_create_a_note() {
        BrowserUtil.waitForVisibility(notesPage.notesEditButton);
        Assert.assertTrue(notesPage.notesEditButton.isDisplayed());
    }

    @And("User clicks list button")
    public void userClicksListButton() {
        notesPage.listView.click();
    }

    @And("Verify that the user can switch Kanban-List view")
    public void verifyThatTheUserCanSwitchKanbanListView() {
        Assert.assertTrue(notesPage.verificationKanbanList.isDisplayed());
    }

    @And("User clicks Discard button and to cancel note")
    public void userClicksDiscardButtonAndToCancelNote() {
        BrowserUtil.sleep(2);
        notesPage.notesDiscardButton.click();
        BrowserUtil.waitForVisibility(notesPage.discardWarning);
        notesPage.warningOkButton.click();
    }

    @And("Verify that the user can discard changes")
    public void verifyThatTheUserCanDiscardChanges() {
        BrowserUtil.sleep(3);
        Assert.assertTrue(notesPage.noteCreate.isDisplayed());
    }

    @Then("User clicks edit button")
    public void userClicksEditButton() {
        BrowserUtil.sleep(2);
        notesPage.notesEditButton.click();
    }

    @Then("User edits the note")
    public void userEditsTheNote() {
        notesPage.noteBody.clear();
        BrowserUtil.sleep(2);
        notesPage.noteBody.sendKeys("edited note from intellj");
    }

    @And("Verify that the user can edit notes")
    public void verifyThatTheUserCanEditNotes() {
        Assert.assertTrue(notesPage.newNote.isDisplayed());
    }


    @Then("User clicks action button")
    public void user_clicks_action_button() {
        //BrowserUtil.waitForVisibility(notesPage.notesEditButton);
        BrowserUtil.sleep(5);
        notesPage.actionButton.click();
        BrowserUtil.sleep(2);
    }
    @Then("User clicks delete button")
    public void user_clicks_delete_button() {
        //BrowserUtil.waitForVisibility(notesPage.deleteButton);
        notesPage.deleteButton.click();
        BrowserUtil.waitForVisibility(notesPage.confirmationDeleteButton);
        notesPage.confirmationOkButton.click();
    }
    @Then("Verify that the user can delete notes")
    public void verify_that_the_user_can_delete_notes() {
        BrowserUtil.sleep(3);
        Assert.assertTrue(notesPage.noteCreate.isDisplayed());
    }



}
