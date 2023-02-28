package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.LoginPage;
import com.centrilli.pages.VehicleFuelLogsPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public final class VehicleFuelLogs_StepDefinitions {

    VehicleFuelLogsPage vehicleFuelLogsPage = new VehicleFuelLogsPage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    @And("User clicks on fleet button")
    public void user_clicks_on_fleet_button() {
        vehicleFuelLogsPage.FleetButton.click();
    }

    @And("User clicks on Vehicle Fuel Logs module")
    public void userClicksOnVehicleFuelLogsModule() {
        vehicleFuelLogsPage.VehicleFuelLogsButton.click();
        BrowserUtil.sleep(5);
    }

    @Given("User clicks on create button")
    public void userClicksOnCreateButton() {
        vehicleFuelLogsPage.createButtonFuel.click();
    }

    @And("User clicks on vehicle dropdown input box")
    public void userClicksOnVehicleDropdownInputBox() {
        vehicleFuelLogsPage.vehicleInputDropdown.click();
    }

    @And("User clicks on vehicle option")
    public void userClicksOnVehicleOption() {
        vehicleFuelLogsPage.vehicleOption.click();
    }

    @And("User enters odometer value")
    public void userEntersOdometerValue() {
        BrowserUtil.waitForVisibility(vehicleFuelLogsPage.odometerInputBox);
        vehicleFuelLogsPage.odometerInputBox.clear();
        vehicleFuelLogsPage.odometerInputBox.sendKeys(faker.numerify("###"));
    }

    @And("User enters liter value")
    public void userEntersLiterValue() {
        vehicleFuelLogsPage.literInputBox.clear();
        vehicleFuelLogsPage.literInputBox.sendKeys(faker.numerify("#"));
    }

    @And("User enters price value")
    public void userEntersPriceValue() {
        vehicleFuelLogsPage.priceInputBox.clear();
        vehicleFuelLogsPage.priceInputBox.sendKeys(faker.numerify("###"));
    }

    @Then("User clicks on save button and sees fuel log created")
    public void userClicksOnSaveButtonAndSeesFuelLogCreated() {
        vehicleFuelLogsPage.fuelSaveButton.click();
        BrowserUtil.waitForInvisibilityOf(vehicleFuelLogsPage.actualTitleFuel);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Audi"));
        //Driver.closeDriver();

    }

    @Then("User clicks on save button and sees error message")
    public void userClicksOnSaveButtonAndSeesErrorMessage() {
        vehicleFuelLogsPage.fuelSaveButton.click();
        Assert.assertTrue(vehicleFuelLogsPage.errorMessage.isDisplayed());
        //Driver.closeDriver();
    }

    @Then("User clicks on discard button and returns back fuel log page")
    public void userClicksOnDiscardButton() {
        vehicleFuelLogsPage.fuelDiscard.click();
        BrowserUtil.sleep(5);
        String actualFuelLogTitle = Driver.getDriver().getTitle();
        System.out.println("actualFuelLogTitle = " + actualFuelLogTitle);
        String expectedFuelTitle = "Vehicles Fuel Logs - Odoo";
        Assert.assertEquals(expectedFuelTitle, actualFuelLogTitle);
       // Driver.closeDriver();

    }

    @Given("User creates a vehicle fuel log")
    public void userCreatesAVehicleFuelLog() {
        vehicleFuelLogsPage.createFuelLog();

    }

    @Then("User sees title is changed to Vehicle Fuel Logs")
    public void userSeesTitleIsChangedToVehicleFuelLogs() {
        BrowserUtil.sleep(5);
        String actualFuelLogTitle = Driver.getDriver().getTitle();
        System.out.println("actualFuelLogTitle = " + actualFuelLogTitle);
        String expectedFuelTitle = "Audi/A1/ - Odoo";
        Assert.assertEquals(expectedFuelTitle, actualFuelLogTitle);
        //Driver.closeDriver();
    }

    @Then("User sees Attachment and Actions modules displayed")
    public void userSeesAttachmentAndActionsModulesDisplayed() {
        BrowserUtil.waitForVisibility(vehicleFuelLogsPage.attachmentsModule);
        Assert.assertTrue(vehicleFuelLogsPage.attachmentsModule.isDisplayed());
        Assert.assertTrue(vehicleFuelLogsPage.actionsModule.isDisplayed());
        //Driver.closeDriver();
    }

    @And("User enters {string} inside vehicle fuel log searchbox")
    public void userEntersInsideVehicleFuelLogSearchbox(String arg0) {
        BrowserUtil.sleep(3);
        vehicleFuelLogsPage.vehicleFuelLogSearchBox.sendKeys(arg0 + Keys.ENTER);

    }

    @And("User clicks on kanban view and sees new fuel log displayed")
    public void userSeesDisplayed() {
        vehicleFuelLogsPage.kanbanButton.click();
        Assert.assertTrue(vehicleFuelLogsPage.kanbanViewResult.isDisplayed());
        //Driver.closeDriver();
    }

    @Given("User clicks on kanban view button")
    public void userClicksOnKanbanViewButton() {
        vehicleFuelLogsPage.kanbanButton.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(vehicleFuelLogsPage.kanbanViewArea.isDisplayed());
    }

    @Then("User clicks on graph view button")
    public void userClicksOnGraphViewButton() {
        vehicleFuelLogsPage.graphViewButton.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(vehicleFuelLogsPage.graphViewArea.isDisplayed());
    }

    @And("User clicks on list view button")
    public void userClicksOnListViewButton() {
        vehicleFuelLogsPage.listViewButton.click();
        BrowserUtil.sleep(5);
        Assert.assertTrue(vehicleFuelLogsPage.listViewArea.isDisplayed());
        //Driver.closeDriver();
    }

    @Given("The user clicks on the X mark on the Vehicle label inside the Search input box")
    public void theUserClicksOnTheXMarkOnTheVehicleLabelInsideTheSearchInputBox() {
        vehicleFuelLogsPage.xMarkToRemoveLabel.click();
    }

    @Then("User clicks on the right arrow button to change the page number")
    public void userClicksOnTheRightArrowButtonToChangeThePageNumber() {
        BrowserUtil.waitForVisibility(vehicleFuelLogsPage.pageNumberRange);
        String initialPageRange = vehicleFuelLogsPage.pageNumberRange.getText();

        vehicleFuelLogsPage.pageNextArrowButton.click();
        BrowserUtil.waitForVisibility(vehicleFuelLogsPage.pageNumberRange);
        String pageRangeAfterNext = vehicleFuelLogsPage.pageNumberRange.getText();
        Assert.assertFalse(initialPageRange.equals(pageRangeAfterNext));

    }

    @And("User clicks on the left arrow button to change the page number")
    public void userClicksOnTheLeftArrowButtonToChangeThePageNumber() {
        String pageNumberRangeAfterNext = vehicleFuelLogsPage.pageNumberRange.getText();
        BrowserUtil.sleep(5);
        vehicleFuelLogsPage.pagePreviousArrowButton.click();
        BrowserUtil.sleep(5);
        String pageRangeAfterPrevious = vehicleFuelLogsPage.pageNumberRange.getText();

        Assert.assertFalse(pageNumberRangeAfterNext.equals(pageRangeAfterPrevious));
        //Driver.closeDriver();
    }

    @Given("The user clicks on the X mark on the Vehicle label inside the Search input box and sees the number of the total items")
    public void theUserClicksOnTheXMarkOnTheVehicleLabelInsideTheSearchInputBoxAndSeesTheNumberOfTheTotalItems() {
        vehicleFuelLogsPage.xMarkToRemoveLabel.click();
        BrowserUtil.sleep(5);
        vehicleFuelLogsPage.logsCount = Integer.parseInt(vehicleFuelLogsPage.totalNumbers.getText());
        System.out.println("vehicleFuelLogsPage.logsCount = " + vehicleFuelLogsPage.logsCount);
    }

    @Given("The user clicks on the X mark again and sees number of logs increased")
    public void theUserClicksOnTheXMarkAgainAndSeesNumberOfLogsIncreased() {
        vehicleFuelLogsPage.xMarkToRemoveLabel.click();
        BrowserUtil.sleep(5);
        vehicleFuelLogsPage.newLogsCount = Integer.parseInt(vehicleFuelLogsPage.totalNumbers.getText());
        Assert.assertTrue(vehicleFuelLogsPage.newLogsCount == vehicleFuelLogsPage.logsCount +1);
        System.out.println("vehicleFuelLogsPage.logsCount = " + vehicleFuelLogsPage.logsCount);
        System.out.println("vehicleFuelLogsPage.newLogsCount = " + vehicleFuelLogsPage.newLogsCount);
        //Driver.closeDriver();

    }


}
