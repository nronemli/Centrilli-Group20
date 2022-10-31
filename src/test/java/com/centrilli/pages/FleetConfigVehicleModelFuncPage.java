package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetConfigVehicleModelFuncPage {

    public FleetConfigVehicleModelFuncPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[@class=\"caret\"]")
    public WebElement morebtn;


    @FindBy(xpath = "//span[normalize-space(text()) = 'Fleet']")
    public WebElement fleetButton;

    @FindBy (xpath = "//*[contains(text(), 'Vehicle Model')]")
    public WebElement vehicleModelButton;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement modelNameInputBox;

    @FindBy (xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement makeInputBox;

    //@FindBy (xpath = "//button[@accesskey='s']")
    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy (xpath = "//span[.='Create']")
    public WebElement createPopupBtn;

    @FindBy (xpath = "//span[@name='name']")
    public WebElement verifymodelpage;

    @FindBy (xpath = "//div[contains(@class,'notification')]")
    public WebElement errorMesage;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//h4[@class='modal-title']")
    public WebElement discardWarningPopupMessage;


    @FindBy (xpath = "//span[.='Ok']")
    public WebElement okButtonDiscardWarningPopup;

    @FindBy (xpath = "//li[.='Vehicle Model']")
    public WebElement vehicleModelPage;

    @FindBy (xpath = "//span[.='Cancel']")
    public WebElement cancelCreateMakePopup;

    @FindBy (xpath = "//title[.='Fori/F1 - Odoo']")
    public WebElement pageTitle;


   // @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    @FindBy (xpath = "//div[@class='o_cp_sidebar']//div//div[2]/button")
    public WebElement attachmentVerification;

    //@FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button")
    @FindBy (xpath = "//div[@class='o_cp_sidebar']//div//div[3]/button")
    public WebElement actionVerification;

   // @FindBy (xpath = "//div[@class='o_searchview']")
    //public WebElement searchBoxVehicleModel;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/th")
    public WebElement vehicleModelFind;

    // @FindBy(xpath = "//div[contains(@class, 'fa-sm')]")
   // @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div[2]")
    @FindBy(xpath = "//div[@class='o_searchview_facet']//div[2]")
    public WebElement makeCloseButton;




    @FindBy (xpath = "//button[@accesskey='n']")
    public WebElement rightArrowButton;

    @FindBy (xpath = "//button[@accesskey='p']")
    public WebElement leftArrowButton;


    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement pageNumBefore;


    //@FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/div/span[2]")
    @FindBy (xpath = "//div[@class='o_form_image_controls']//span[2]")
    public WebElement photoclear;


    @FindBy (xpath = "//div[@class='table-responsive']//tbody//tr//td[2]")
    public WebElement firstNameInPage;

    //comment











}
