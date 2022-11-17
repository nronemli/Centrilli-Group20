package com.centrilli.stepDefinitions;

import com.centrilli.pages.ROPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RO_StepDefinitions {

    ROPage roPage = new ROPage();

    @When("User clicks on repairs button")
    public void user_clicks_on_repair_button (){
        roPage.repairButton.click();
        roPage.formerFirstRepairOrderNameOnTheList = roPage.firstRepairOrderOnTheList.getText();

    }

    @And("User clicks on create button for Repair Orders Functionality")
    public void userClicksOnCreateButtonForRepairOrdersFunctionality() {
        roPage.createButtonForRepairOrders.click();
        BrowserUtil.sleep(5);
    }


    @And("User types {string} inside product to repair input box")
    public void userTypesInsideProductToRepairInbutBox(String arg0) {
        roPage.productToRepairInputBox.sendKeys(arg0);
        BrowserUtil.sleep(10);
    }

    @And("User selects the product shown in the dropdown")
    public void userSelectsTheProductShownInTheDropdown() {
        roPage.productInDropdown.click();
        BrowserUtil.sleep(3);
    }

    @And("User clicks on save button for repair order functionality")
    public void userClicksOnSaveButtonForRepairOrderFunctionality() {
        roPage.repairSaveButton.click();
        BrowserUtil.sleep(5);
    }


    @Then("User sees that repair order has been created and {string} info is shown on the page")
    public void userSeesThatRepairOrderHasBeenCreatedAndProductToInfoIsShownOnThePage(String arg0) {
        BrowserUtil.sleep(5);
        Assert.assertTrue(roPage.productToRepairInfo.getText().contains(arg0));
    }


    @When("User clicks on kanban view button for repairs")
    public void userClicksOnKanbanViewButtonForRepairs() {
        roPage.kanbanButtonForRepairs.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(roPage.kanbanViewAreaForRepairs.isDisplayed());
    }

    @Then("User clicks on list view button for repairs")
    public void userClicksOnListViewButtonForRepairs() {
        roPage.listButtonForRepairs.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(roPage.listViewAreaForRepairs.isDisplayed());

    }

    @Then("User clicks on discard button and sees they land on repair orders page back")
    public void userClicksOnDiscardButtonAndSeesTheyLandOnRepairOrdersPageBack() {
        roPage.discardButtonForRepairs.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase("Repair Orders - Odoo"));
    }


    @When("User clicks on the repair order created newly")
    public void userClicksOnTheRepairOrderCreatedNewly() {
        roPage.firstRepairOrderOnTheList.click();
        BrowserUtil.sleep(3);
    }

    @And("User clicks on the edit button")
    public void userClicksOnTheEditButton() {
        roPage.editButtonForRepairs.click();
        BrowserUtil.sleep(3);
    }

    @Then("User sees that repair order edited")
    public void userSeesThatRepairOrderEdited() {
        Assert.assertTrue(roPage.editButtonForRepairs.isDisplayed());

    }

    @And("User clicks on the action button")
    public void userClicksOnTheActionButton() {
        roPage.actionButtonForRepairs.click();
        BrowserUtil.sleep(3);
    }

    @And("User clicks on delete button")
    public void userClicksOnDeleteButton() {
        roPage.deleteButtonForRepairs.click();
        BrowserUtil.sleep(3);
    }


    @Then("User clicks on the OK option to proceed with deleting")
    public void userClicksOnTheOKOptionToProceedWithDeleting() {
        roPage.okButtonForRepairs.click();
        BrowserUtil.sleep(3);
    }

    @Then("User sees that first repair order on the list is different")
    public void userSeesThatFirstRepairOrderOnTheListIsDifferent() {
        roPage.newFirstRepairOrderNameOnTheList = roPage.firstRepairOrderOnTheList.getText();
        Assert.assertNotEquals(roPage.newFirstRepairOrderNameOnTheList, roPage.formerFirstRepairOrderNameOnTheList);
    }

    @When("User clicks on Repairs Orders link on the left")
    public void userClicksOnRepairsOrdersLinkOnTheLeft() {
        roPage.repairOrdersLink.click();
        BrowserUtil.sleep(3);
    }
}
