package com.centrilli.stepDefinitions;

import com.centrilli.pages.BasePage;
import com.centrilli.pages.InventoryPage;
import com.centrilli.pages.LoginPage;
import com.centrilli.pages.ProductsPage;
import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public final class InventoryFunctionality_StepDefinitions{

    LoginPage loginPage = new LoginPage();

   // BasePage basePage = new BasePage();

    InventoryPage inventoryPage = new InventoryPage();

    ProductsPage productsPage = new ProductsPage();

    public int numberOfProductBeforeCreation;


    @Given("User is on Products page under Inventory module")
    public void user_is_on_products_page_under_inventory_module() {

        loginPage.login();

        BrowserUtil.sleep(2);
        inventoryPage.InventoryButton.click();

        BrowserUtil.sleep(2);
        inventoryPage.productsHyperlink.click();


    }

    @When("User clicks on Create button next to the Import button")
    public void user_clicks_on_create_button_next_to_the_import_button() {

        productsPage.createButton.click();

    }

    @When("User types {string} product name into Product Name input box")
    public void user_types_product_name_into_product_name_input_box(String productName) {
        BrowserUtil.sleep(2);
        productsPage.productNameInputBox.sendKeys(productName);
    }

    @When("User clicks on Save button next to the Discard button")
    public void user_clicks_on_save_button_next_to_the_discard_button() {

        BrowserUtil.sleep(2);
        productsPage.saveButton.click();

    }

    @Then("Verify that {string} product name is contained on the name of the page.")
    public void verify_that_given_product_name_is_contained_on_the_name_of_the_page(String productName) {

        BrowserUtil.sleep(2);
        String expectedPageName = productName;
        String actualPageName = Driver.getDriver().getTitle();

        Assert.assertTrue("Product name is NOT contained on the name of the page", actualPageName.contains(expectedPageName));


    }

    @Then("Verify that warning message appears on the top right corner of the page")
    public void verify_that_warning_message_appears_on_the_top_right_corner_of_the_page() {

        BrowserUtil.sleep(1);
        Assert.assertTrue(productsPage.warningMessage.isDisplayed());

    }

    @When("User clicks on Discard button next to the Save button")
    public void user_clicks_on_discard_button_next_to_the_save_button() {

        productsPage.discardButton.click();

    }

    @Then("Verify that current title of the page is  {string}")
    public void verify_that_current_title_of_the_page_is(String string) {

        BrowserUtil.sleep(2);

        String expectedTitle = string;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("The title does not match!", expectedTitle, actualTitle);


    }

    @Then("Verify that {string} product name is contained on the title of the page.")
    public void verify_that_given_product_name_is_contained_on_the_title_of_the_page(String productName) {

        BrowserUtil.sleep(1);
        String expectedTitle = productName;
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Product name is NOT contained on the name of the page", actualTitle.contains(expectedTitle));


    }

    @Then("Verify that creation message is displayed at the bottom of the page \\(after creating a new Product)")
    public void verify_that_creation_message_is_displayed_at_the_bottom_of_the_page_after_creating_a_new_product() {

        BrowserUtil.sleep(2);
        Assert.assertTrue(productsPage.productTemplateCreatedMessage.isDisplayed());
    }

    @When("User clicks on the Products hyperlink  on the left side of the page")
    public void user_clicks_on_the_products_hyperlink_on_the_left_side_of_the_page() {

        inventoryPage.productsHyperlink.click();
    }

    @When("User types the {string} product name into Search box on the top right corner of the page and press enter")
    public void user_types_the_product_name_into_search_box_on_the_top_right_corner_of_the_page_and_press_enter(String productName) {

        BrowserUtil.sleep(2);
        productsPage.searchInputBox.sendKeys(productName+ Keys.ENTER);

    }

    @Then("Verify that user can find the new created Product under Product list by using search box")
    public void verify_that_user_can_find_the_new_created_product_under_product_list_by_using_search_box() {

        BrowserUtil.sleep(2);
        Assert.assertTrue(productsPage.firstKanbanResult.isDisplayed());

    }

    @When("User clicks on the List button at the top right corner of the page")
    public void user_clicks_on_the_list_button_at_the_top_right_corner_of_the_page() {

        productsPage.listButton.click();
        BrowserUtil.sleep(2);
        Assert.assertTrue(productsPage.listViewTable.isDisplayed());



    }
    @When("User clicks on the Kanban button at the top right corner of the page")
    public void user_clicks_on_the_kanban_button_at_the_top_right_corner_of_the_page() {

        productsPage.kanbanButton.click();


    }
    @Then("Verify that user changed back to Kanban view")
    public void verify_that_user_changed_back_to_kanban_view() {

        BrowserUtil.sleep(2);
        Assert.assertTrue(productsPage.kanbanViewArea.isDisplayed());

    }

    @When("User views the current total product number")
    public void user_views_the_current_total_product_number() {

        BrowserUtil.sleep(2);
        int anInt = Integer.parseInt(productsPage.currentTotalProductNumber.getText());
        numberOfProductBeforeCreation = anInt;

    }

    @Then("Verify that the number of Product \\(at the top right corner of the page, left to the left arrow button) increased by one")
    public void verify_that_the_number_of_product_at_the_top_right_corner_of_the_page_left_to_the_left_arrow_button_increased_by_one() {

        BrowserUtil.sleep(2);
        int numberOfProductAfterCreation = Integer.parseInt(productsPage.currentTotalProductNumber.getText());

        Assert.assertEquals((numberOfProductBeforeCreation+1),numberOfProductAfterCreation);

    }


}
