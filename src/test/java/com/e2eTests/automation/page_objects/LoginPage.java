package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class LoginPage extends BasePage {

	/* Retrieve element */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;
	
	public SeleniumUtils seleniumUtils;
	
	public LoginPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public void enterEmail(String emailText) { 
		
		seleniumUtils.writeText(email, emailText);

	}

	public void enterPassword(String passwodText) {

		seleniumUtils.writeText(password, passwodText);
	}

	public void clickOnBtnLogin() {
		
		seleniumUtils.click(btnLogin);
		
	}

}
