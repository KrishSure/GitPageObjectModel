package com.selenium.alerts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TizagTutorialsHomePage {
	
	WebDriver driver;
	
	public TizagTutorialsHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Javascript Tutorial")
	WebElement javascriptTutorialLink;
	
	public JavascriptTutorialIntroPage clickOnJavascriptTutorialLink() {
		javascriptTutorialLink.click();
		return new JavascriptTutorialIntroPage(driver);
	}

}
