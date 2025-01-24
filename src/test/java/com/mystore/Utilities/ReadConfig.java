package com.mystore.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;  //creating object of properties class - to read the properties file
	
	String path = "C:\\Users\\alokk\\eclipse-workspace\\MyStore\\Configuration\\config.properties";
	
	public ReadConfig() {
		
		try {
		properties = new Properties();  //initialize the properties variable
		
			
				FileInputStream fis = new FileInputStream(path);  //creating object to read the properties file
				properties.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");  //getProperty method is used to read content of properties file
		
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not speceified in config file..");
	}
	
	public String getBrowser() 
	{
		String browser = properties.getProperty("browser");
		
		if(browser!=null)
			return browser;
		else
			throw new RuntimeException("browser not speceified in config file..");
	}
	
	public String getEmail() 
	{
		String emailid = properties.getProperty("username");  //getProperty method is used to read content of properties file
		
		if(emailid!=null)
			return emailid;
		else
			throw new RuntimeException("Email id not defined properties file..");
	}
	
	public String getPassword() 
	{
		String password = properties.getProperty("password");  //getProperty method is used to read content of properties file
		
		if(password!=null)
			return password;
		else
			throw new RuntimeException("Password id not defined properties file..");
	}

}
