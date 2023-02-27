package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.SalesFunctionalityPage;
import com.centrilli.pages.VehicleOdometerPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public final class VehicleOdometerStepDefinition{

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    //BasePage basePage = new BasePage();




    @When("user clicks more button")
    public void user_clicks_more_button() {
        BrowserUtil.sleep(3);
       vehicleOdometerPage.moreButtonB35.click();

    }

    @When("user clicks fleet button")
    public void user_clicks_fleet_button() {
        BrowserUtil.sleep(3);
        vehicleOdometerPage.FleetButton.click();
    }

    @When("user clicks vehicle odometers button")
    public void user_clicks_vehicle_odometers_button() {
        BrowserUtil.sleep(3);
        vehicleOdometerPage.vehiclesOdometerButton.click();
        BrowserUtil.sleep(3);
    }

    @And("user clicks create Button")
    public void userClicksCreateButton() {
        BrowserUtil.sleep(3);
       vehicleOdometerPage.createButtonB35.click();
    }


    @When("user types {string} in the vehicle box")
    public void user_types_in_the_vehicle_box(String string) {
        vehicleOdometerPage.vehicleSelectBox.click();

        BrowserUtil.sleep(2);
        vehicleOdometerPage.vehicleSelectBox.sendKeys(string);
        BrowserUtil.sleep(2);
        vehicleOdometerPage.Volvo35.click();


    }

    @And("user clicks odometer value box")
    public void userClicksOdometerValueBox() {

        vehicleOdometerPage.odometerValueBox.click();

    }

    @And("user types {string} in the odometer value box")
    public void userTypesInTheOdometerValueBox(String arg0) {
        BrowserUtil.sleep(2);
        vehicleOdometerPage.odometerValueBox.sendKeys(arg0);
    }


    @And("user clicks save Button-B")
    public void userClicksSaveButtonB() {
        BrowserUtil.sleep(2);
       vehicleOdometerPage.saveButton.click();
    }


    @Then("verify that user should see an errorB message")
    public void verifyThatUserShouldSeeAnErrorBMessage() {
        BrowserUtil.sleep(1);
        Assert.assertTrue(vehicleOdometerPage.error35Message.isDisplayed());
    }

    @And("user clicks discardB Button")
    public void userClicksDiscardBButton() {
        BrowserUtil.sleep(3);
        vehicleOdometerPage.discard35Button.click();
    }

    @Then("users should see the Vehicle Odometer create page again")
    public void usersShouldSeeTheVehicleOdometerCreatePageAgain() {
        BrowserUtil.sleep(3);
        Assert.assertTrue(vehicleOdometerPage.vehicleCreatePage.isDisplayed());
    }

    @Then("verify that page title include the new {string} value after user create the Vehicle Model")
    public void verifyThatPageTitleIncludeTheNewValueAfterUserCreateTheVehicleModel(String vehicle) {
        BrowserUtil.sleep(2);

       // String expectedTitle = ""+vehicle;

        String actualTitle = Driver.getDriver().getTitle();
        //Assert.assertEquals("Title is not as expected",expectedTitle,actualTitle);
        Assert.assertTrue("Title is not as expected",actualTitle.contains(vehicle));


    }

    @Then("attachment and actions button are displayed")
    public void attachmentAndActionsButtonAreDisplayed() {
        BrowserUtil.sleep(1);
        Assert.assertTrue(vehicleOdometerPage.actionButton35.isDisplayed());
    }


    @And("user type {string} in the search button")
    public void userTypeInTheSearchButton(String arg0) {
        vehicleOdometerPage.searchButton35.sendKeys(arg0);
        vehicleOdometerPage.searchThing35.click();


    }

    @Then("Users should see {string} is displayed in the list.")
    public void usersShouldSeeIsDisplayedInTheList(String arg0) {
       Assert.assertTrue("New vehicle odometer is not displayed",vehicleOdometerPage.vehicleTable35.isDisplayed());
    }

    @And("user clicks kanban Button-B")
    public void userClicksKanbanButtonB() {
        vehicleOdometerPage.kanbanButton35.click();
        Assert.assertTrue("Expected style button is not displayed",vehicleOdometerPage.kanbanButton35.isDisplayed());
    }

    @Then("the number of odometer is increased")
    public void theNumberOfOdometerIsIncreased() {

        BrowserUtil.sleep(2);
        String expected = "1";
        String actual = vehicleOdometerPage.vehiclesOdometerValue.getText();
        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.contains(expected));

    }



}
