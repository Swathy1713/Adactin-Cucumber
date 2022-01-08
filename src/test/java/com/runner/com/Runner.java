package com.runner.com;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Cucumber.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\com\\feature\\com",
				 glue="com.stepdef.com", 
				 plugin = {
							"pretty", "html:report",
							"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" })

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver=BaseClass.browserLaunch("chrome");

	}

}
