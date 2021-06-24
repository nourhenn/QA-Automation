package com.orangeHRM.e2eTests.buzz.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; 
import com.orangeHRM.e2eTests.buzz.pages.BuzzPage;
import com.orangeHRM.e2eTests.utils.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuzzStepDefinition {
	public WebDriver driver;
	private BuzzPage buzzPage = new BuzzPage();

	 public BuzzStepDefinition() throws InterruptedException {
		
		driver = Setup.driver;
		 PageFactory.initElements(driver, BuzzPage.class);
	}
	 @When("^Je clique sur le module buzz$")
	 public void jeCliqueSurLeModuleBuzz() throws Throwable {
		 buzzPage.clickOnBuzz();   
	 }

	 @When("^Je saisie un message  \"([^\"]*)\"$")
	 public void jeSaisieUnMessage(String arg1) throws Throwable {
	     }

	 @When("^Je clique sue le button post$")
	 public void jeCliqueSueLeButtonPost() throws Throwable {
	  }

	 @Then("^je verifier le message \"([^\"]*)\"$")
	 public void jeVerifierLeMessage(String arg1) throws Throwable {
	  }

	
}
