package com.centrilli.stepDefinitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehicleServicesLogs_1;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public final class VehicleServicesLogs_StepDefinitions1 {

    LoginPage loginPage = new LoginPage();
   VehicleServicesLogs_1 vehicleServicesLogs_1 = new VehicleServicesLogs_1();
    @Given("is on the home page")
    public void is_on_the_home_page() {

     loginPage.login();
     BrowserUtil.sleep(2);
    }
 @When("user clicks on More button")
 public void user_clicks_on_more_button() {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.Morebtn.click();
 }
 @When("user clicks on Fleet module")
    public void user_clicks_on_fleet_module() {
        BrowserUtil.sleep(2);
    vehicleServicesLogs_1.FleetButton.click();
    }
    @Then("user clicks the Vehicle Service Logs module")
    public void user_clicks_the_vehicle_service_logs_module() {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.VehicleSerLogs.click();
    }
    @Then("user clicks Create button")
    public void user_clicks_create_button() {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.CreateBtn.click();
    }
    @Then("user clicks  Vehicle title and enters {string}")
    public void user_clicks_vehicle_title_and_enters(String string) {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.Vehicle.click();
        vehicleServicesLogs_1.AudiBtn.click();
    }
    @Then("user clicks the save button")
    public void user_clicks_save_button() {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.SaveBtn.click();
        BrowserUtil.sleep(2);
       // Driver.closeDriver();
    }
    @Then("user clicks Save button without selecting Vehicle and see {string}")
    public void user_clicks_save_button_without_selecting_vehicle_and_see(String string) {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.SaveBtn.click();
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.ErrorMsj.click();
        Assert.assertTrue(vehicleServicesLogs_1.ErrorMsj.isDisplayed());
      //  Driver.closeDriver();
    }
    @Then("user user clicks Discard button and see Warning message and clicks Ok Button")
    public void user_user_clicks_discard_button_and_see_warning_message_and_clicks_ok_button() {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.DiscardBtn.click();
        BrowserUtil.sleep(2);
       vehicleServicesLogs_1.OkBtn.click();
       // Assert.assertTrue(vehicleServicesLogs_1.WarningMsj.isDisplayed());;
        BrowserUtil.sleep(2);
      // Driver.closeDriver();
    }

    @Then("User clicks the save and see the title changed to {string}")
    public void user_clicks_the_save_and_see_the_title_changed_to(String string) {

        vehicleServicesLogs_1.SaveBtn.click();
        BrowserUtil.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        BrowserUtil.sleep(2);
        String expectedTitle = string+ "Audi/A1/-Odoo";


    }
    @Then("user clicks save button and Attachment and Action buttons are displayed")
    public void user_clicks_save_button_and_attachment_and_action_buttons_are_displayed() {

        vehicleServicesLogs_1.SaveBtn.click();
        BrowserUtil.sleep(2);
        Assert.assertTrue(vehicleServicesLogs_1.AttachBtn.isDisplayed());
        Assert.assertTrue(vehicleServicesLogs_1.ActionBtn.isDisplayed());
        BrowserUtil.sleep(2);
    }
    @Then("user enters the Save button")
    public void user_enters_the_save_button() {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.SaveBtn.click();
    }
    @Then("user clicks Vehicles services Logs Button")
    public void user_clicks_vehicles_services_logs_button() {
        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.VehicleSerLogs.click();
    }
    @Then("user enters new created value {string} under Service Logs list by using search box.")
    public void user_enters_new_created_value_under_service_logs_list_by_using_search_box(String string) {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.SearchBox.sendKeys(string + Keys.ENTER);
        BrowserUtil.sleep(2);
    }

    @Then("user clicks on List button and see list of {string}")
    public void user_clicks_on_list_button_and_see_list_of(String string) {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.ListBtn.click();
         BrowserUtil.sleep(2);
         Assert.assertTrue(vehicleServicesLogs_1.ListTable.isDisplayed());;
    }
    @Then("user clicks on Kanban button and see {string} vehicles")
    public void user_clicks_on_kanban_button_and_see_vehicles(String string) {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.KanbanBtn.click();
        Assert.assertTrue(vehicleServicesLogs_1.KanbanTable.isDisplayed());
    }
        @Then("user clicks in Graph button and see {string} vehicles")
        public void user_clicks_in_graph_button_and_see_vehicles(String string) {

        BrowserUtil.sleep(2);
        vehicleServicesLogs_1.GraphBtn.click();
        Assert.assertTrue(vehicleServicesLogs_1.GraphDisplayed.isDisplayed());
        BrowserUtil.sleep(2);
       // Driver.closeDriver();
    }



}
