package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.Then;

public class ProductNameStepDefinition {

	public ProductNamePage productNamePage;

	public ProductNameStepDefinition() {
		
		productNamePage = new ProductNamePage();
	}

	@Then("Je clique sur catalog")
	public void jeCliqueSurCatalog() {
		
		ProductNamePage.getMenuCatalog().click();

	}

	@Then("Je clique sur products")
	public void jeCliqueSurProducts() {
		
		ProductNamePage.getMenuProducts().click();

	}

	@Then("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String fieldproductNameText) {
		
		ProductNamePage.getFieldProductName().sendKeys(fieldproductNameText);

	}

	@Then("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {

	}

}
