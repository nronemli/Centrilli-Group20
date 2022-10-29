package com.centrilli.stepDefinitions;
import com.centrilli.pages.LoginPage;
import com.centrilli.pages.SalesFunctionalityPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class SalesFunctionality_StepDefinitions {

    SalesFunctionalityPage salesFunctionalityPage = new SalesFunctionalityPage();

    LoginPage loginPage = new LoginPage();

    @When("user clicks on sales module and then customers module")
    public void user_clicks_on_sales_module_and_then_customers_module() {
        loginPage.login2();
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.salesButton));
        salesFunctionalityPage.salesButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.customerButton));
        salesFunctionalityPage.customerButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.customerCreateButton));
        salesFunctionalityPage.customerCreateButton.click();
        BrowserUtil.sleep(5);

    }


    @And("user clicks create button")
    public void userClicksCreateButton() {
        BrowserUtil.sleep(3);
        salesFunctionalityPage.customerCreateButton.click();
        BrowserUtil.sleep(2);

    }



    @And("user types a customer {string}")
    public void userTypesACustomer(String name) {
        BrowserUtil.sleep(2);
        salesFunctionalityPage.customerCreateName.sendKeys(name);

        BrowserUtil.sleep(2);
    }

    @And("user clicks create contact button and type contact {string}")
    public void userClicksCreateContactButtonAndTypeContact(String name) {
        BrowserUtil.sleep(2);
        salesFunctionalityPage.createContactButton.click();
        BrowserUtil.sleep(2);
        salesFunctionalityPage.contactName.sendKeys(name);
        BrowserUtil.sleep(2);
        salesFunctionalityPage.contactSaveCloseButton.click();
    }

    @Then("user clicks save button")
    public void userClicksSaveButton() {
        salesFunctionalityPage.saveButtonToCreateCustomer.click();
        BrowserUtil.sleep(3);
    }


    @And("verify that user see the customer name on page")
    public void verifyThatUserSeeTheCustomerNameOnPage() {
    Assert.assertTrue(salesFunctionalityPage.verification.isDisplayed());
    }

    @And("User click on discard button")
    public void userClickOnDiscardButton() {
        salesFunctionalityPage.discardButton.click();
    }

    @Then("Verify that user cancel creating by clicking Discard button")
    public void verifyThatUserCancelCreatingByClickingDiscardButton() {
        Assert.assertTrue(salesFunctionalityPage.discardVerification.isDisplayed());
    }


    @And("Verify that page title is changed to the new Customer name after user create the Customer {string}")
    public void verifyThatPageTitleIsChangedToTheNewCustomerNameAfterUserCreateTheCustomer(String name) {
        String actualTitle =  Driver.getDriver().getTitle();
        String expectedTitle = name + " - Odoo";
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("Verify that “Contact created” message is displayed at the")
    public void verifyThatContactCreatedMessageIsDisplayedAtThe() {
        Assert.assertTrue(salesFunctionalityPage.contactCreatedVerification.isDisplayed());
    }


    @And("User clicks customers clicks searchbox and type {string} and press enter")
    public void userClicksCustomersClicksSearchboxAndTypeAndPressEnter(String name) {
        salesFunctionalityPage.customerButton.click();
        BrowserUtil.sleep(3);
        salesFunctionalityPage.searchBox.sendKeys("Ali Gungor" + Keys.ENTER);
        BrowserUtil.sleep(2);

    }

    @And("Verify that user can find the {string} under Customers list by using search box.")
    public void verifyThatUserCanFindTheUnderCustomersListByUsingSearchBox(String name) {
        String actualResult = salesFunctionalityPage.customerFind.getText();
        Assert.assertEquals(name,actualResult);
    }

    @And("user clicks list button")
    public void userClicksListButton() {
        salesFunctionalityPage.listButton.click();
    }


    @Then("Verify that user can change Customers display  Kanban to List")
    public void verifyThatUserCanChangeCustomersDisplayKanbanToList() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(salesFunctionalityPage.kanbanListVerification.isDisplayed());
    }


    @And("Verify that all Customers number increased one")
    public void verifyThatAllCustomersNumberIncreasedOne() {
        String before = salesFunctionalityPage.customerNumberBefore.getText();
        int number = Integer.parseInt(before);
        Assert.assertEquals(number,number-1);
 }


    @When("user clicks on sales module and then customers module {string} and get the customer amount before create,verify")
    public void userClicksOnSalesModuleAndThenCustomersModuleAndGetTheCustomerAmountBeforeCreate(String name) {
        loginPage.login2();
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.salesButton));
        salesFunctionalityPage.salesButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.customerButton));
        salesFunctionalityPage.customerButton.click();
        BrowserUtil.sleep(2);
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.visibilitycustomer));
        String number = salesFunctionalityPage.customerNumberBefore.getText();
        int n1 = Integer.parseInt(number);
        BrowserUtil.sleep(1);
        salesFunctionalityPage.customerCreateButton.click();

        BrowserUtil.sleep(2);
        salesFunctionalityPage.customerCreateName.sendKeys(name);
        BrowserUtil.sleep(2);
        salesFunctionalityPage.saveButtonToCreateCustomer.click();
        BrowserUtil.sleep(3);
        salesFunctionalityPage.customerButton.click();
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.customerButton));
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.visibilitycustomer));
        String number2 = salesFunctionalityPage.customerNumberBefore.getText();
        int n2 = Integer.parseInt(number2);
        Assert.assertEquals(n1 + 1,n2);


    }

    @And("verify that user cant save without typing name")
    public void verifyThatUserCantSaveWithoutTypingName() {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.visibilityOf(salesFunctionalityPage.emptyName));
        Assert.assertTrue(salesFunctionalityPage.emptyName.isDisplayed());
    }
}
