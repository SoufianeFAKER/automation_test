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
		
		categoriesNamePage.clickOnMenuCategories();
	    
	}
	
	@Then("Je saisis le nom du categorie {string}")
	public void jeSaisisLeNomDuCategorie(String fieldCategoryNameText) {
		
		categoriesNamePage.enterCategoryName(fieldCategoryNameText);
	   
	}

	@Then("Je clique sur le bouton search de la page Categories")
	public void jeCliqueSurLeBoutonSearchDeLaPageCategories() {
	    
		categoriesNamePage.clickOnBtnSearchCateory();
	}





}
