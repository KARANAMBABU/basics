package com.basics.testcases;

import org.testng.annotations.Test;

import com.basics.pageobjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void welcome() {
		driver.get(url);
		LoginPage log = new LoginPage(driver);
		log.setUsername(username);
		log.setPassword(password);
		log.ClickButton();

	}

}
