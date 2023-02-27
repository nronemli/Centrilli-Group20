package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;


public class LogoutPage extends BasePage {
    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement username;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement dropdownLogout;

    @FindBy(className = "modal-title")
    public WebElement sessionExpiredMessage;

    public void logout(){
        username.click();
        dropdownLogout.click();
    }






}
