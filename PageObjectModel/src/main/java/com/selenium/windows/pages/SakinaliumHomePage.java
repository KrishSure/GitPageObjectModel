package com.selenium.windows.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SakinaliumHomePage {
	WebDriver driver;

	public SakinaliumHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Download")
	WebElement downloadLink;

	public HomePageUsingPlugin clickOnDonwloadLink() {
		downloadLink.click();
		return new HomePageUsingPlugin();
	}
	
}
