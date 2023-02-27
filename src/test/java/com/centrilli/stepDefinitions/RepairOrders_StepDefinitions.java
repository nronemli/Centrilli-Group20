package com.centrilli.stepDefinitions;

import com.centrilli.pages.RepairOrdersPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public final class RepairOrders_StepDefinitions {


    RepairOrdersPage repairOrdersPage = new RepairOrdersPage();


    String beforeCount;
    String afterCount;

    @When("user clicks on Repair modules")
    public void user_clicks_on_repair_modules() {
        BrowserUtil.sleep(2);
        repairOrdersPage.RepairsBtn.click();

    }


    @And("user clicks on Create Button\\(repair)")
    public void userClicksOnCreateButtonRepair() {
        BrowserUtil.sleep(2);
        repairOrdersPage.createBtn.click();
        BrowserUtil.sleep(2);
    }

    @And("user select the product in Product to Repair input box")
    public void userSelectTheProductInProductToRepairInputBox() {
        BrowserUtil.sleep(2);
        repairOrdersPage.productToRepair.click();
        BrowserUtil.sleep(2);
        repairOrdersPage.tShirt.click();
        BrowserUtil.sleep(2);


    }

    @And("user clicks on Save button\\(repair)")
    public void userClicksOnSaveButtonRepair() {
        BrowserUtil.sleep(2);
        repairOrdersPage.saveBtn.click();
        BrowserUtil.sleep(4);
        beforeCount = repairOrdersPage.afterRepairOrderCount.getText();
        //System.out.println("repairOrdersPage.afterRepairOrderCount.getText() = " + repairOrdersPage.afterRepairOrderCount.getText());

    }


    @Then("verify that user can create repair orders")
    public void verifyThatUserCanCreateRepairOrders() {
        BrowserUtil.sleep(2);
        System.out.println("repairOrdersPage.verifyProductName.getText() = " + repairOrdersPage.verifyProductName.getText());
        BrowserUtil.sleep(2);
        repairOrdersPage.verifyProductName.getText();
        BrowserUtil.sleep(2);
        Assert.assertEquals("[253] T-shirt", repairOrdersPage.verifyProductName.getText());
    }

    @And("user delete repair orders")
    public void userDeleteRepairOrders() {
        BrowserUtil.sleep(2);
        repairOrdersPage.actionBtn.click();
        BrowserUtil.sleep(2);
        repairOrdersPage.deleteBtn.click();
        BrowserUtil.sleep(2);
        repairOrdersPage.confirmationOkBtn.click();
        BrowserUtil.sleep(2);

        afterCount = repairOrdersPage.afterRepairOrderCount.getText();
        BrowserUtil.sleep(2);
        System.out.println("afterCount = " + afterCount);
        BrowserUtil.sleep(3);
        int IntAfterNumber = Integer.parseInt(repairOrdersPage.afterRepairOrderCount.getText()) + 1;
        afterCount = Integer.toString(IntAfterNumber);
        // System.out.println("afterCount = " + afterCount);
        Assert.assertEquals("Numbers don't match", afterCount, beforeCount);


    }

    @Then("user clicks edit button\\(repair)")
    public void userClicksEditButtonRepair() {
        BrowserUtil.sleep(4);
        repairOrdersPage.editBtn.click();
    }


    @Then("user edits product in Product to Repair input box")
    public void userEditsProductInProductToRepairInputBox() {

        BrowserUtil.sleep(2);
        repairOrdersPage.productToRepair.click();
        BrowserUtil.sleep(2);
        repairOrdersPage.iceCream.click();

    }


    @Then("verify that user can edit repair orders")
    public void verifyThatUserCanEditRepairOrders() {
        BrowserUtil.sleep(2);
        repairOrdersPage.verifyProductName.getText();
        BrowserUtil.sleep(2);
        Assert.assertEquals("[13] Ice Cream", repairOrdersPage.verifyProductName.getText());

    }


    @And("user clicks Kanban Button\\(repair)")
    public void userClicksKanbanButtonRepair() {
        BrowserUtil.sleep(2);
        repairOrdersPage.kanbanBtn.click();

    }

    @Then("verify that user can switch kanban view\\(repair)")
    public void verifyThatUserCanSwitchKanbanViewRepair() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(repairOrdersPage.verifykanbanView.isDisplayed());
    }

    @Then("user clicks discard button\\(repair)")
    public void userClicksDiscardButtonRepair() {
        BrowserUtil.sleep(2);
        repairOrdersPage.discardBtn.click();
        BrowserUtil.sleep(1);
        repairOrdersPage.warningOkBtn.click();
    }

    @Then("verify that user can discard repair orders")
    public void verifyThatUserCanDiscardRepairOrders() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Repair Orders - Odoo"));

    }
}
