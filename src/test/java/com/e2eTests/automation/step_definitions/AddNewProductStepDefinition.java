package com.e2eTests.automation.step_definitions;

import java.util.Map;

import com.e2eTests.automation.page_objects.AddNewProductPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class AddNewProductStepDefinition {

	public AddNewProductPage addNewProductPage;

	public AddNewProductStepDefinition() {

		addNewProductPage = new AddNewProductPage();
	}

	@When("Je clique sur add new")
	public void je_clique_sur_add_new() {

		addNewProductPage.clickOnBtnAddNew();

	}

	@When("Je remplis les champs suivants")
	public void jeRemplisLesChampsSuivants(DataTable dataTable) {

		Map<String, String> dataMap = dataTable.asMap(String.class, String.class);

		addNewProductPage.enterProductName(dataMap.get("productName"));
		addNewProductPage.enterShortDescription(dataMap.get("shortDescription"));

	}

	@When("Je choisis une categorie")
	public void jeChoisisUneCategorie() {

		addNewProductPage.selectCategories("Books");

	}

	@When("Je clique sur show on home page")
	public void jeCliqueSurShowOnHomePage() {

		addNewProductPage.clickOnCheckBoxShowOnHomepage();
	}

	@When("Je clique sur le bouton save")
	public void je_clique_sur_le_bouton_save() {

		addNewProductPage.clickOnBtnSave();

	}

}
