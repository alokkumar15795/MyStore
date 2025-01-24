package com.mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
	
	// create object of webDriver
	WebDriver ldriver;
	
	public indexPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);  //this keyword is object of PageFactory
	}
	
	//identify webElement (to identify web element in page page by using @findBy )
	@FindBy(linkText = "Sign in")	
	WebElement signIn;  //Creating variable of web Element
	
	//perform click action on find element in web page
	public void clickOnSignIn() {  // Creating method to perform click action
		signIn.click();
	}


}
