package com.basics.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = ("//*[@id=\"txtuId\"]"))
	WebElement textUser;
	@FindBy(xpath = ("//*[@id=\"txtPword\"]"))
	WebElement textPass;
	@FindBy(xpath = ("//*[@id=\"login\"]"))
	WebElement button;

	public void setUsername(String str) {
		textUser.sendKeys(str);
	}

	public void setPassword(String str1) {
		textPass.sendKeys(str1);
	}

	public void ClickButton() {
		button.click();
	}

}
