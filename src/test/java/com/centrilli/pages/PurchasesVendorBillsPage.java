package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasesVendorBillsPage extends BasePage {

    public PurchasesVendorBillsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@href='/web#menu_id=515&action=687']")
    public WebElement vendorBillsHyperlink;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "(//input[contains(@id,'o_field_input')])[2]")
    public WebElement vendorInputBox;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy (xpath = "(//a[contains(@id,'o_field_input_')])[1]")
    public WebElement afterCreationVendorName;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy (xpath = "//div[@class='o_kanban_view o_kanban_mobile o_kanban_ungrouped']")
    public WebElement kanbanViewArea;

    @FindBy (xpath = "//tbody[@class='ui-sortable']")
    public WebElement listViewTable;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement warningMessageOkButton;

    @FindBy (xpath = "(//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement listViewFirstResult;

    @FindBy (xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy (xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement actionButton;

    @FindBy (xpath = "(//a[@data-index='0'])[2]")
    public WebElement deleteOption;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement confirmationMessageOkButton;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement vendorBillCount;































}
