package com.centrilli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    /*so in invisibility we have here

    public ContactsPage(){

    super();

    inside this super we have

    PageFactory.initElements(Driver.getDriver(),this);

    }

     */

    public ContactsPage(){

        //we can delete the lines between 24-33 and nothing would change

        // we dont even need this constructor if we just extend to the BasePage - the basePages constructor
        // will call the driver instance


        // no need to do below
        //PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[normalize-space(text()) = 'Contacts']")
    public WebElement ContactsButton;

   //@FindBy(xpath = "//li[@class='active']//span")
   //public WebElement contactBtn;


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "//input[@name ='name']")
    public WebElement NameBtn;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement VerifyDone;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement KanbanBtn;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement ListBtn;

    @FindBy(xpath = "//div[@class='o_main_content']")
    public WebElement ListPageDisplayed;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement DiscardBtn;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement WarningMsj;

    @FindBy(xpath = "(//div[@class='modal-footer'])//button[1]")
    public WebElement OkBtn;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement EditBtn;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement StreetBtn;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement SheetDis;


    @FindBy(xpath = "//*[contains(text(), ' Action ')]")
    public WebElement ActionBtn;

    @FindBy(xpath = "(//a[@data-section='other'])[1]")
    public WebElement DeleteBtn;

   @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement ConfTitle;

    //@FindBy(xpath = "//div[@class='o_view_manager_content']")
   // public WebElement HomePage;

    //@FindBy(xpath = "//span[@class='o_pager_limit']")
    //public WebElement beforeCounter;

    @FindBy(xpath = "(//div[@class='modal-footer'])//span[1]")
    public WebElement OkButton;


    //@FindBy(xpath = "//div[@class='o_view_manager_content']")
    //public WebElement VerifyPage;

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement ContactsPage;

    // (//span[@class='o_pager_counter'])[1]

}
