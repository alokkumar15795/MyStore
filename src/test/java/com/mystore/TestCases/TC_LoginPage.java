package com.mystore.TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.mystore.PageObject.CreateAccountPage;
import com.mystore.PageObject.LoggedInUserAccount;
import com.mystore.PageObject.indexPage;
import com.mystore.PageObject.myAccount;

import junit.framework.Assert;

public class TC_LoginPage extends BaseClass{

	@Test (enabled=false)
	public void verifyRegistrationAndLogin() //creating method
	{

		//creating object of index page class
		indexPage ipg = new indexPage(driver);
		ipg.clickOnSignIn();

		myAccount myacc= new myAccount(driver);
		myacc.enterEmailId("selenium11103@gmail.com");
		myacc.clickOnCreateAccount();


		CreateAccountPage createacc = new CreateAccountPage(driver);
		logger.info("Select Title check box");
		createacc.selectTitleMr();
		logger.info("Enter first name");
		createacc.enterFirstName("Selenium");
		logger.info("Enter last name");
		createacc.enterLastName("DemoC");
		logger.info("Enter password");
		createacc.enterPassword("selenium11103");
		logger.info("select DOB - Days");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		createacc.enterDays("1");
		logger.info("select DOB - Month");
		createacc.enterMonths("1");
		logger.info("select DOB - Year");
		createacc.enterYears("2000");
		logger.info("click on check box");
		createacc.clickNewsletter();
		createacc.clickOnRegister();


	}
	
	@Test
	public void SignIn() {
		indexPage ipg = new indexPage(driver);
		ipg.clickOnSignIn();
		
		myAccount myacc= new myAccount(driver);
		myacc.enterUserId("selenium11101@gmail.com");
		myacc.enterUserPasswd("selenium11101");
		myacc.clickOnSignIn();
		
		
		
		
		LoggedInUserAccount reguser =new LoggedInUserAccount(driver);
		String username = reguser.getUserName();

		Assert.assertEquals("Selenium DemoA", username);
		logger.info("User account is verified....");
		
	}


}
