package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.StockOperationsPage;
import com.centrilli.utilities.BrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public final class Stock_Operations_StepDefinitions{


    StockOperationsPage stockOperationsPage = new StockOperationsPage();
    //BasePage basePage = new BasePage();

    @When("user clicks inventory button")
    public void user_clicks_inventory_button() {
        BrowserUtil.sleep(2);
        stockOperationsPage.InventoryButton.click();
    }

    @When("user clicks transfers button")
    public void user_clicks_transfers_button() {
        BrowserUtil.sleep(2);
        stockOperationsPage.TransfersButtonStock.click();
    }
    /*@When("user clicks partner box")
    public void user_clicks_partner_box() {
        BrowserUtil.sleep(2);
        stockOperationsPage.PartnerButtonStock.click();
    }
    */

    @When("user types {string}")
    public void user_types(String string) {
        stockOperationsPage.PartnerButtonStock.sendKeys(string);
        stockOperationsPage.PartnerButtonStock.sendKeys(Keys.ENTER);

    }
    @When("user clicks Additional Info button")
    public void user_clicks_additional_info_button() {
        stockOperationsPage.AdditionalInfoBox.click();
    }

    @When("user clicks Operation Type")
    public void user_clicks_operation_type() {
        stockOperationsPage.OperationalTypeBox.click();
    }

    @When("user type {string}")
    public void user_type(String string) {
        //stockOperationsPage.OperationalTypeBox.sendKeys(string);
        stockOperationsPage.OperationalTypeDropDown.click();
        BrowserUtil.sleep(1);
        Assert.assertTrue(stockOperationsPage.StockOperationDisplaying.isDisplayed());

    }


    @When("user clicks search box")
    public void user_clicks_search_box() {
        stockOperationsPage.searchingBox.click();

    }
    @When("user type {string} in search box")
    public void user_type_in_search_box(String string) {
        BrowserUtil.sleep(2);
        stockOperationsPage.searchingBox.sendKeys(string);


    }
    @When("user clicks small select box")
    public void user_clicks_small_select_box() {
        BrowserUtil.sleep(2);
        stockOperationsPage.searchPartnerForButton.click();
        BrowserUtil.sleep(2);
        stockOperationsPage.checkPartnerBox.click();
    }

    @And("user clicks action button")
    public void userClicksActionButton() {
        stockOperationsPage.actionButton35.click();
    }


    @When("user clicks delete35 button")
    public void user_clicks_delete35_button() {
        stockOperationsPage.deleteButton35.click();

    }
    @Then("user clicks ok button in deleting")
    public void user_clicks_ok_button_in_deleting() {
        stockOperationsPage.ok35Button.click();
    }



}
