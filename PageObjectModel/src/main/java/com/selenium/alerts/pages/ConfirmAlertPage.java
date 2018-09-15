package com.selenium.alerts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmAlertPage {
	
	WebDriver driver;
	public ConfirmAlertPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@value='Leave Tizag.com']")
	WebElement leaveTizagButton;
	
	public void clickOnLeaveTizagButton() {
		leaveTizagButton.click();
	}
}
