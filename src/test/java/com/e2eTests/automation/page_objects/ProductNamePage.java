package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ProductNamePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement menuProducts;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement fieldProductName;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearchproducts;

	public SeleniumUtils seleniumUtils;
	
	public ProductNamePage() {
		
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}

	public void clickOnMenuCatalog() { 

		seleniumUtils.click(menuCatalog);
		
	}
	
	
	public void clickOnMenuProducts() {
		
		seleniumUtils.click(menuProducts);

	}

	public void enterProduct(String productName) {
		
		seleniumUtils.writeText(fieldProductName, productName);

	}
	
	public void clickOnBtnSearch() {
		
		seleniumUtils.click(btnSearchproducts);

	}

}
