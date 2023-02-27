package com.centrilli.stepDefinitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public final class LoginPage_StepDefinitions{

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should login to the application")
    public void user_should_login_to_the_application() {
        String expectedUserName = "POSManager10";
        String actualUserName = loginPage.userName.getText();
        System.out.println("loginPage.userName.getText() = " + loginPage.userName.getText());
        Assert.assertEquals("User name doesnt match", expectedUserName, actualUserName);
        Driver.closeDriver();
    }

    @Then("user sees warning message displayed Wrong login password")
    public void userSeesWarningMessageDisplayedWrongLoginPassword() {
        Assert.assertTrue(loginPage.wrongEmailPasswordAlert.isDisplayed());
        System.out.println("AlertMessage:" + loginPage.wrongEmailPasswordAlert.getText());
    }

    @Then("user sees warning message Please fill out this field")
    public void userSeesWarningMessagePleaseFillOutThisField() {
        System.out.println("Cannot display this yet!!!");
    }

    @When("user clicks to reset password link")
    public void userClicksToResetPasswordLink() {
        loginPage.resetBtnLink.click();
    }

    @Then("user lands on reset password page")
    public void userLandsOnResetPasswordPage() {
        System.out.println("Page title = " + Driver.getDriver().getTitle());
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Reset password"));
    }

    @Then("user enters enter key from keyboard")
    public void userEntersEnterKeyFromKeyboard() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("Page Title = " + Driver.getDriver().getTitle());
        Assert.assertTrue(actualTitle.equals("Odoo"));
    }


    @Then("user should see bullet signs in {string}> inputbox")
    public void userShouldSeeBulletSignsInInputbox(String string) {
        /*
        loginPage.passwordInput.sendKeys(string.contains("*"));
        if(){
            System.out.println("Default bullet");
        }
        */
    }

    @Then("user should login and see their {string}")
    public void userShouldLoginAndSeeTheir(String string1) {
        String actualUserName = loginPage.userName.getText();
        //  System.out.println("loginPage.userName.getText() = " + loginPage.userName.getText());
        Assert.assertEquals("User name doesnt match", string1, actualUserName);
    }


}
