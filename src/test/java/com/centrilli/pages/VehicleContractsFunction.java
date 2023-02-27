package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsFunction extends BasePage{

    public VehicleContractsFunction(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement moreModule;

    @FindBy(xpath = "//*[contains(text(),'Fleet')]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[contains(text(),'Vehicles Contracts')]")
    public WebElement vehicleContracts;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement inputVheicleName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_loading']")
    public WebElement emptyVehicleName;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//*[contains(text(),'Attachment(s)')]")
    public WebElement attachmentsButton;

    @FindBy(xpath = "//*[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//button[@accesskey='p']")
    public WebElement leftArrowKey;

    @FindBy(xpath = "//button[@accesskey='n']")
    public WebElement rightArrowKey;

    @FindBy(xpath = "//td[.=' /Bmw/316/ti/pak234']")
    public WebElement vehicleName;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@class='fa fa-sm fa-remove o_facet_remove']")
    public WebElement removeInProgressOption;

    @FindBy(xpath = "//div[@class='o_view_manager_content']")
    public WebElement kanbanPage;

    @FindBy(xpath = "//span[@class='o_pager_value']")
    public WebElement rightArrowVerification;

    @FindBy(xpath = "//div[@class='o_thread_message_content']/p")
    public WebElement vehicleCreatedMessage;





}
