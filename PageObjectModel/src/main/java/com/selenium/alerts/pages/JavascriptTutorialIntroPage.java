package com.selenium.alerts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptTutorialIntroPage {
	
	WebDriver driver;
	
	public  JavascriptTutorialIntroPage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Javascript - Alert")
	WebElement javascriptAlertLink;
	
	@FindBy(linkText="Javascript - Confirm")
	WebElement javascriptConfirmLink;
	
	@FindBy(linkText="Javascript - Prompt")
	WebElement javascriptPromptLink;
	
	public AlertPage clickOnJavascriptAlertLink() {
		javascriptAlertLink.click();
		return new AlertPage(driver);
	}
	
	public ConfirmAlertPage clickOnJavascriptConfirmLink() {
		javascriptConfirmLink.click();
		return new ConfirmAlertPage(driver);
	}
	
	public PromptAlertPage clickOnJavascriptPromptLink() {
		javascriptPromptLink.click();
		return new PromptAlertPage(driver);
	}
}
