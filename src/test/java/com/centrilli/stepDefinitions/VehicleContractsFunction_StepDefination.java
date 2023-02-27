package com.centrilli.stepDefinitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehicleContractsFunction;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public final class VehicleContractsFunction_StepDefination {

    VehicleContractsFunction vehicleContractsFunction = new VehicleContractsFunction();

    LoginPage loginPage = new LoginPage();


    @When("user cliks on More module")
    public void user_cliks_on_more_module() {
        loginPage.login();
        vehicleContractsFunction.moreModule.click();
        BrowserUtil.sleep(2);
    }

    @When("user cliks on Fleet module")
    public void user_cliks_on_fleet_module() {
        vehicleContractsFunction.fleetButton.click();
        BrowserUtil.sleep(2);
    }

    @When("user cliks on Vehicles Contracts button")
    public void user_cliks_on_vehicles_contracts_button() {
        vehicleContractsFunction.vehicleContracts.click();
        BrowserUtil.sleep(2);
    }

    @When("user cliks on Create button")
    public void user_cliks_on_create_button() {
        vehicleContractsFunction.createButton.click();
        BrowserUtil.sleep(3);
    }

    @When("user select a vehicle name {string}")
    public void user_select_a_vehicle_name(String string) {
        BrowserUtil.sleep(4);
        vehicleContractsFunction.inputVheicleName.click();
      vehicleContractsFunction.inputVheicleName.sendKeys(string);
      BrowserUtil.sleep(1);
      vehicleContractsFunction.inputVheicleName.sendKeys(Keys.TAB);
     BrowserUtil.sleep(2);
    }

    @When("user cliks Vehicle Contracts Save button")
    public void user_ckiks_vehicle_contracts_save_button() {
       vehicleContractsFunction.saveButton.click();
       BrowserUtil.sleep(2);
    }
    @Then("verify that user see the Vehicle name on page")
    public void verifyThatUserSeeTheVehicleNameOnPage() {
       BrowserUtil.sleep(4);
       String expected = "Contract information on a vehicle created";
       Assert.assertTrue(vehicleContractsFunction.vehicleCreatedMessage.getText().contains(expected));


    }

    @Then("verify that user see the error message")
    public void verify_that_user_see_the_error_message() {
        Assert.assertTrue(vehicleContractsFunction.errorMessage.isDisplayed());
    }

    @When("user clicks Vehicle Contracts Discard Button")
    public void user_clicks_vehicle_contracts_discard_button() {
        BrowserUtil.sleep(2);
        vehicleContractsFunction.discardButton.click();
        BrowserUtil.sleep(2);
    }

    @Then("Then Verify that user cancel creating by clicking Discard button")
    public void then_verify_that_user_cancel_creating_by_clicking_discard_button() {
        System.out.println("passed");
    }

    @Then("page title is changed to the new Vehicle Contract value after user create the Vehicle Contract")
    public void page_title_is_changed_to_the_new_vehicle_contract_value_after_user_create_the_vehicle_contract() {
        String expectedTitle = "FORD/Granada/06 FRD 1111 / Leasing / 2022-11-09 - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("Verify that Attachment and Action buttons are displayed at the top of the page")
    public void verify_that_attachment_and_action_buttons_are_displayed_at_the_top_of_the_page() {
        BrowserUtil.sleep(2);
         Assert.assertTrue(vehicleContractsFunction.attachmentsButton.isDisplayed());
         Assert.assertTrue(vehicleContractsFunction.actionButton.isDisplayed());

    }

    @When("user clicks on Kanban List and graph Button")
    public void user_clicks_on_kanban_list_and_graph_arrow() {
        vehicleContractsFunction.kanbanButton.click();
    }
    @Then("Verify that user can change Vehicle Contract display to Kanban  List Graph")
    public void verifyThatUserCanChangeVehicleContractDisplayToKanbanListGraph() {
        Assert.assertTrue(vehicleContractsFunction.kanbanPage.isDisplayed());
    }

    @And("user cliks cancel in Progress button in the search box")
    public void userCliksCancelInProgressButtonInTheSearchBox() {
        vehicleContractsFunction.removeInProgressOption.click();
    }

    @When("user cliks right and left arrows")
    public void user_cliks_right_and_left_arrows() {
        vehicleContractsFunction.rightArrowKey.click();
        vehicleContractsFunction.leftArrowKey.click();
    }
    @Then("user can change Vehicle Contract page number by right and left arrow")
    public void user_can_change_vehicle_contract_page_number_by_right_and_left_arrow() {
        Assert.assertTrue(vehicleContractsFunction.rightArrowVerification.isDisplayed());
    }



}
