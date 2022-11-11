package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]/input")
    public WebElement SourceLocationInputBox;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]/input")
    public WebElement DestinationLocationInputBox;


    @FindBy(xpath = "(//li[@class='ui-menu-item'])[3]/a")
    public WebElement locationsCustomer;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[3]/input")
    public WebElement ProductInputBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement SaveBtn;

    @FindBy(xpath = "(//span[@class='o_dropdown_button'])[1]")
    public WebElement sourceLocationDropdownBtn;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[1]/a")
    public WebElement partnerLocationsCust;

    //@FindBy(xpath = "(//*[contains(text(), 'Locations/Vendors')])[1]")
    //@FindBy(xpath = "(//ul[contains(@class,'ui-autocomplete')])[1]/li[5]")
    @FindBy(xpath = "(//li[@class='ui-menu-item'])[2]")
    public WebElement partnerLocationsVendors;


    @FindBy(xpath = "(//li[@class='ui-menu-item'])[17]/a")
    public WebElement iceCreamProduct;

    @FindBy(xpath = "//a[@name='product_id']")
    public WebElement verifyIceCream;


  // @FindBy(xpath = "(//button[@aria-expanded='false'])[3]/span")
   @FindBy(xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement actionDropdown;

    // @FindBy(xpath = "(//ul[@class='dropdown-menu'])[5]")
    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Delete')]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[@accesskey='l']" )
    public WebElement listBtn;

    @FindBy(xpath = "//button[@accesskey='k']" )
    public WebElement kanbanBtn;



    @FindBy(xpath = "//div[@class='o_view_manager_content']/div/div")
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
