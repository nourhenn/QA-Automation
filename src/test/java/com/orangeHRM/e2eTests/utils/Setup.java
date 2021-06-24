package com.orangeHRM.e2eTests.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManager;

	@Before
	/**
	 * Call browser with a design pattern factory navigator
	 */
	public static void setup() throws InterruptedException {
		driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManager.getDriver();
		 // implicit wait
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     	Thread.sleep(3000);	 
	}

	@After
	/**
	 * Embed a screenshot in test report if test is marked as failed
	 */
	public void embedScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			try {
				scenario.write("Current page URL is: " +driver.getCurrentUrl());
				byte[] screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenShot, "image/png");
			}catch(WebDriverException somePlateformDontSupportScreenShot){
				System.err.println(somePlateformDontSupportScreenShot.getMessage());
			}
		}
		driver.quit();
	}
}
