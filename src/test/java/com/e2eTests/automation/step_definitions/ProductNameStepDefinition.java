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
		
		productNamePage.clickOnMenuCatalog();

	}

	@Then("Je clique sur products")
	public void jeCliqueSurProducts() {
		
		productNamePage.clickOnMenuProducts();

	}

	@Then("Je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String fieldProductNameText) {
		
		productNamePage.enterProduct(fieldProductNameText);

	}

	@Then("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		
		productNamePage.clickOnBtnSearch();

	}

}
