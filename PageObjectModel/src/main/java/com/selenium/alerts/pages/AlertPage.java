package com.selenium.alerts.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
	
	WebDriver driver;
	
	public AlertPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="View an alert message")
	WebElement alertLink;
	
	@FindBy(xpath="//input[@value='Confirmation Alert']")
	WebElement confirmAlertButton;
	
	public void clickOnConfirmAlertButton() {
		confirmAlertButton.click();
	}
	
	public void clickOnAlertLink() {
		alertLink.click();
	}
	
	

}
