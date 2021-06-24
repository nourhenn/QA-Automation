package com.orangeHRM.e2eTests.authentication.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;

import com.orangeHRM.e2eTests.authentication.pages.AuthenticationPage;
import com.orangeHRM.e2eTests.utils.CommonMethods;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition extends CommonMethods {

	public WebDriver driver;
	 public AuthenticationStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	private AuthenticationPage authenticationPage = new AuthenticationPage();

	@Given("^Je me connecte à l'application OrangeHRM$")
	public void jeMeConnecteÀLApplicationOrangeHRM() throws Throwable {
		logger.info("Je me connecte à l'application OrangeHRM");
		
		driver .get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^Je saisie Username \"([^\"]*)\"$")
	public void jeSaisieUsername(String name) throws Throwable {
		logger.info("Je saisie Username");
		authenticationPage.fillUserName(name); 
	}

	@When("^Je saisie Password \"([^\"]*)\"$")
	public void jeSaisiePassword(String password) throws Throwable {
		logger.info("Je saisie Password");
		authenticationPage.fillUserPassword(password); 
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		logger.info("Je clique sur le bouton login");
		authenticationPage.clickBtnLogin();   
	}

	@Then("^Je me redirige vers le compte admin \"([^\"]*)\"$")
	public void jeMeRedirigeVersLeCompteAdmin(String message) throws Throwable {
	String textMessage = AuthenticationPage.adminUser.getText();
	Assert.assertTrue(textMessage.contains(message));
	}


}
