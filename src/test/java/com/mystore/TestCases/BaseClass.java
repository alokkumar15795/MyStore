package com.mystore.TestCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.mystore.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig(); //creating object of ReadConfig class
	
	String url = readConfig.getBaseUrl();  //reading baseURL and store in url variable
	String browser = readConfig.getBrowser();
	
	
	
	
	public static WebDriver driver;  // creating static variable of WebDriver class
	
	public static Logger logger;
	
	@BeforeClass
	public void browserSetup () {
		
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();  // WebDriverManager is class
			driver = new ChromeDriver();
			break;
			
		case "msedge":
			WebDriverManager.edgedriver().setup();  // WebDriverManager is class
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();  // WebDriverManager is class
			driver = new FirefoxDriver();
			break;
			
			default:
				driver = null;
				break;
		}
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//for logging
		logger = LogManager.getLogger("MyStore");
		
		//open url
		driver.get(url);
		logger.info("url opened");
		

		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
