package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;
	public ConfigFileReader configFileReader;

	public LoginStepDefinition() {

		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
	}

	/* login valid */

	@Given("Je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() {

		Setup.getDriver().get(configFileReader.getProperties("home.url"));

	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {

		LoginPage.getEmail().clear();
		LoginPage.getEmail().sendKeys(email);
		;

	}

	@When("Je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {

		LoginPage.getPassword().clear();
		LoginPage.getPassword().sendKeys(login);
		;

	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {

		// LoginPage.getBtnLogin().click();
		loginPage.clickOnBtnLogin(); // getBtnLogin();

	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

	}

	/* login invalid */

	@Then("Je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {

	}

}
