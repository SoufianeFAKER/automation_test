package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddNewProductPage;

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

	@When("Je saisis le nom du nouveau produit {string}")
	public void je_saisis_le_nom_du_nouveau_produit(String fieldProductName) {
		
		AddNewProductPage.getFieldProductName().sendKeys(fieldProductName);
	   
	}

	@When("Je clique sur le bouton save")
	public void je_clique_sur_le_bouton_save() {
		
		AddNewProductPage.getBtnSave().click();
	  
	}

}
