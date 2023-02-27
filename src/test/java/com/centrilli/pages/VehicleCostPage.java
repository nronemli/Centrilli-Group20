package com.centrilli.pages;


import com.centrilli.utilities.BrowserUtil;
import com.centrilli.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleCostPage extends BasePage{

    public VehicleCostPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='More ']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Costs')]")
    public WebElement vehicleCostButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]/span")
    public WebElement vehicleDropDown;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[1]/input")
    public WebElement vehicleInput;

    //@FindBy(xpath = "(//li[@class='ui-menu-item'])[0]")
    @FindBy(xpath = "//a[text()='Audi/A1/']")
    public WebElement vehicleName;

    @FindBy(xpath = "(//div[@class='o_input_dropdown'])[2]/input")
    public WebElement typeInput;

    @FindBy(xpath = "//a[text()='Summer tires']")
    public WebElement typeSelect;

    @FindBy(xpath = "//tr[3]/td[2]/input")
    public WebElement totalPriceInput;

    @FindBy(xpath = "//tr[4]/td[2]/input")
    public WebElement costDescriptionInput;

    @FindBy(xpath = "//div[@name='date']/input")
    public WebElement dateInput;

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(@class,'notification_title')]")
     public WebElement errorMessageWithoutVehicle;

    @FindBy(xpath = "//button[contains(text(),'Discard')]")
    public WebElement discardButton;

    @FindBy(xpath = "//th[text()='Vehicle']")
    public WebElement vehicleElementInCreatePage;

    @FindBy(xpath = "//button[contains(text(),'Attachment(s)')]")
    public WebElement attachmentsButton;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionButton;

    @FindBy(xpath = "//input[contains(@class,'searchview_input')]")
    public WebElement vehicleCostSearchInput;

    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr[1]/th")
    public WebElement firstVehicLeResultTextElement;

    @FindBy(xpath = "//th[text()='Cost Description']")
    public WebElement costDescElement;

    @FindBy (xpath = "(//i[contains(@class,'plus')])[1]")
    public WebElement kanbanPlusElement;

    @FindBy(xpath = "//button[contains(text(),'Measures')]")
    public WebElement graphMeasuresElement;

    @FindBy(xpath = "//div[contains(@class,'switch_buttons')]/button[1]")
    public WebElement listButton;

    @FindBy(xpath = "//div[contains(@class,'switch_buttons')]/button[2]")
    public WebElement kanbanButton;

    @FindBy(xpath = "//div[contains(@class,'switch_buttons')]/button[3]")
    public WebElement graphButton;








    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    String vehicle= "Audi/A1/";
    String type= "Summer tires";
    String costDescription= "New Summer tyres";
    String date ="03/01/2023";

    String totalPrice="150.00";

    int vehicleCostCount;
    public void gotoVehicleCostPage(){


        moreButton.click();
        BrowserUtil.sleep(5);
        fleetButton.click();
        vehicleCostButton.click();

    }

    public void createVehicleCost(){


        Actions action= new Actions(Driver.getDriver());


        BrowserUtil.sleep(5);
        wait.until(ExpectedConditions.visibilityOf(vehicleElementInCreatePage));
        wait.until(ExpectedConditions.elementToBeClickable(createButton));
        createButton.click();
        BrowserUtil.sleep(1);

        wait.until(ExpectedConditions.visibilityOf(vehicleInput));
        action.moveToElement(vehicleInput).doubleClick().sendKeys(vehicle).build().perform();
        BrowserUtil.sleep(2);

        vehicleName.click();

        action.moveToElement(typeInput).doubleClick().sendKeys(type).build().perform();
        typeSelect.click();

        action.moveToElement(totalPriceInput).doubleClick().sendKeys(totalPrice).build().perform();
        action.moveToElement(costDescriptionInput).doubleClick().sendKeys(costDescription).build().perform();
        action.moveToElement(dateInput).doubleClick().sendKeys(date).build().perform();
        BrowserUtil.sleep(1);

        saveButton.click();

    }

    public void verifyCreatedVehicleCost(){

        BrowserUtil.sleep(2);
        WebElement  createdVehicle=Driver.getDriver().findElement(By.xpath("//tr[1]/td[2]/a"));
        String createdVehicleName= createdVehicle.getText();
        Assert.assertEquals("Vehicle is not correct",vehicle,createdVehicleName);

        WebElement createdType= Driver.getDriver().findElement(By.xpath("//tr[2]/td[2]/a"));
        String createdTypeName= createdType.getText();
        Assert.assertEquals("Type is not correct",type,createdTypeName);

        WebElement createdPrice=Driver.getDriver().findElement(By.xpath("//tr[3]/td[2]/span"));
        String createdPriceName= createdPrice.getText();
        Assert.assertEquals("Price not match",totalPrice,createdPriceName);

        WebElement costDesc= Driver.getDriver().findElement(By.xpath("//tr[4]/td[2]/span"));
        String createdCostDesc= costDesc.getText();
        Assert.assertEquals("Cost Desc is not same",costDescription,createdCostDesc);

        WebElement createdDate=Driver.getDriver().findElement(By.xpath("//table[2]/tbody/tr[1]/td[2]/span"));
        String createdDateText= createdDate.getText();
        Assert.assertEquals("Date is not correct",date,createdDateText);

    }


    public void createVehicleCostWithoutVehicleName(){

        wait.until(ExpectedConditions.visibilityOf(vehicleElementInCreatePage));
        wait.until(ExpectedConditions.elementToBeClickable(createButton));

        BrowserUtil.sleep(3);
        createButton.click();
        Actions action= new Actions(Driver.getDriver());

        BrowserUtil.sleep(1);
        wait.until(ExpectedConditions.visibilityOf(typeInput));
        action.moveToElement(typeInput).doubleClick().sendKeys(type).build().perform();
        typeSelect.click();

        action.moveToElement(totalPriceInput).doubleClick().sendKeys(totalPrice).build().perform();
        action.moveToElement(costDescriptionInput).doubleClick().sendKeys(costDescription).build().perform();
        action.moveToElement(dateInput).doubleClick().sendKeys(date).build().perform();
        BrowserUtil.sleep(1);

        saveButton.click();

    }
    public void verifyErrorMessageWithoutVehicleInfo(){


        WebElement errorField= Driver.getDriver().findElement(By.xpath("//div[contains(@class,'notification_title')]/../div[2]/ul/li"));

        String expectedErrorMessage= "The following fields are invalid:";
        String expectedErrorField="Vehicle";

        String actualErrorMessage=errorMessageWithoutVehicle.getText();
        String actualErrorField= errorField.getText();




        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
        Assert.assertEquals(expectedErrorField,actualErrorField);


    }



    public void enterVehicleInfoForPageTitle(){


        Actions action= new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.visibilityOf(vehicleElementInCreatePage));
        wait.until(ExpectedConditions.elementToBeClickable(createButton));

        BrowserUtil.sleep(3);
        createButton.click();

        wait.until(ExpectedConditions.visibilityOf(vehicleInput));
        action.moveToElement(vehicleInput).doubleClick().sendKeys(vehicle).build().perform();
        BrowserUtil.sleep(2);

        vehicleName.click();

        action.moveToElement(typeInput).doubleClick().sendKeys(type).build().perform();
        typeSelect.click();

        action.moveToElement(totalPriceInput).doubleClick().sendKeys(totalPrice).build().perform();
        action.moveToElement(costDescriptionInput).doubleClick().sendKeys(costDescription).build().perform();
        action.moveToElement(dateInput).doubleClick().sendKeys(date).build().perform();
        BrowserUtil.sleep(2);

    }

    public void verifyPageTitleBeforeAfter(){
        String beforePageTitle=Driver.getDriver().getTitle();
        saveButton.click();

        BrowserUtil.sleep(1);
        String afterPageTitle=Driver.getDriver().getTitle();

        Assert.assertNotEquals("Page Title Not Changed",beforePageTitle,afterPageTitle);


    }

    public void cancelVehicleCost(){
        String expectedWarningMessage=
                "The record has been modified, your changes will be discarded. Do you want to proceed?";

        discardButton.click();

        WebElement messageElement=Driver.getDriver().findElement(By.xpath("//div[@class='modal-content']/div[2]"));

        String actualMessage=messageElement.getText();

       // WebElement okButton=Driver.getDriver().findElement(By.xpath("//div[@class='modal-content']/div[3]/button[1]"));

        Assert.assertEquals("Warning message is not same",expectedWarningMessage,actualMessage);


    }


    public void attachmentsAndActionButtonDisplayed(){

        BrowserUtil.waitForVisibility(attachmentsButton);
        Assert.assertTrue(attachmentsButton.isDisplayed());
        Assert.assertTrue(actionButton.isDisplayed());
    }



    public void selectVehicleCostAndSearchValue(){

        moreButton.click();
        BrowserUtil.sleep(5);
        fleetButton.click();
        vehicleCostButton.click();

        vehicleCostSearchInput.sendKeys(vehicle,Keys.ENTER);
        String vehicleCountText= firstVehicLeResultTextElement.getText(); //Audi/A1/    (479)
        String firstCount= vehicleCountText.substring(10,(vehicleCountText.length()-1));

        vehicleCostCount= Integer.parseInt(firstCount);


    }


    public void verifyNewVehicleCount(){

        vehicleCostButton.click();
        BrowserUtil.waitForVisibility(vehicleCostSearchInput);

        vehicleCostSearchInput.sendKeys(vehicle,Keys.ENTER);
        String vehicleCountText= firstVehicLeResultTextElement.getText(); //Audi/A1/    (479)
        String firstCount= vehicleCountText.substring(10,(vehicleCountText.length()-1));


       int newVehicleCostCount= Integer.parseInt(firstCount);
        System.out.println("Old vehicle Cost count: "+ vehicleCostCount);
        System.out.println("New Vehicle Cost Count : "+ newVehicleCostCount);

       Assert.assertEquals("New vehicle is not created ",(vehicleCostCount+1),newVehicleCostCount);
    }


    public void verifyVehicleCostDisplayInListKanbanGraph(){

        Actions action = new Actions(Driver.getDriver());
        vehicleCostButton.click();
        //listButton.click();
        Assert.assertTrue(costDescElement.isDisplayed());


        BrowserUtil.sleep(2);
        action.moveToElement(kanbanButton).doubleClick().build().perform();

        //kanbanButton.click();
        BrowserUtil.waitForVisibility(kanbanPlusElement);
        Assert.assertTrue(kanbanPlusElement.isDisplayed());

        action.moveToElement(graphButton).doubleClick().build().perform();
        //graphButton.click();
        BrowserUtil.waitForVisibility(graphMeasuresElement);
        Assert.assertTrue(graphMeasuresElement.isDisplayed());

    }







}

