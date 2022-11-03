package com.centrilli.pages;

import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleFuelLogsPage extends BasePage {

    Faker faker = new Faker();

    public VehicleFuelLogsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButtonFuel;

    @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicleInputDropdown;

    @FindBy(xpath = "(//a[.='Audi/A1/'])[1]")
    public WebElement vehicleOption;

    @FindBy(xpath = "(//input[@name='odometer'])[1]")
    public WebElement odometerInputBox;

    @FindBy(xpath = "(//input[@name='liter'])[1]")
    public WebElement literInputBox;

    @FindBy(xpath = "(//input[@name='price_per_liter'])[1]")
    public WebElement priceInputBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement fuelSaveButton;

    @FindBy(xpath = "//title[.='Audi/A1/    - Odoo']")
    public WebElement actualTitleFuel;


    @FindBy(xpath = "//span[@class='o_icon fa fa-3x fa-exclamation']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement fuelDiscard;

    @FindBy (xpath = "//title[.='Vehicles Fuel Logs - Odoo']")
    public WebElement vehicleFuelActualTitle;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement attachmentsModule;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionsModule;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement vehicleFuelLogSearchBox;

    @FindBy(xpath = "(//span[normalize-space(text()) = 'Audi/A1/'])[1]")
    public WebElement kanbanViewResult;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listViewButton;
    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graphViewButton;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement listViewArea;

    @FindBy (xpath = "//div[@class='o_kanban_header']")
    public WebElement kanbanViewArea;

    @FindBy (xpath = "//div[@class='o_graph']")
    public WebElement graphViewArea;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement xMarkToRemoveLabel;

    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement pageNumberRange;

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement pageNextArrowButton;

    @FindBy(xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement pagePreviousArrowButton;

    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement totalNumbers;

    public int logsCount;
    public int newLogsCount;
    public void createFuelLog (){
        createButtonFuel.click();
        vehicleInputDropdown.click();
        vehicleOption.click();
        BrowserUtil.waitForVisibility(odometerInputBox);
        odometerInputBox.clear();
        odometerInputBox.sendKeys(faker.numerify("###"));
        literInputBox.clear();
        literInputBox.sendKeys(faker.numerify("#"));
        priceInputBox.clear();
        priceInputBox.sendKeys(faker.numerify("###"));
        fuelSaveButton.click();
        BrowserUtil.sleep(2);
    }

















}
