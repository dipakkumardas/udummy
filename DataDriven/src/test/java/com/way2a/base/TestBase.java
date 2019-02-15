package com.way2a.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	
	
	
	

	@BeforeSuite
	public void setUp() {

	}
	@AfterSuite
	public void tearDown()
	{
		
	}

}
