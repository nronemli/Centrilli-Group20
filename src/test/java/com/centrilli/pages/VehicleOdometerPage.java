package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage extends BasePage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement moreButtonB35;


    @FindBy(xpath = "//*[contains(text(),'Vehicles Odometer')]")
    public WebElement vehiclesOdometerButton;


    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButtonB35;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleSelectBox;

    @FindBy(xpath = "//ul[@tabindex='0']//li[2]//a")
    public WebElement Volvo35;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input oe_inline']")
    public WebElement odometerValueBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_notification_manager']")
    public WebElement error35Message;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discard35Button;

    @FindBy(xpath = "//li[.='Vehicles Odometer']")
    public WebElement vehicleCreatePage;


    @FindBy(xpath = "//div[@class='btn-group o_dropdown'][3]")
    public WebElement actionButton35;


    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchButton35;

    @FindBy(xpath = "//li[@class='o-selection-focus']")
    public WebElement searchThing35;

    @FindBy(xpath = "(//th[@class='o_group_name'])[1]")
    public WebElement vehicleTable35;


    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanButton35;


    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement vehiclesOdometerValue;

}
