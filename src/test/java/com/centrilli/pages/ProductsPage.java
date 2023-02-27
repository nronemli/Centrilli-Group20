package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@id='o_field_input_479']")
    public WebElement productNameInputBox;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy (xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy (xpath = "//button[@accesskey='l']")
    public WebElement listButton;

    @FindBy (xpath = "//button[@accesskey='k']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputBox;

    @FindBy (xpath = "//p[.='Product Template created']")
    public WebElement productTemplateCreatedMessage;

    @FindBy (xpath = "//div[@class='o_notification undefined o_error']")
    public WebElement warningMessage;

    @FindBy (xpath = "(//div[@class='oe_kanban_global_click o_kanban_record'])[1]")
    public WebElement firstKanbanResult;

    @FindBy (xpath = " //table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement listViewTable;

    @FindBy (xpath = "//div[@class='o_kanban_view o_kanban_ungrouped']")
    public WebElement kanbanViewArea;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement currentTotalProductNumber;












}
