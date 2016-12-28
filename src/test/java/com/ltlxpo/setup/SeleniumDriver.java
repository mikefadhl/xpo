package com.ltlxpo.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Selenium driver wrapper
 *
 */
public class SeleniumDriver {

	static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver","//Usr//bin//chromedriver");
			driver = new ChromeDriver();
		}
		return driver;
	}

}
