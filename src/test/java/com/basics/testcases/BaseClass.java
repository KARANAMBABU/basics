package com.basics.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String url = "http://primusbank.qedgetech.com/";
	public String username = "Admin";
	public String password = "Admin";
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "D://basics//Drivers//chromedriver.exe");
		 driver = new ChromeDriver();

	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

}
