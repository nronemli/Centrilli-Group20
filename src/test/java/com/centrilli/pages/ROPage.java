package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ROPage extends BasePage{

    public ROPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButtonForRepairOrders;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement productToRepairInputBox;

    @FindBy(xpath = "(//li[@tabindex='-1'])[1]")
    public WebElement productInDropdown;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement repairSaveButton;

    @FindBy(xpath = "//a[@name='product_id']")
    public WebElement productToRepairInfo;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButtonForRepairs;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_mobile o_kanban_ungrouped']")
    public WebElement kanbanViewAreaForRepairs;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButtonForRepairs;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement listViewAreaForRepairs;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButtonForRepairs;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButtonForRepairs;

    @FindBy(xpath = "//tr[@class='o_data_row text-info']//td[2]")
    public WebElement firstRepairOrderOnTheList;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement actionButtonForRepairs;

    @FindBy(xpath = "(//a[@data-index='0'])[2]")
    public WebElement deleteButtonForRepairs;

    @FindBy(xpath = "//span[text()='Ok']")
    public WebElement okButtonForRepairs;

    @FindBy(linkText = "Repair Orders")
    public WebElement repairOrdersLink;

    public String formerFirstRepairOrderNameOnTheList;
    public String newFirstRepairOrderNameOnTheList;




}
