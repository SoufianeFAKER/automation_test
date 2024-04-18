package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class AddNewProductPage extends BasePage {
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	private static WebElement btnAddNew;
	
	@FindBy(how = How.ID, using = "Name")
	private static WebElement fieldProductName;
	
	@FindBy(how = How.ID, using = "ShortDescription")
	private static WebElement fieldShortDescription;
	
	@FindBy(how = How.ID, using = "SelectedCategoryIds")
	private static WebElement selectCategories;
	
	@FindBy(how = How.ID, using = "ShowOnHomepage")
	private static WebElement chekBoxShowOnHomepage;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;
	
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFormListUtils;

	public AddNewProductPage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		selectFormListUtils = new SelectFromListUtils();
	}
	
	public void clickOnBtnAddNew() {
		
		seleniumUtils.click(btnAddNew);

	}
	
	public void enterProductName(String productNameText) {
		
		seleniumUtils.writeText(fieldProductName, productNameText);
		
	}
	
	public void enterShortDescription(String shortDescriptionText) { 
		
		seleniumUtils.writeText(fieldShortDescription, shortDescriptionText);

	}
	
	public void selectCategories(String categoriesText) { 
		
		JavascriptExecutor executor = (JavascriptExecutor) Setup.getDriver();
		executor.executeScript("window.scrollBy(0, 400);", selectCategories);
		
		selectFormListUtils.selectDropDownListByVisibleText(selectCategories, categoriesText);
		
	}
	
	public void clickOnCheckBoxShowOnHomepage() {
		
		//JavascriptExecutor executor = (JavascriptExecutor) Setup.getDriver();
		//executor.executeScript("window.scrollTo(0, 400);", chekBoxShowOnHomepage);
		
		seleniumUtils.click(chekBoxShowOnHomepage);
		
	}
	
	public void clickOnBtnSave() {
		
		seleniumUtils.click(btnSave);
		
	}
	

}
