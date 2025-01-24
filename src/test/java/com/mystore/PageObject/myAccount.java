package com.mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Utilities.ReadConfig;

public class myAccount {
	
	// create object of webDriver
		WebDriver ldriver;
		
		public myAccount(WebDriver rdriver)
		{
			ldriver = rdriver;
			
			PageFactory.initElements(rdriver, this);
		}
		
		ReadConfig readConfig = new ReadConfig();
		String emailid1 = readConfig.getEmail();
		String password = readConfig.getPassword();

		//identify webElement
		@FindBy(id = "email_create")
		WebElement createemailid;
		
		@FindBy(id = "SubmitCreate")
		WebElement createaccount;
		
		//enter email address in create email text box
		public void enterEmailId(String emailid) {  //String email - creating parameter to store email address
			createemailid.sendKeys(emailid);
		}
		
		public void clickOnCreateAccount() {
			createaccount.click();
		}
		
		@FindBy (id = "email")
		WebElement emailAddr;
		
		@FindBy (id = "passwd")
		WebElement passwd;
		
		@FindBy(id = "SubmitLogin")
		WebElement SignIn;
		
		public void enterUserId(String userid) {  
			emailAddr.sendKeys(userid);
		}
		
		public void enterUserPasswd(String passwd1) {  
			passwd.sendKeys(passwd1);
		}
		
		
		public void clickOnSignIn() {
			SignIn.click();
		}
		
}
