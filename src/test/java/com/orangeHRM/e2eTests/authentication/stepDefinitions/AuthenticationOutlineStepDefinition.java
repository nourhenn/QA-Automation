package com.orangeHRM.e2eTests.authentication.stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.Setup;
 
import cucumber.api.java.en.When;

public class AuthenticationOutlineStepDefinition {

	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();

	 public AuthenticationOutlineStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	
	 @When("^Je saisie login \"([^\"]*)\"$")
	 public void jeSaisieLogin(String name) throws Throwable {
		 authenticationPage.fillUserName(name); 
	 }

	 @When("^Je saisie password \"([^\"]*)\"$")
	 public void jeSaisiePassword(String password) throws Throwable {
		 authenticationPage.fillUserPassword(password);
	 }
}
