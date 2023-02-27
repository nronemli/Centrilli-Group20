package com.centrilli.pages;

import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointOfSalePage extends BasePage{

    public PointOfSalePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(text(),' Point of Sale')])[1]")
    public WebElement btnPointOSale;


    @FindBy(xpath = "(//span[contains(text(),' Point of Sale')])[2]")
    public WebElement btnPointOfSale;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement pointOfSaleName;

    @FindBy(xpath = "(//div[contains(@class,'input_dropdown')])[16]")
    public WebElement operationsTypeInput;

    @FindBy(xpath = "(//ul[contains(@class,'autocomplete')])[17]/li[6]")
    public WebElement returnOperationType;

    @FindBy(xpath = "//div[contains(@class,'form_buttons_edit')]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "(//li[@class='active'])[3]")
    public WebElement createdPointOfSaleTitle;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listbutton;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanbutton;

    @FindBy(xpath = "//button[@accesskey='j']")
            public WebElement discardbutton;

    @FindBy(xpath ="//button[@accesskey='a'] ")
            public WebElement editbutton;




    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    String pointOfSaleNameText="Istanbul";
    public void clickPointOfSale(){
        wait.until(ExpectedConditions.elementToBeClickable(btnPointOSale));
        BrowserUtil.sleep(2);
        btnPointOSale.click();
    }

    public void clickSecondPointOfSale(){
        btnPointOfSale.click();
    }


    public void clickCreateButton(){
        createButton.click();

    }


    public void pointOfSaleNameInput(){
        pointOfSaleName.sendKeys(pointOfSaleNameText);

    }

    public void selectOperationType(){

        operationsTypeInput.click();

    }

    public void selectInventory(){
        returnOperationType.click();
    }

    public void clickSaveAndVerify(){
        saveButton.click();
        BrowserUtil.waitForVisibility(createdPointOfSaleTitle);

        BrowserUtil.sleep(2);
        Assert.assertTrue(createdPointOfSaleTitle.getText().contains(pointOfSaleNameText));
    }


        public void clickListbutton(){
        listbutton.click();
         BrowserUtil.sleep(2);
         WebElement pageVerify=Driver.getDriver().findElement(By.xpath("//th[text()='Point of Sale Name']"));
         Assert.assertTrue("List is not displayed", pageVerify.isDisplayed());


}


        public void clickKanbanbutton(){
        kanbanbutton.click();
        BrowserUtil.sleep(2);

        WebElement kanbanVerify=Driver.getDriver().findElement(By.xpath("(//div[contains(text(),'Revel')])[1]"));
        Assert.assertTrue("Kanban board is not displayed", kanbanbutton.isDisplayed());

}

    public void editPointOfSale(){
        editbutton.click();

        Assert.assertTrue("Save button not displayed", saveButton.isDisplayed());
        Assert.assertTrue("Discard button not displayed", discardbutton.isDisplayed());




}

}

