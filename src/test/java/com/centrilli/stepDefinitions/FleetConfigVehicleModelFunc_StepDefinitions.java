package com.centrilli.stepDefinitions;

import com.centrilli.pages.FleetConfigVehicleModelFuncPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class FleetConfigVehicleModelFunc_StepDefinitions {




    FleetConfigVehicleModelFuncPage fleetConfigVehicleModelFuncPage = new FleetConfigVehicleModelFuncPage();

    public String first;
    public String second;

    public String counterfirst;

    public String countersecond;

    @When("user clicks more module and then fleet module")
    public void user_clicks_more_module_and_then_fleet_module() {

        BrowserUtil.sleep(2);
        fleetConfigVehicleModelFuncPage.morebtn.click();
        fleetConfigVehicleModelFuncPage.fleetButton.click();

    }
    @When("user clicks vehicle model module")
    public void user_clicks_vehicle_model_module() {
        fleetConfigVehicleModelFuncPage.vehicleModelButton.click();
        BrowserUtil.sleep(2);

    }


    @And("user clicks Create Button")
    public void userClicksCreateButton() {
        BrowserUtil.sleep(3);
        fleetConfigVehicleModelFuncPage.createButton.click();
        BrowserUtil.sleep(2);

    }



    @When("user types Model Name {string}")
    public void user_types_model_name(String modelName) {
        BrowserUtil.sleep(1);
        fleetConfigVehicleModelFuncPage.modelNameInputBox.sendKeys(modelName);


    }
    @When("user types Make {string}")
    public void user_types_make(String make) {
        BrowserUtil.sleep(1);
        fleetConfigVehicleModelFuncPage.makeInputBox.sendKeys(make);


    }
    @When("user clicks Save button")
    public void user_clicks_save_button() {

        BrowserUtil.sleep(1);
        fleetConfigVehicleModelFuncPage.photoclear.click();
        fleetConfigVehicleModelFuncPage.saveButton.click();
       // BrowserUtil.sleep(2);

    }

    @When("user clicks create button on popup page")
       public void user_clicks_create_button_on_popup_page() {
        BrowserUtil.sleep(1);
       fleetConfigVehicleModelFuncPage.createPopupBtn.click();
    }

    @Then("verify that user see new Vehicle Model page")
    public void verify_that_user_see_new_vehicle_model_page() {
        Assert.assertTrue(fleetConfigVehicleModelFuncPage.verifymodelpage.isDisplayed());

    }


    @Then("verify that user should see an error message")
    public void verifyThatUserShouldSeeAnErrorMessage() {
        fleetConfigVehicleModelFuncPage.errorMesage.isDisplayed();
    }

    @And("user clicks Discard Button")
    public void userClicksDiscardButton() {
       // BrowserUtil.sleep(3);
        fleetConfigVehicleModelFuncPage.discardButton.click();

    }

    @Then("verify that user should see warning popup message")
    public void verifyThatUserShouldSeeWarningPopupMessage() {
       // BrowserUtil.sleep(3);
        Assert.assertTrue(fleetConfigVehicleModelFuncPage.discardWarningPopupMessage.isDisplayed());

    }

    @And("user clicks Ok button")
    public void userClicksOkButton() {

       // BrowserUtil.sleep(2);
        fleetConfigVehicleModelFuncPage.okButtonDiscardWarningPopup.click();
      //  BrowserUtil.sleep(3);
        fleetConfigVehicleModelFuncPage.cancelCreateMakePopup.click();


    }

    @Then("verify that User should back on the Vehicle Model page")
    public void verifyThatUserShouldBackOnTheVehicleModelPage() {
      //  BrowserUtil.sleep(3);
       Assert.assertTrue(fleetConfigVehicleModelFuncPage.vehicleModelPage.isDisplayed());
    }

    @Then("verify that page title is changed to the new {string} value after user create the Vehicle Model")
    public void verifyThatPageTitleIsChangedToTheNewValueAfterUserCreateTheVehicleModel(String string) {
       BrowserUtil.sleep(2);
       // Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

        String expectedTitle = string+" - Odoo";
        BrowserUtil.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected",expectedTitle, actualTitle);


    }



    @Then("verify that User should see Attachment  and Action buttons are displayed at the top of the new Vehicle Model page")
    public void verifyThatUserShouldSeeAttachmentAndActionButtonsAreDisplayedAtTheTopOfTheNewVehicleModelPage() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(fleetConfigVehicleModelFuncPage.attachmentVerification.isDisplayed());
        Assert.assertTrue(fleetConfigVehicleModelFuncPage.actionVerification.isDisplayed());

    }


    @And("user types the newly created vehicle model {string} in the search box.")
    public void userTypesTheNewlyCreatedVehicleModelInTheSearchBox(String string) {

        BrowserUtil.sleep(2);
        fleetConfigVehicleModelFuncPage.searchBox.sendKeys(string +Keys.ENTER);
        BrowserUtil.sleep(2);
    }




    @Then("user should see new vehicle model {string} on the page")
    public void userShouldSeeNewVehicleModelOnThePage(String model) {
        BrowserUtil.sleep(2);
        String actualResult = fleetConfigVehicleModelFuncPage.vehicleModelFind.getText();
        BrowserUtil.sleep(1);
        Assert.assertEquals(model+" (1)",actualResult);


    }

    @And("user clicks on Make Close button in the search box")
    public void userClicksOnMakeCloseButtonInTheSearchBox() {
        BrowserUtil.sleep(4);
        fleetConfigVehicleModelFuncPage.makeCloseButton.click();

    }

    @And("user clicks on the right arrow")
    public void userClicksOnTheRightArrow() {
        BrowserUtil.sleep(2);
         first = fleetConfigVehicleModelFuncPage.firstNameInPage.getText();
        BrowserUtil.sleep(2);

        fleetConfigVehicleModelFuncPage.rightArrowButton.click();
        BrowserUtil.sleep(2);
        second = fleetConfigVehicleModelFuncPage.firstNameInPage.getText();
        BrowserUtil.sleep(2);

    }

    @And("verify that Vehicle Model page number changed")
    public void verifyThatVehicleModelPageNumberChanged() {
        BrowserUtil.sleep(2);
/*
        if(first != second){
            System.out.println("Verification page number changed");
        }else{
            System.out.println("Failed!!!");
        }

 */
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        Assert.assertNotEquals("Failed",first,second);

    }

    @And("user clicks on the left arrow")
    public void userClicksOnTheLeftArrow() {
        fleetConfigVehicleModelFuncPage.leftArrowButton.click();
    }


    @Then("verify that User should be able see  Vehicle Models increase one")
    public void verifyThatUserShouldBeAbleSeeVehicleModelsIncreaseOne() {
        BrowserUtil.sleep(2);
        String pageNumberAfter = fleetConfigVehicleModelFuncPage.pageNumBefore.getText();
         BrowserUtil.sleep(1);

        System.out.println("pageNumberAfter = " + pageNumberAfter);
        System.out.println("counterfirst = " + counterfirst);
        System.out.println("countersecond = " + countersecond);
        Assert.assertNotEquals("Number is not increased",counterfirst,countersecond);
        Assert.assertEquals("Number is not increased",countersecond,pageNumberAfter);
    }

    @And("user clicks on Make Close button")
    public void userClicksOnMakeCloseButton() {
        BrowserUtil.sleep(2);
        fleetConfigVehicleModelFuncPage.makeCloseButton.click();
        BrowserUtil.sleep(2);

         int getnumber =Integer.parseInt(fleetConfigVehicleModelFuncPage.pageNumBefore.getText())  ;
         counterfirst = Integer.toString(getnumber);
         BrowserUtil.sleep(2);

    }

    @And("user clicks on Make Close button and see page numbers")
    public void userClicksOnMakeCloseButtonAndSeePageNumbers() {
        BrowserUtil.sleep(2);
        fleetConfigVehicleModelFuncPage.makeCloseButton.click();
        BrowserUtil.sleep(2);

        int getnumbersecond =Integer.parseInt(fleetConfigVehicleModelFuncPage.pageNumBefore.getText())  ;
        countersecond = Integer.toString(getnumbersecond);
        BrowserUtil.sleep(2);

    }
}
