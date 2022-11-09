package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CRMCustomerPage {

    public CRMCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'Customers')]")
    public WebElement btn_customers;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement btn_create;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement btn_kanban;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement btn_list;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement txt_name;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement btn_editCustomer;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement txt_address;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement txt_email;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement btn_save;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement btn_discard;

    @FindBy(xpath = "//div[@class='modal-footer']//button[1]/span")
    public WebElement btn_Ok_Warning_Discard;

    @FindBy(xpath = "(//th[@class='o_column_sortable'])[1]")
    public WebElement nameTitleVerification;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement txt_searchBox;

    @FindBy(xpath = "//div[@class='oe_kanban_details']//span[contains(text(),'Nur Onemli')]")
    public WebElement foundCustomer;

    @FindBy(xpath = "//h1")
    public WebElement newCustomerName;

    public static void verifyTitleContains(String expected){
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.contains(expected));
    }

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement btn_action;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Delete')]")
    public WebElement btn_delete_actions;

    @FindBy(xpath = "//div[@class='modal-footer']//button//span")
    public WebElement btn_Ok_Confirmation;

    public String nameTitleVerification() {
        return nameTitleVerification.getText();
    }


}
