package com.centrilli.stepDefinitions;


import com.centrilli.pages.VehicleCostPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class VehicleCostStepDefinitions {

    VehicleCostPage vc = new VehicleCostPage();

    @When("User click More tab on the right top side and click Fleet then select Vehicle Cost Page")
    public void user_click_more_tab_on_the_right_top_side_and_click_fleet_then_select_vehicle_cost_page() {

        vc.gotoVehicleCostPage();

    }
    @When("User clicks Create button and enter vehicle information and click Save button")
    public void user_clicks_create_button_and_enter_vehicle_information_and_click_save_button() {

        vc.createVehicleCost();

    }
    @Then("User verify Vehicle cost in Cost Details page")
    public void user_verify_vehicle_cost_in_cost_details_page() {

        vc.verifyCreatedVehicleCost();
        //Driver.closeDriver();
    }

    @And("User clicks Create button and enter vehicle information without vehicle name and click Save button")
    public void userClicksCreateButtonAndEnterVehicleInformationWithoutVehicleNameAndClickSaveButton() {
        vc.createVehicleCostWithoutVehicleName();
    }

    @Then("User verify error message that Vehicle cost is not created")
    public void user_verify_error_message_that_vehicle_cost_is_not_created() {

        vc.verifyErrorMessageWithoutVehicleInfo();

    }

    @When("User clicks Create button and enter vehicle information")
    public void user_clicks_create_button_and_enter_vehicle_information() {
        vc.enterVehicleInfoForPageTitle();

    }

    @Then("User Verifies the page title is not equal after saving the Vehicle Cost page title")
    public void userVerifiesThePageTitleIsNotEqualAfterSavingTheVehicleCostPageTitle() {
        vc.verifyPageTitleBeforeAfter();
    }


    @Then("User clicks Discard button and to cancel vehicle cost")
    public void userClicksDiscardButtonAndToCancelVehicleCost() {

        vc.cancelVehicleCost();


    }

    @Then("User verify Attachments and Action button is displayed")
    public void user_verify_attachments_and_action_button_is_displayed() {
        vc.attachmentsAndActionButtonDisplayed();
    }


    @When("User click More tab on the right top side and click Fleet then select Vehicle Cost Page then take the vehicle count")
    public void user_click_more_tab_on_the_right_top_side_and_click_fleet_then_select_vehicle_cost_page_then_take_the_vehicle_count() {


        vc.selectVehicleCostAndSearchValue();
    }
    @Then("User verify that the Vehicle cost  value is increased by one after creating new vehicle cost")
    public void user_verify_that_the_vehicle_cost_value_is_increased_by_one_after_creating_new_vehicle_cost() {

        vc.verifyNewVehicleCount();

    }

    @Then("User verify that the Vehicle Cost page can be displayed List, Kanban, Graph")
    public void user_verify_that_the_vehicle_cost_page_can_be_displayed_list_kanban_graph() {

        vc.verifyVehicleCostDisplayInListKanbanGraph();
    }

}

