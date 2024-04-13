package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ProductNamePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement menuProducts;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement fieldProductName;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearch;

	public ProductNamePage() {
		super(Setup.getDriver());
	}

	public static WebElement getMenuCatalog() {

		return menuCatalog;
	}
	
	//menuProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='Products']")))

	public static WebElement getMenuProducts() {

		return menuProducts;
	}

	public static WebElement getFieldProductName() {

		return fieldProductName;
	}
	
	public static WebElement getBtnSearch() {

		return btnSearch;
	}

}
