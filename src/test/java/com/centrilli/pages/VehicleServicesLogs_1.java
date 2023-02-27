package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServicesLogs_1 extends BasePage {

    public VehicleServicesLogs_1(){

         PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "//b[@class=\"caret\"]")
    public WebElement Morebtn;

    @FindBy(xpath = "//*[contains(text(),'Fleet')]")
    public WebElement FleetButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[21]/ul[1]/li[6]/a/span")
    public WebElement VehicleSerLogs;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement CreateBtn;

    @FindBy(xpath = "(//div[@class='o_input_dropdown']//input)[1]")
    public WebElement Vehicle;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement SaveBtn;


    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement ErrorMsj;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement DiscardBtn;


    @FindBy(xpath = "//*[contains(text(),'Ok')]")
    public WebElement OkBtn;

   // @FindBy(xpath = "//h4[@class='modal-title']")
    //public WebElement WarningMsj;

    @FindBy(xpath = "(//li[@class='ui-menu-item']//a)[1]")
    public WebElement AudiBtn;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown']/button)[2]")
    public WebElement AttachBtn;

    @FindBy(xpath = "(//div[@class='btn-group o_dropdown']/button)[3]")
    public WebElement ActionBtn;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement SearchBox;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement ListBtn;

    @FindBy(xpath = "//div[@class='o_content']")
    public WebElement ListTable;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement KanbanBtn;

    @FindBy(xpath = "//div[@class='o_main']")
    public WebElement KanbanTable;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement GraphBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement GraphDisplayed;






}








