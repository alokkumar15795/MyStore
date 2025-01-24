package com.mystore.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	// create object of webDriver
		WebDriver ldriver;
		
		public CreateAccountPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			
			PageFactory.initElements(rdriver, this);  //this keyword is object of PageFactory
		}
		
		//identify Mr title
		@FindBy(id = "id_gender1")
		WebElement titleMr;
		
		@FindBy(id = "customer_firstname")
		WebElement fname;
		
		@FindBy(id = "customer_lastname")
		WebElement lname;
		
		@FindBy(id = "passwd")
		WebElement ipassword;
		
		@FindBy(id = "days")
		WebElement dd;
		
		@FindBy(id = "months")
		WebElement mm;
		
		@FindBy(id = "years")
		WebElement yyyy;
		
		@FindBy(id = "newsletter")
		WebElement cbox;
		
		@FindBy(id = "submitAccount")
		WebElement register;
		
		//Perform click action on title mr.
		public void selectTitleMr() {
			titleMr.click();
		}
		
		public void enterFirstName(String cfname) {
			fname.sendKeys(cfname);
		}
		
		public void enterLastName(String clname) {
			lname.sendKeys(clname);
		}
		
		public void enterPassword(String passcode) {
			ipassword.sendKeys(passcode);
		}
		
		//selecting DOB day from drop down
		public void enterDays(String dobdd) {
			Select obj = new Select(dd);
			obj.selectByValue(dobdd);
		}
		
		public void enterMonths(String dobmm) {
			Select obj = new Select(mm);
			obj.selectByValue(dobmm);
		}
		
		public void enterYears(String dobyy) {
			Select obj = new Select(yyyy);
			obj.selectByValue(dobyy);
		}
		
		public void clickNewsletter() {  // Creating method to perform click action on Register button
			cbox.click();
		}
		
		public void clickOnRegister() {  // Creating method to perform click action on Register button
			register.click();
		}
		
		

}
