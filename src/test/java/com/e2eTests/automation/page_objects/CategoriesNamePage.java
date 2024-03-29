package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class CategoriesNamePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement menuCategories;

	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement fieldCategoryName;

	public CategoriesNamePage() {
		super(Setup.getDriver());
	}

	public static WebElement getCategories() {

		return menuCategories;
	}

	public static WebElement getCategoryName() {

		return fieldCategoryName;
	}

}
