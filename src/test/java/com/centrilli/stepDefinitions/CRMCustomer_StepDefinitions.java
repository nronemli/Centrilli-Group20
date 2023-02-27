package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.CRMCustomerPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public final class CRMCustomer_StepDefinitions  {

   // BasePage basePage = new BasePage();
    CRMCustomerPage crmCustomerPage = new CRMCustomerPage();
    String beforeCount;
    @When("User clicks on CRM module")
    public void user_clicks_on_crm_module() {
        crmCustomerPage.CrmButton.click();
        BrowserUtil.sleep(4);
    }

    @When("User clicks on Customers")
    public void user_clicks_on_customers() {
        BrowserUtil.sleep(2);
        crmCustomerPage.btn_customers.click();
        BrowserUtil.sleep(4);
    }

    @When("User clicks on Create button")
    public void user_clicks_on_create_button() {
        BrowserUtil.sleep(2);
        crmCustomerPage.btn_create.click();
    }

    @When("User enters {string} name text box")
    public void user_enters_name_text_box(String string) {
        crmCustomerPage.txt_name.sendKeys(string);
    }

    @When("User enters {string} street text box")
    public void user_enters_street_text_box(String string) {
        crmCustomerPage.txt_address.sendKeys(string);
    }

    @When("User enters {string} email address text box")
    public void user_enters_email_address_text_box(String string) {
        crmCustomerPage.txt_email.sendKeys(string);
    }

    @Then("User clicks \\(Customers)save button")
    public void user_clicks_customers_save_button() {
        crmCustomerPage.btn_save.click();
        BrowserUtil.sleep(3);
        //using method to verify title
        String title= Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("nur onemli - Odoo"));
        Driver.closeDriver();
    }

    @And("User clicks to Kanban button")
    public void userClicksToKanbanButton() {
        crmCustomerPage.btn_kanban.click();
        BrowserUtil.sleep(2);
        Driver.closeDriver();
    }

    @Then("user clicks to List button")
    public void userClicksToListButton() {
        BrowserUtil.sleep(3);
        crmCustomerPage.btn_list.click();
        Assert.assertTrue(crmCustomerPage.nameTitleVerification().contains("Name"));
    }

    @And("User clicks discard button")
    public void userClicksDiscardButton() {
        crmCustomerPage.btn_discard.click();
    }

    @And("User clicks OK warning button")
    public void userClicksOKWarningButton() {
        crmCustomerPage.btn_Ok_Warning_Discard.click();
        BrowserUtil.sleep(2);
    }

    @Then("User is on the CRM module")
    public void userIsOnTheCRMModule() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Customers - Odoo"));

    }

    @And("User searches for {string} name on search box")
    public void userSearchesForNameOnSearchBox(String arg0) {
        BrowserUtil.sleep(3);
        crmCustomerPage.txt_searchBox.sendKeys(arg0+ Keys.ENTER);
    }
    @And("User clicks on found {string}")
    public void userClicksOnFound(String arg0) {
       BrowserUtil.sleep(4);
       crmCustomerPage.foundCustomer.click();
    }

    @When("User clicks on CRM module and clicks customers")
    public void userClicksOnCRMModuleAndClicksCustomers() {
        crmCustomerPage.CrmButton.click();
        BrowserUtil.sleep(2);
        crmCustomerPage.btn_customers.click();
        BrowserUtil.sleep(3);
    }

    @And("User clicks on edit button")
    public void userClicksOnEditButton() {
        crmCustomerPage.btn_editCustomer.click();
    }

    @And("User re-enters {string} new name")
    public void userReEntersNewName(String arg0) {
        crmCustomerPage.txt_name.clear();
        BrowserUtil.sleep(2);
        crmCustomerPage.txt_name.sendKeys(arg0);
    }

    @And("User clicks save button\\(customer)")
    public void userClicksSaveButtonCustomer() {
        crmCustomerPage.btn_save.click();
        BrowserUtil.sleep(4);
        beforeCount = crmCustomerPage.newCustomerCounter.getText();
    }

    @Then("User sees edited {string}")
    public void userSeesEdited(String arg0) {
        String actualName = crmCustomerPage.newCustomerName.getText();
        Assert.assertTrue(actualName.contains(arg0));
    }

    @And("User clicks on actions drop down")
    public void userClicksOnActionsDropDown() {
        crmCustomerPage.btn_action.click();
        BrowserUtil.sleep(2);
    }

    @And("User clicks OK button")
    public void userClicksOKButton() {
        BrowserUtil.sleep(2);
        crmCustomerPage.btn_Ok_Confirmation.click();
        BrowserUtil.sleep(2);
        //assertion using custom method
        Assert.assertEquals(beforeCount,crmCustomerPage.returnCustomerAfterCount());
    }

    @And("User clicks delete button\\(customer)")
    public void userClicksDeleteButtonCustomer() {
        crmCustomerPage.btn_delete_actions.click();
        BrowserUtil.sleep(3);
    }
}
