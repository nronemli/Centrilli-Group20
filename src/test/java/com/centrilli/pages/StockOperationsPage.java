package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockOperationsPage extends BasePage {

    public StockOperationsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[contains(text(), 'Transfers')]")
    public WebElement TransfersButtonStock;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement CreateButtonStock;


    @FindBy(xpath = "(//input[@class=\"o_input ui-autocomplete-input\"])[1]")
    public WebElement PartnerButtonStock;

    @FindBy(xpath = "//li[.='Additional Info']")
    public WebElement AdditionalInfoBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")
    public WebElement OperationalTypeBox;

    @FindBy(xpath = "//a[.='My Company, Chicago: Delivery Orders']")
    public WebElement OperationalTypeDropDown;

    @FindBy(xpath = "//a[.='Stock Operations']")
    public WebElement StockOperationDisplaying;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchingBox;


    @FindBy(xpath = "(//a[@href='#'])[12]/strong")
    public WebElement searchPartnerForButton;


    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkPartnerBox;


    @FindBy(xpath = "//*[contains(text(), 'Action')]")
    public WebElement actionButton35;

    @FindBy(xpath = "//*[contains(text(), 'Delete')]")
    public WebElement deleteButton35;

    @FindBy(xpath = "//button[*='Ok']")
    public WebElement ok35Button;


}
