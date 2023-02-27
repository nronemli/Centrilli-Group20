package com.centrilli.stepDefinitions;

import com.centrilli.pages.ContactsPage;

import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public final class Contacts_StepDefinitions {


    ContactsPage contactsPage = new ContactsPage();
    String firstTitle;
    String secondTitle;

    @When("user clicks on Contact button")
    public void user_clicks_on_contact_button() {

        BrowserUtil.sleep(2);
        contactsPage.ContactsButton.click();
        BrowserUtil.sleep(2);

    }

    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {

        BrowserUtil.sleep(2);
        contactsPage.createBtn.click();
        BrowserUtil.sleep(2);
    }

    @When("user clicks Name box and enters {string}")
    public void user_clicks_name_box_and_enters(String string) {

        contactsPage.NameBtn.sendKeys("Denis");

    }

    @When("user clicks the Save button")
    public void user_clicks_the_save_button() {
        BrowserUtil.sleep(2);
        contactsPage.SaveBtn.click();
        firstTitle = Driver.getDriver().getTitle();
        System.out.println("firstTitle = " + firstTitle);

    }

    @Then("verify that user can create a new contact")
    public void verify_that_user_can_create_a_new_contact() {

        BrowserUtil.waitForVisibility(contactsPage.VerifyDone);
        contactsPage.VerifyDone.isDisplayed();
    }

    @When("user clicks Kanban button")
    public void user_clicks_kanban_button() {
        BrowserUtil.sleep(2);
        contactsPage.KanbanBtn.click();
        BrowserUtil.sleep(3);

    }

    @When("user clicks List button and switches the view")
    public void user_clicks_list_button_and_switches_the_view() {

        BrowserUtil.sleep(2);
        contactsPage.ListBtn.click();
        BrowserUtil.sleep(3);
        Assert.assertTrue(contactsPage.ListPageDisplayed.isDisplayed());
    }

    @When("user clicks the Discard button")
    public void user_clicks_the_discard_button() {
        BrowserUtil.sleep(3);
        contactsPage.DiscardBtn.click();
        BrowserUtil.sleep(3);

    }

    @When("user see the warning pop up message")
    public void user_see_the_warning_pop_up_message() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(contactsPage.WarningMsj.isDisplayed());
        BrowserUtil.sleep(2);
    }

    @Then("user should click Ok button")
    public void user_should_click_ok_button() {
        BrowserUtil.sleep(2);
        contactsPage.OkBtn.click();
        BrowserUtil.sleep(3);
    }

    @When("user clicks Edit button")
    public void user_clicks_edit_button() {
        contactsPage.EditBtn.click();
        BrowserUtil.sleep(2);

    }

    @When("user clicks Address button and enters {string}")
    public void user_clicks_address_button_and_enters(String string) {

        contactsPage.StreetBtn.sendKeys("Frederick 5");
        BrowserUtil.sleep(3);

    }

    @Then("user verifies that can edit the page")
    public void user_verifies_that_can_edit_the_page() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(contactsPage.SheetDis.isDisplayed());

    }


    @When("user clicks Action dropdown")
    public void user_clicks_action_dropdown() {
        BrowserUtil.sleep(2);
        contactsPage.ActionBtn.click();

    }

    @When("user clicks Delete button")
    public void user_clicks_delete_button() {
        BrowserUtil.sleep(2);
        contactsPage.DeleteBtn.click();
        secondTitle = Driver.getDriver().getTitle();
        System.out.println("secondTitle = " + secondTitle);

    }

    @When("user see Confirmation pop up")
    public void user_see_confirmation_pop_up() {

      BrowserUtil.waitForVisibility(contactsPage.ConfTitle);

    }

    @When("user clicks Ok button\\(contacts)")
    public void user_clicks_ok_button_contacts() {
        contactsPage.OkButton.click();
    }
    //@Then("verify that user can delete contacts details")
    //public void verify_that_user_can_delete_contacts_details() {

      // BrowserUtil.sleep(3);
        //Assert.assertTrue(contactsPage.VerifyPage.isDisplayed());

    @Then("user is back to Contacts page")
    public void user_is_back_to_contacts_page() {
        BrowserUtil.sleep(3);
        Assert.assertTrue(contactsPage.ContactsPage.isDisplayed());
        BrowserUtil.sleep(2);



    }
    @And("Verify that user can delete contact")
    public void verifyThatUserCanDeleteContact() {
        BrowserUtil.sleep(3);
        Assert.assertNotEquals("The same", firstTitle, secondTitle);


    }
}








