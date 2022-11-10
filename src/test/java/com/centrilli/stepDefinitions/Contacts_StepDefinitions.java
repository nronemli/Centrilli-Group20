package com.centrilli.stepDefinitions;

import com.centrilli.pages.ContactsPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtil;
import com.sun.jna.Library;
import com.zaxxer.sparsebits.SparseBitSet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jcajce.provider.symmetric.IDEA;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Contacts_StepDefinitions {



    ContactsPage contactsPage = new ContactsPage();
    @When("user clicks on Contact button")
    public void user_clicks_on_contact_button() {

        BrowserUtil.sleep(5);
        contactsPage.ContactsButton.click();
        BrowserUtil.sleep(2);

    }
    @When("user clicks on Create button")
    public void user_clicks_on_create_button() {

        BrowserUtil.sleep(3);
        contactsPage.createBtn.click();
        BrowserUtil.sleep(2);
    }

    @When("user clicks Name box and enters {string}")
    public void user_clicks_name_box_and_enters(String string) {

    BrowserUtil.sleep(2);
    contactsPage.NameBtn.sendKeys("Denis");

    }

    @When("user clicks the Save button")
    public void user_clicks_the_save_button() {
        BrowserUtil.sleep(2);
        contactsPage.SaveBtn.click();
        //81 - 1
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

    }
    @When("user see Confirmation pop up")
    public void user_see_confirmation_pop_up() {

        BrowserUtil.waitForVisibility(contactsPage.ConfTitle);

    }
    @Then("user verifies that he is back to Contacts page")
    public void user_verifies_that_he_is_back_to_contacts_page() {

        BrowserUtil.sleep(3);
       Assert.assertTrue(contactsPage.HomePage.isDisplayed());
        BrowserUtil.sleep(2);




    }


    @And("user clicks Ok button\\(contacts)")
    public void userClicksOkButtonContacts() {
        //assertion
        //80
        //81-1 == 80
    }
}
