package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LogoutPage;

import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	public LogoutPage logoutPage;

	public LogoutStepDefinition() {
		
		logoutPage = new LogoutPage();
	}
	
	
	@When("Je me déconnecte")
	public void je_me_déconnecte() {
		
		LogoutPage.getLinkLogout().click();
	    
	}

}
