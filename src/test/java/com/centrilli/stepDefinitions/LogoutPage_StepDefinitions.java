package com.centrilli.stepDefinitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.pages.LogoutPage;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LogoutPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("User is logged in the application")
    public void user_is_logged_in_the_application() {
        loginPage.login();
    }

    @When("user clicks username")
    public void user_clicks_username() {
        logoutPage.username.click();
    }

    @When("user clicks logout option")
    public void user_clicks_logout_option() {
        logoutPage.dropdownLogout.click();
    }

    @When("user is logged out")
    public void userIsLoggedOut() {
        loginPage.login();
        logoutPage.logout();
    }

    @And("user clicks back button")
    public void userClicksBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user sees warning message Odoo Session expired")
    public void userSeesWarningMessageOdooSessionExpired() {
        Assert.assertTrue(logoutPage.sessionExpiredMessage.getText().equals("Odoo Session Expired"));
        System.out.println("Message = " + logoutPage.sessionExpiredMessage.getText());
    }
}
