package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.SurveysPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class SurveysPage_StepDefinitions extends BasePage {

    BasePage basePage = new BasePage();
    SurveysPage surveysPage = new SurveysPage();

    public String newCounter;

    @When("User clicks on Surveys module")
    public void user_clicks_on_surveys_module() {
        basePage.SurveysButton.click();
        BrowserUtil.sleep(2);
    }

    @When("User clicks create button")
    public void user_clicks_create_button() {
        BrowserUtil.sleep(2);
        surveysPage.createButton.click();
    }

    @When("User enters {string}")
    public void user_enters(String string) {
        surveysPage.surveyTitleInputBox.sendKeys(string);
    }

    @When("User clicks add an item")
    public void user_clicks_add_an_item() {
        surveysPage.addPageButton.click();
    }

    @When("user enters in the {string}")
    public void user_enters_in_the(String string) {
        surveysPage.createPagesTitleInputBox.sendKeys(string);
    }

    @When("user clicks to add an item")
    public void user_clicks_to_add_an_item() {
        surveysPage.addQuestionButton.click();
    }

    @And("User enters {string} inputBox")
    public void userEntersInputBox(String arg0) {
        surveysPage.createQuestionsQuestionsNameInputBox.sendKeys(arg0);
    }

    @When("user chooses Multiple choice option button")
    public void user_chooses_multiple_choice_option_button() {
        surveysPage.multipleChoice1OptionRadioButton.click();
    }

    @When("User clicks add an item to Question")
    public void user_clicks_add_an_item_to_question() {
        surveysPage.addAnItemQuestions.click();
    }

    @And("user enters in the {string} box")
    public void userEntersInTheBox(String arg0) {
        surveysPage.inputChoicesBox.sendKeys(arg0);
    }

    @When("User clicks add an item choices button")
    public void user_clicks_add_an_item_choices_button() {
        surveysPage.addAnItemQuestions.click();
    }

    @When("User enters {string} in the input box")
    public void user_enters_in_the_input_box(String string) {
        surveysPage.inputChoicesBox.sendKeys(string);
    }

    @When("user clicks on the Save&Close")
    public void user_clicks_on_the_save_close() {
        BrowserUtil.waitForVisibility(surveysPage.answers);
        surveysPage.saveCloseQuestionsButton.click();
    }

    @When("user clicks Save&Close page button")
    public void user_clicks_save_close_page_button() {
        surveysPage.saveClosePagesButton.click();
    }

    @Then("User clicks save button and should see surveys created")
    public void user_clicks_save_button_and_should_see_surveys_created() {
        surveysPage.saveButton.click();
        BrowserUtil.sleep(1);
        String expectedTitle = "Survey created";
        String actualTitle = surveysPage.surveyCreatedMsg.getText();
        Assert.assertEquals("Survey title didnt match", actualTitle, expectedTitle);
        BrowserUtil.sleep(2);
        Driver.closeDriver();
    }

    @Then("user clicks save button to see the error message")
    public void userClicksSaveButtonToSeeTheErrorMessage() {
        surveysPage.saveButton.click();
        Assert.assertTrue(surveysPage.notificationMessageTitle.isDisplayed());
        Driver.closeDriver();
    }

    @And("user clicks Discard button")
    public void userClicksDiscardButton() {
        surveysPage.discardButton.click();
    }

    @And("user clicks ok button")
    public void userClicksOkButton() {
        BrowserUtil.sleep(2);
        surveysPage.okWarningButton.click();
    }

    @Then("user is back on the surveys module")
    public void userIsBackOnTheSurveysModule() {
        String expectedTitle = "Surveys";
        String actualTitle = surveysPage.surveysTitle.getText();
        Assert.assertEquals("Title as expected", expectedTitle, actualTitle);
        Driver.closeDriver();
    }

    @Then("User clicks save and see the title changed to {string}")
    public void userClicksSaveAndSeeTheTitleChangedTo(String arg0) {
        surveysPage.saveButton.click();
        BrowserUtil.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        Assert.assertTrue(actualTitle.contains(arg0));
        Driver.closeDriver();
    }


    @And("user clicks permanent button")
    public void userClicksPermanentButton() {
        surveysPage.permanantButton.click();
    }

    @And("user types in the search box {string}")
    public void userTypesInTheSearchBox(String arg0) {
        surveysPage.seachBar.sendKeys(arg0 + Keys.ENTER);
    }

    @Then("user sees the new created survey under permanent survey list")
    public void userSeesTheNewCreatedSurveyUnderPermanentSurveyList() {
        String expectedSurveyName = "What is GitHub used for?";
        String actualSurveyName = surveysPage.newSurveyName.getText();
        Assert.assertTrue(actualSurveyName.contains(expectedSurveyName));
        Driver.closeDriver();
    }

    @And("User clicks on list button")
    public void userClicksOnListButton() {
        surveysPage.listButton.click();
        Assert.assertTrue(surveysPage.listVerificationTitle.getText().contains("Title"));
    }

    @And("user clicks on kanban button")
    public void userClicksOnKanbanButton() {
        surveysPage.kanbanButton.click();
        surveysPage.permanantButton.click();
        Assert.assertTrue(surveysPage.permanantButton.isDisplayed());
        Driver.closeDriver();
    }

    @When("User clicks on Surveys module and click list to verify number")
    public void userClicksOnSurveysModuleAndClickListToVerifyNumber() {
        basePage.SurveysButton.click();
        BrowserUtil.sleep(2);
        surveysPage.listButton.click();
        BrowserUtil.sleep(1);

        int changeToInt=Integer.parseInt(surveysPage.pageCounter.getText()) + 1;
        newCounter = Integer.toString(changeToInt);
    }


    @And("user clicks surveys button")
    public void userClicksSurveysButton() {
        BrowserUtil.sleep(2);
        basePage.SurveysButton.click();
    }

    @Then("user click list and number increased by one")
    public void userClickListAndNumberIncreasedByOne() {
        surveysPage.listButton.click();
        BrowserUtil.sleep(1);
        String pageCounter = surveysPage.pageCounter.getText();
        BrowserUtil.sleep(1);
        Assert.assertEquals("Numbers DONT match", newCounter,pageCounter);
        Driver.closeDriver();
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        surveysPage.saveButton.click();
    }
}
