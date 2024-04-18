package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class CategoriesNamePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement menuCategories;

	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement fieldCategoryName;
	
	@FindBy(how = How.ID, using = "search-categories")
	private static WebElement btnSearchCateory;

	public SeleniumUtils seleniumUtils;
	
	public CategoriesNamePage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public void clickOnMenuCategories() {
		
		seleniumUtils.click(menuCategories);

	}

	public void enterCategoryName(String categoryNameText) { 
		
		seleniumUtils.writeText(fieldCategoryName, categoryNameText);

	}
	
	
	public void clickOnBtnSearchCateory() {
		
		seleniumUtils.click(btnSearchCateory);
	}

}
