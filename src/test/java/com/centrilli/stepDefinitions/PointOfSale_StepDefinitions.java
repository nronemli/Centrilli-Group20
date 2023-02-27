package com.centrilli.stepDefinitions;

import com.centrilli.pages.PointOfSalePage;
import com.centrilli.pages.VehicleCostPage;
import com.centrilli.utilities.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public final class PointOfSale_StepDefinitions {

    PointOfSalePage pos = new PointOfSalePage();
    VehicleCostPage vehicle=new VehicleCostPage();


    @Then("User clicks Point of Sale module")
    public void user_clicks_point_of_sale_module() {

        pos.clickPointOfSale();

    }
    @Then("User clicks on Point of Sale button on the left side")
    public void user_clicks_on_point_of_sale_button_on_the_left_side() {

        pos.clickSecondPointOfSale();

    }
    @Then("User clicks on Create Button")
    public void user_clicks_on_create_button() {

        pos.clickCreateButton();
    }
    @Then("User enters name Point of Sale name text box")
    public void user_enters_name_point_of_sale_name_text_box() {

        pos.pointOfSaleNameInput();
    }
    @Then("User select Operation Type")
    public void user_select_operation_type() {

        pos.selectOperationType();
    }
    @Then("User drop down to Inventory module")
    public void user_drop_down_to_inventory_module() {

        pos.selectInventory();


    }
    @Then("User clicks Save button and verify")
    public void user_clicks_save_button_and_verify() {

        pos.clickSaveAndVerify();

    }



    @Then("User clicks to List button")
    public void user_clicks_to_List_button() {

        pos.clickListbutton();
    }
    @Then("User click to Kanban button")
    public void user_click_to_Kanban_button() {
     pos.clickKanbanbutton();


    }

    @Then("User clicks Discard button and verify")
    public void userClicksDiscardButtonAndVerify() {
        vehicle.cancelVehicleCost();

    }


    @Then("User clicks Edit button")
    public void userClicksEditButton() {

       pos.editPointOfSale();


    }
}
