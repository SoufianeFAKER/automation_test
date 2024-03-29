package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.CategoriesNamePage;

import io.cucumber.java.en.Then;

public class CategoriesNameStepDefinition {
	
	public CategoriesNamePage categoriesNamePage;

	public CategoriesNameStepDefinition() {
		
		categoriesNamePage = new CategoriesNamePage();
	}
	
	
	@Then("Je clique sur categories")
	public void jeCliqueSurCategories() {
		
		CategoriesNamePage.getCategories().click();
	    
	}
	
	@Then("Je saisis le nom du categorie {string}")
	public void jeSaisisLeNomDuCategorie(String fieldCategoryNameText) {
		
		CategoriesNamePage.getCategoryName().sendKeys(fieldCategoryNameText);
	   
	}




}
