package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {

    public NotesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'Notes')]" )
    public WebElement notes;

    @FindBy(xpath = "//button[@accesskey='c']" )
    public WebElement noteCreate;
    //div[@class='o_input_dropdown']/span
    //input[@autocomplete='off']/..//span
    @FindBy(xpath = "//div[@class='o_input_dropdown']//input")
    public WebElement tags;
    //span[@draggable='false'] , (//input[@type='text'])[4] , //input[@autocomplete='off']/..//span
    @FindBy(xpath = "(//p)[2]")
    public WebElement noteBody;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement noteSavebutton;

    @FindBy(xpath = "//button[@accesskey='a']" )
    public WebElement notesEditButton;

    @FindBy(xpath = "//li[@class='ui-menu-item'][2]/a" )
    public WebElement tagChoose;
    //li[@tabindex='-1'][2]/a
    @FindBy(xpath = "//button[@accesskey='l']" )
    public WebElement listView;

    @FindBy(xpath = "//button[@accesskey='j']" )
    public WebElement notesDiscardButton;

    @FindBy(xpath = "//button[@accesskey='k']" )
    public WebElement kanban;

    @FindBy(xpath = "//th[@class='o_column_sortable'][1]" )
    public WebElement verificationKanbanList;

    @FindBy(xpath =  "((//div[@class='modal-footer'])[3]//span)[1]" )
    public WebElement warningOkButton;


    @FindBy(xpath =  "//div[@class='modal-footer']//button//span" )
    public WebElement confirmationOkButton;

    @FindBy(xpath = "(//div[@class='modal-body'])[4]" )
    public WebElement discardWarning;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement newNote;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionButton;
    //*[contains(text(),'Action')]
    //      (//button[@data-toggle='dropdown'])[1]    //(//ul[@class='dropdown-menu'])[5]/../button
    @FindBy(xpath = "(//a[@data-section='other'])[1]")
    public WebElement deleteButton;
    //((//ul[@role='menu'])[7]/li/a)[1]
//      ((//ul[@role='menu'])[7]/li/a)[1]
    //(//a[@data-section='other'])[1]


    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement confirmationDeleteButton;














}
