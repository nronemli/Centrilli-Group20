package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveysPage {

    public SurveysPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Survey Title']")
    public WebElement surveyTitleInputBox;

    @FindBy(xpath = "//a[.='Add an item']")
    public WebElement addPageButton;

    @FindBy(id = "o_field_input_30")
    public WebElement createPagesTitleInputBox;

    @FindBy(xpath = "//td[@colspan='5']//a")
    public WebElement addQuestionButton;

    @FindBy(id = "o_field_input_37")
    public WebElement createQuestionsQuestionsNameInputBox;

    @FindBy(xpath = "//label[@for='radio38_simple_choice']")
    public WebElement multipleChoice1OptionRadioButton;

    @FindBy(xpath = "//td[@colspan='3']//a")
    public WebElement addAnItemQuestions;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement inputChoicesBox;

    @FindBy(xpath = "(//div[@id='modal_61']//button[@type='button'])[6]//span")
    public WebElement saveCloseQuestionsButton;

    @FindBy(xpath = "//*[contains(text(),'Save  & Close')]")
    public WebElement saveClosePagesButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "(//a[@data-toggle='tab'])[3]")
    public WebElement answers;

    @FindBy(xpath = "(//p)[2]")
    public WebElement actualTitle;

    @FindBy(xpath = "//div[@class='o_notification_title']//span")
    public WebElement notificationMessageTitle;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

   // (//div[@id='modal_34']//button[@type='button'])[2]//span
    @FindBy(xpath = "//*[contains(text(),'Ok')]")
    public WebElement okWarningButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']//li")
    public WebElement surveysTitle;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement seachBar;

    @FindBy(xpath = "//span[@class='o_column_title']")
    public WebElement permanantButton;

    @FindBy(xpath = "//div[@data-id='4']//span[.='What is GitHub used for?']")
    public WebElement newSurveyName;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//div[@class='table-responsive']//table//tr//th[2]")
    public WebElement listVerificationTitle;

    @FindBy(xpath = "(//*[contains(text(),'Surveys')])[3]")
    public WebElement surveysButton;

    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement pageCounter;

    public int pageCounter(){
        String pageCounterStorage= pageCounter.getText();
        int x = Integer.parseInt(pageCounterStorage);
        return x;
    }

}
