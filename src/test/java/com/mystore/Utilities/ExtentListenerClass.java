package com.mystore.Utilities;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener{
	
	ExtentSparkReporter htmlReorter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport() {
		htmlReorter = new ExtentSparkReporter("ExtentListenerReportDemo.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReorter);
		
		// add system information info to reports
		reports.setSystemInfo("Project", "MyStore");
		reports.setSystemInfo("OS", "Window 11");
		reports.setSystemInfo("browser", "chrome");
		reports.setSystemInfo("user", "Alok Kumar");
		
		//configuration to change look and info
		htmlReorter.config().setDocumentTitle("My Store");
		htmlReorter.config().setReportName("My Store Reports");
		htmlReorter.config().setTheme(Theme.DARK);
	}

}
