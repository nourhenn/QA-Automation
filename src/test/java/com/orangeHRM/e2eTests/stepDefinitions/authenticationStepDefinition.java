package com.orangeHRM.e2eTests.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.e2eTests.pageObjects.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition {

	public WebDriver driver;
	 public AuthenticationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	private AuthenticationPage authenticationPage = new AuthenticationPage();

	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws Throwable {
		driver .get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name); 
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		authenticationPage.fillUserPassword(password); 
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authenticationPage.clickBtnLogin();   
	}

	@Then("^Je me redirige vers le compte admin$")
	public void jeMeRedirigeVersLeCompteAdmin() throws Throwable {
	}


}
