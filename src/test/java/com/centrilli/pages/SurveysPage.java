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

}
