package com.centrilli.pages;

import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userName;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongEmailPasswordAlert;

    @FindBy(xpath = "//*[text() = 'Reset Password']")
    public WebElement resetBtnLink;





    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameInput.sendKeys("posmanager10@info.com");
        passwordInput.sendKeys("posmanager");
        loginButton.click();
    }

    public void login2(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        usernameInput.sendKeys("salesmanager10@info.com");
        passwordInput.sendKeys("salesmanager");
        loginButton.click();
    }


}
