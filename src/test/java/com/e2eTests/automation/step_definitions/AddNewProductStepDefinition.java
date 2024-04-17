package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.e2eTests.automation.page_objects.AddNewProductPage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class AddNewProductStepDefinition {
	
	public AddNewProductPage addNewProductPage;

	public AddNewProductStepDefinition() {
		
		addNewProductPage = new AddNewProductPage();
	}
	
	
	@When("Je clique sur add new")
	public void je_clique_sur_add_new() {
		
		AddNewProductPage.getBtnAddNew().click();
	  
	}

	@When("Je remplis les champs suivants")
	public void jeRemplisLesChampsSuivants(DataTable dataTable) {
		
		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
		
		AddNewProductPage.getFieldProductName().sendKeys(dataMap.get("productName"));
		AddNewProductPage.getFieldShortDescription().sendKeys(dataMap.get("shortDescription"));
	   
	}
	
	@When("Je choisis une categorie")
	public void jeChoisisUneCategorie() {
		
		JavascriptExecutor executor = (JavascriptExecutor) Setup.getDriver();
		
		WebElement list = AddNewProductPage.getSelectCategories();
		executor.executeScript("arguments[0].scrollIntoView(true);", list);
		Select dropDownList = new Select(list);
		dropDownList.selectByVisibleText("Books");
	   
	}
	@When("Je clique sur show on home page")
	public void jeCliqueSurShowOnHomePage() {
		
		JavascriptExecutor executor = (JavascriptExecutor) Setup.getDriver();
		
		WebElement checkBox = AddNewProductPage.getShowOnHomepage();
		executor.executeScript("arguments[0].scrollIntoView(true);", checkBox);
		checkBox.click();
	}







	@When("Je saisis le nom du nouveau produit {string}")
	public void je_saisis_le_nom_du_nouveau_produit(String fieldProductName) {
		
		AddNewProductPage.getFieldProductName().sendKeys(fieldProductName);
	   
	}

	@When("Je clique sur le bouton save")
	public void je_clique_sur_le_bouton_save() {
		
		AddNewProductPage.getBtnSave().click();
	  
	}

}
