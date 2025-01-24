package com.mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInUserAccount {
	
	// create object of webDriver
			WebDriver ldriver;
			
			public LoggedInUserAccount(WebDriver rdriver)
			{
				ldriver = rdriver;
				
				PageFactory.initElements(rdriver, this);  //this keyword is object of PageFactory
			}
			
			@FindBy(xpath = "//a[@title='View my customer account']")
			WebElement username;
			
			public String getUserName() {
				String uname = username.getText();
				return uname;
			}

}
