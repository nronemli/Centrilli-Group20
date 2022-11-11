package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairOrdersPage {

    public RepairOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space(text()) = 'Repairs']")
    public WebElement RepairsBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]/input")
    public WebElement productToRepair;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[3]/a")
    public WebElement tShirt;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])[2]/a")
    public WebElement iceCream;

    @FindBy(xpath = "//a[@name='product_id']")
    public WebElement verifyProductName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement actionBtn;

    @FindBy(xpath = "((//ul[@class='dropdown-menu'])[5]//li//a)[1]")
    public WebElement deleteBtn;

    @FindBy(xpath =  "//div[@class='modal-footer']//button//span" )
    public WebElement confirmationOkBtn;

    @FindBy(xpath = "(//span[@class='o_pager_limit'])[1]")
    public WebElement afterRepairOrderCount;

    @FindBy(xpath = "//button[@accesskey='a']" )
    public WebElement editBtn;

    @FindBy(xpath = "//button[@accesskey='k']" )
    public WebElement kanbanBtn;

    @FindBy(xpath = "//div[@class='o_view_manager_content']/div/div")
    public WebElement verifykanbanView;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardBtn;

    @FindBy(xpath =  "//div[@class='modal-footer']//button//span" )
    public WebElement warningOkBtn;










}
