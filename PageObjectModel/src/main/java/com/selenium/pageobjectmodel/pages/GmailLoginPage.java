package com.selenium.pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage {
	
	@FindBy(id="identifierId")
	WebElement emailOrPhoneField;
	
	@FindBy(id="identifierNext")
	WebElement emailNextButton;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(id="passwordNext")
	WebElement passwordNextButton;
	
	public void setEmailOrPhoneField(String emailOrPhoneValue) {
		emailOrPhoneField.sendKeys(emailOrPhoneValue);		
	}
	
	public void clickEmailNextButton() {
		emailNextButton.click();
	}
	
	public void setPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickPasswordNextButton()
	{
		passwordNextButton.click();
	}

}
