package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
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
	
	public AddNewProductPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getBtnAddNew() {

		return btnAddNew;
	}
	
	public static WebElement getFieldProductName() {
		
		return fieldProductName;
	}
	
	public static WebElement getFieldShortDescription() {
		
		return fieldShortDescription;
	}
	
	public static WebElement getSelectCategories() {
		
		return selectCategories;
	}
	
	public static WebElement getShowOnHomepage() {
		
		return chekBoxShowOnHomepage;
	}
	
	public static WebElement getBtnSave() {
		
		return btnSave;
	}
	

}
