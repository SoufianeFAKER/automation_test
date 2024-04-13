package com.e2eTests.automation.utils;



import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Setup { 

	private static WebDriver driver;
	private static final Logger LOGGER = (Logger) LogManager.getLogger(Setup.class.getName());
	
	/**
	 * This method is used to open browser. This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 * 
	 * @throws MalformedURLException the malformed URL exception
	 * @Before Methods annotated with @Before will execute before every scenario.
	 */

	@Before
	public void setWebDriver(Scenario scenario) {
		
		LOGGER.info("Scenario: " + scenario.getName() + "- started");
		String browser = System.getProperty("browser");
		if (browser == null) {

			browser = "chrome";
		}

		switch (browser) {

		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new ChromeDriver(chromeOptions);
			chromeOptions.addArguments("--start-maximized");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
			break;

		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("platform", Platform.WIN10);
			driver = new FirefoxDriver(firefoxOptions);
			break;
			
		case "edge":
			
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setCapability("platform", Platform.WIN10);
			driver = new EdgeDriver(edgeOptions);
			break;

		default:
			throw new IllegalArgumentException("Browser\"" + browser + "\" is not supportes. ");
		}
	}
	
	/* GETTER */
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}

}
