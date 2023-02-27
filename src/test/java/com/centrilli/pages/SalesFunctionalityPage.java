package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesFunctionalityPage extends BasePage {

    public SalesFunctionalityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[contains(text(),'Customers')])[2]")
    public WebElement customerButton;

    @FindBy(xpath = "(//*[contains(text(),'Sales')])[2]")
    public WebElement salesButton;

    @FindBy(xpath = "(//button[@accesskey='c'])[1]")
    public WebElement customerCreateButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement customerCreateName;

    @FindBy(xpath = "(//button[@accesskey='c'])[2]")
    public WebElement createContactButton;

    @FindBy(xpath = "(//input[@name='name'])[2]")
    public WebElement contactName;

    @FindBy(xpath = "//*[contains(text(),'Save  & Close')]")
    public WebElement contactSaveCloseButton;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButtonToCreateCustomer;

    @FindBy(name = "name")
    public WebElement verification;

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement discardVerification;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//*[contains(text(),'Contact created')]")
    public WebElement contactCreatedVerification;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]")
    public WebElement customerFind;

    @FindBy(xpath = "(//th[@class='o_column_sortable'])[1]")
    public WebElement kanbanListVerification;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement customerNumberBefore;


    @FindBy(xpath = "(//div[@modifiers='{}'])[1]")
    public WebElement visibilitycustomer;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement emptyName;










}
