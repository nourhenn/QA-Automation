package com.orangeHRM.e2eTests.buzz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuzzPage {
	/* Locators */
	final static String MODULE_BUZZ_Id = "menu_buzz_viewBuzz";
	 
	/*findBy*/
	@FindBy (how = How.ID, using = MODULE_BUZZ_Id)
	public static WebElement moduleBuzz;
	
	/*Methods*/
	public void clickOnBuzz() {
		 moduleBuzz.click();
	}

}
