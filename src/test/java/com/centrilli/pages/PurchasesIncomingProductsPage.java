package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesIncomingProductsPage {

    public PurchasesIncomingProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space(text()) = 'Purchases']")
    public WebElement PurchasesButton;

    @FindBy(xpath = "//*[contains(text(),'Incoming')]")
    public WebElement IncomingProductBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement CreateBtn;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement SourceLocationInputBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement DestinationLocationInputBox;


    @FindBy(xpath = "(//li[@class='ui-menu-item'])[3]")
    public WebElement locationsCustomer;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement ProductInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "(//span[@class='o_dropdown_button'])[1]")
    public WebElement sourceLocationDropdownBtn;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]")
    public WebElement partnerLocationsCust;

    //@FindBy(xpath = "(//*[contains(text(), 'Locations/Vendors')])[1]")
    //@FindBy(xpath = "(//ul[contains(@class,'ui-autocomplete')])[1]/li[5]")
    @FindBy(xpath = "(//li[@class='ui-menu-item'])[2]")
    public WebElement partnerLocationsVendors;


    @FindBy(xpath = "(//*[contains(text(),'Ice Cream')])[1]")
    public WebElement iceCreamProduct;

    @FindBy(xpath = "//span[@class='o_field_char o_field_widget o_readonly_modifier']")
    public WebElement verifyIceCream;


   @FindBy(xpath = "(//button[@aria-expanded='false'])[3]/span")
    public WebElement actionDropdown;

   @FindBy(xpath = "(//ul[@class='dropdown-menu'])[5]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@accesskey='l']" )
    public WebElement listBtn;

    @FindBy(xpath = "//button[@accesskey='k']" )
    public WebElement kanbanBtn;


    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_mobile o_kanban_ungrouped']")
    public WebElement verifykanbanView;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//span[.='Ok']")
    public WebElement okButtonDiscardWarningPopup;

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement incomingProductPageVerify;

    @FindBy (xpath = "//button[@accesskey='n']")
    public WebElement rightArrowButton;

    @FindBy(xpath = "(//div[@class='table-responsive']//tbody//tr//td[5])[1]")
    public WebElement firstProductName;












}
