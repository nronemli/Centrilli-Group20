package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.SurveysPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class SurveysPage_StepDefinitions extends BasePage {

    BasePage basePage = new BasePage();
    SurveysPage surveysPage = new SurveysPage();

    @When("User licks on Surveys module")
    public void user_licks_on_surveys_module() {
        basePage.SurveysButton.click();
    }

    @When("User clicks create button")
    public void user_clicks_create_button() {
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
        Driver.closeDriver();
    }


}
