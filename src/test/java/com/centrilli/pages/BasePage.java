package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space(text()) = 'Calendar']")
    public WebElement CalenderButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Notes']")
    public WebElement NotesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Contacts']")
    public WebElement ContactsButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'CRM']")
    public WebElement CrmButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Sales']")
    public WebElement SalesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Website']")
    public WebElement WebsiteButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Point of Sale']")
    public WebElement PointOfSaleButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Purchases']")
    public WebElement PurchasesButton;

    @FindBy(xpath = "(//*[contains(text(),'Inventory')])[1]")
    public WebElement InventoryButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Manufacturing']")
    public WebElement ManufacturingButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Repairs']")
    public WebElement RepairsButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Project']")
    public WebElement ProjectButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Events']")
    public WebElement EventsButton;

    @FindBy(xpath = "(//*[contains(text(),'Surveys')])[1]")
    public WebElement SurveysButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Employees']")
    public WebElement EmployeesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Attendances']")
    public WebElement AttendancesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Leaves']")
    public WebElement LeavesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Expenses']")
    public WebElement ExpensesButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Maintenance']")
    public WebElement MaintenanceButton;

    @FindBy(xpath = "//*[contains(text(),'Fleet')]")
    public WebElement FleetButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Dashboard']")
    public WebElement DashboardButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Vehicles Fuel Logs']")
    public WebElement VehicleFuelLogsButton;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Repairs']")
    public WebElement repairButton;







}
