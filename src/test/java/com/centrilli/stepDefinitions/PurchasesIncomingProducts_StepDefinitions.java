package com.centrilli.stepDefinitions;

import com.centrilli.pages.PurchasesIncomingProductsPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class PurchasesIncomingProducts_StepDefinitions {



    PurchasesIncomingProductsPage purchasesIncomingProductsPage = new PurchasesIncomingProductsPage();

    public String first;
    public String second;

    @When("user clicks on Purchases module")
    public void user_clicks_on_purchases_module() {
        BrowserUtil.sleep(2);
       purchasesIncomingProductsPage.PurchasesButton.click();
    }


    @And("user clicks on Incoming Products")
    public void userClicksOnIncomingProducts() {
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.IncomingProductBtn.click();
    }

    @And("user clicks on Create button")
    public void userClicksOnCreateButton() {
        BrowserUtil.sleep(4);
        purchasesIncomingProductsPage.CreateBtn.click();
        BrowserUtil.sleep(3);

    }



    @And("user enters Partner LocationsCustomers Source in Location input box")
    public void userEntersPartnerLocationsCustomersSourceInLocationInputBox() {
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.SourceLocationInputBox.click();
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.partnerLocationsCust.click();
        BrowserUtil.sleep(2);
    }



    @And("user enters Partner LocationsVendors in Destination Location input box")
    public void userEntersPartnerLocationsVendorsInDestinationLocationInputBox() {



            BrowserUtil.sleep(2);
            purchasesIncomingProductsPage.DestinationLocationInputBox.click();
            BrowserUtil.sleep(5);
            //BrowserUtil.waitForVisibility(purchasesIncomingProductsPage.locationsCustomer);
            purchasesIncomingProductsPage.locationsCustomer.click();




    }

  //  @And("user enters {string} in Destination Location input box")
   // public void userEntersInDestinationLocationInputBox(String arg0) {
    //    BrowserUtil.sleep(4);
     //  purchasesIncomingProductsPage.DestinationLocationInputBox.sendKeys(arg0 + Keys.ENTER);


  //  }


    @And("user enters Product in Product input box")
    public void userEntersProductInProductInputBox() {
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.ProductInputBox.click();
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.iceCreamProduct.click();

    }

    @Then("user clicks SAVE button")
    public void userClicksSAVEButton() {
        BrowserUtil.sleep(4);
        purchasesIncomingProductsPage.SaveBtn.click();




    }

    @Then("Verify that the user can create Incoming Product")
    public void verifyThatTheUserCanCreateIncomingProduct() {
        BrowserUtil.waitForVisibility(purchasesIncomingProductsPage.verifyIceCream);
        //purchasesIncomingProductsPage.verifyIceCream.isDisplayed();
        //Assert.assertTrue(purchasesIncomingProductsPage.verifyIceCream.isDisplayed());
        Assert.assertEquals("[13] Ice Cream",purchasesIncomingProductsPage.verifyIceCream.getText());
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());
        System.out.println(purchasesIncomingProductsPage.verifyIceCream.getText());
        BrowserUtil.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("13"));

    }

    @Then("user delete created incoming product")
    public void userDeleteCreatedIncomingProduct() {
       BrowserUtil.sleep(5);
        System.out.println("purchasesIncomingProductsPage.actionDropdown.isDisplayed() = " + purchasesIncomingProductsPage.actionDropdown.isDisplayed());
        purchasesIncomingProductsPage.actionDropdown.click();
        System.out.println("purchasesIncomingProductsPage.actionDropdown.getText() = " + purchasesIncomingProductsPage.actionDropdown.getText());
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.deleteBtn.click();
        BrowserUtil.sleep(2);
    }

    @And("user clicks Kanban Button")
    public void userClicksKanbanButton() {
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.kanbanBtn.click();
    }



    @Then("verify that user can switch kanban view")
    public void verifyThatUserCanSwitchKanbanView() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(purchasesIncomingProductsPage.verifykanbanView.isDisplayed());
        BrowserUtil.sleep(2);
    }


    @Then("user click on Discard button")
    public void userClickOnDiscardButton() {
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.discardButton.click();
        BrowserUtil.sleep(2);
        purchasesIncomingProductsPage.okButtonDiscardWarningPopup.click();

    }



    @Then("verify that user can discard changes and back incoming products page")
    public void verifyThatUserCanDiscardChangesAndBackIncomingProductsPage() {
        BrowserUtil.sleep(2);
        Assert.assertTrue(purchasesIncomingProductsPage.incomingProductPageVerify.isDisplayed());
    }

    @And("user clicks right arrow")
    public void userClicksRightArrow() {
        BrowserUtil.sleep(2);
        first = purchasesIncomingProductsPage.firstProductName.getText();
        System.out.println("purchasesIncomingProductsPage.firstProductName.getText() = " + purchasesIncomingProductsPage.firstProductName.getText());

        BrowserUtil.sleep(3);
        purchasesIncomingProductsPage.rightArrowButton.click();

        BrowserUtil.sleep(3);

        second = purchasesIncomingProductsPage.firstProductName.getText();
        System.out.println("purchasesIncomingProductsPage.firstProductName.getText() = " + purchasesIncomingProductsPage.firstProductName.getText());
    }

    @Then("verify that user can move to the next page")
    public void verifyThatUserCanMoveToTheNextPage() {

        BrowserUtil.sleep(2);
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        Assert.assertNotEquals("Failed",first,second);
    }
}
