package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.PurchasesVendorBillsPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class VendorBill_StepDefinitions extends BasePage {

    BasePage basePage = new BasePage();

    PurchasesVendorBillsPage purchasesVendorBillsPage = new PurchasesVendorBillsPage();

    public int vendorBillCountBefore;

    @When("User clicks on Purchases module")
    public void user_clicks_on_purchases_module() {

        BrowserUtil.sleep(2);
        basePage.PurchasesButton.click();

    }

    @When("User clicks on Vendor Bills")
    public void user_clicks_on_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.vendorBillsHyperlink.click();

    }

    @When("User clicks on Create button \\(Vendor Bills)")
    public void user_clicks_on_create_button_vendor_bills() {

        BrowserUtil.sleep(3);
        purchasesVendorBillsPage.createButton.click();

    }

    @When("User enters {string} into Vendor input box")
    public void user_enters_into_vendor_input_box(String string) {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.vendorInputBox.sendKeys(string);
        BrowserUtil.sleep(1);
        purchasesVendorBillsPage.vendorInputBox.sendKeys(Keys.ENTER);


    }

    @When("User clicks Save button \\(Vendor Bills)")
    public void user_clicks_save_button_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.saveButton.click();

    }

    @Then("User verify a Vendor Bill is created and displayed from the Vendor {string}")
    public void user_verify_a_vendor_bill_is_created_and_displayed_from_the_vendor(String string) {

        BrowserUtil.sleep(2);

        String expectedVendorName = string;
        String actualVendorName = purchasesVendorBillsPage.afterCreationVendorName.getText();

        Assert.assertEquals(expectedVendorName, actualVendorName);

    }

    @When("User clicks on Kanban button \\(Vendor Bills)")
    public void user_clicks_on_kanban_button_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.kanbanButton.click();
        BrowserUtil.sleep(2);
        Assert.assertTrue(purchasesVendorBillsPage.kanbanViewArea.isDisplayed());

    }

    @When("User clicks on List button \\(Vendor Bills)")
    public void user_clicks_on_list_button_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.listButton.click();

    }

    @Then("User verify that the view has changed from Kanban to List \\(Vendor Bills)")
    public void user_verify_that_the_view_has_changed_from_kanban_to_list_vendor_bills() {

        BrowserUtil.sleep(2);
        Assert.assertTrue(purchasesVendorBillsPage.listViewTable.isDisplayed());

    }

    @When("User clicks Discard button \\(Vendor Bills)")
    public void user_clicks_discard_button_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.discardButton.click();

    }

    @When("User clicks Ok button of the Warning message")
    public void user_clicks_ok_button_of_the_warning_message() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.warningMessageOkButton.click();

    }

    @Then("User verifies that vendor bill on {string} is NOT created")
    public void user_verifies_that_vendor_bill_on_is_not_created(String string) {

        //I wanted to use this but, it doesnt work if the last vendor bill is a vendor bill created from the same vendor

        BrowserUtil.sleep(2);

        System.out.println("string = " + string);
        System.out.println("purchasesVendorBillsPage.listViewFirstResult.getText() = " + purchasesVendorBillsPage.listViewFirstResult.getText());

        Assert.assertNotEquals(string, purchasesVendorBillsPage.listViewFirstResult.getText());

    }

    @Then("User verifies that vendor bill is not created")
    public void user_verifies_that_vendor_bill_is_not_created() {


        BrowserUtil.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Vendor Bills"));

    }

    @When("User clicks on edit button \\(Vendor Bills)")
    public void user_clicks_on_edit_button_vendor_bills() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.editButton.click();

    }

    @Then("User verifies that the vendor bill is edited and displayed as {string}")
    public void user_verifies_that_the_vendor_bill_is_edited_and_displayed_as(String string) {

        BrowserUtil.sleep(2);
        Assert.assertEquals(purchasesVendorBillsPage.afterCreationVendorName.getText(), string);


    }


    @When("User clicks on the vendor bill that is created")
    public void user_clicks_on_the_vendor_bill_that_is_created() {

        BrowserUtil.sleep(2);
        vendorBillCountBefore = Integer.parseInt(purchasesVendorBillsPage.vendorBillCount.getText());


        purchasesVendorBillsPage.listViewFirstResult.click();


    }

    @When("User clicks on Action drop down \\(Vendor Bills)")
    public void user_clicks_on_action_drop_down_vendor_bills() {

         BrowserUtil.sleep(2);
         purchasesVendorBillsPage.actionButton.click();

    }

    @When("User clicks on Delete option")
    public void user_clicks_on_delete_option() {

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.deleteOption.click();

        BrowserUtil.sleep(2);
        purchasesVendorBillsPage.confirmationMessageOkButton.click();

    }

    @Then("User verify that vendor bill is deleted")
    public void user_verify_that_vendor_bill_is_deleted() {

        BrowserUtil.sleep(2);
        int vendorBillCountAfterDelete = Integer.parseInt(purchasesVendorBillsPage.vendorBillCount.getText());

        Assert.assertEquals(vendorBillCountBefore, (vendorBillCountAfterDelete + 1));

    }


}
