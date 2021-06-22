package com.orangeHRM.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;
	
	public void openURLWithConfigFile(String url) throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
	prop.load(fis);
	driver.get(prop.getProperty(url));
	}
}
