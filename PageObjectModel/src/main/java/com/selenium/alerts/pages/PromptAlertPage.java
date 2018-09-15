package com.selenium.alerts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;

public class PromptAlertPage {
	
	WebDriver driver;
	FunctionLibrary fl;

	public PromptAlertPage(WebDriver driver) {
		this.driver = driver;
		fl = new FunctionLibrary();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Say myname!']")
	WebElement sayMyNameButton;
	
	public void clickOnSayMyNameButton() {
		fl.clickOnElement(sayMyNameButton, "Y");
	}
	
}
