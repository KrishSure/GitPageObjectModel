package com.selenium.pageobjectmodel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {
	
	WebDriver driver;
	
	public GmailHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'SignOutOptions')]")
	WebElement accountsIcon;
	
	@FindBy(className="gb_Db")
	WebElement emailText;
	
	public void clickAccountsIcon() {
		accountsIcon.click();
	}
	
	public String getTitleOfAccountsIcon() {
		return accountsIcon.getAttribute("aria-label");
	}
	
	public String getEmailText()
	{
		return emailText.getText();
	}

}
