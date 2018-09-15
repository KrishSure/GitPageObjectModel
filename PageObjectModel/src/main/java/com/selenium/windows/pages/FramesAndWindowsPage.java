package com.selenium.windows.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesAndWindowsPage {
	
	WebDriver driver;

	public FramesAndWindowsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Open New Tabbed Windows")
	WebElement openNewTabbedWindowsLink;

	public void clickOnOpenNewTabbedWindowsLink() {
		openNewTabbedWindowsLink.click();
	}

	@FindBy(linkText="Open New Seperate Windows")
	WebElement openNewSeperateWindowsLink;

	public void clickOnOpenNewSeperateWindowsLink() {
		openNewSeperateWindowsLink.click();
	}
	
	@FindBy(linkText="Open Seperate Multiple Windows")
	WebElement openSeperateMultipleWindowsLink;

	public void clickOnOpenSeperateMultipleWindowsLink() {
		openSeperateMultipleWindowsLink.click();
	}
	
	@FindBy(xpath="//a[@href='http://www.sakinalium.in']//button[@class='btn btn-info'][contains(text(),'click')]")
	WebElement tabbedWindowClickButton;

	public void clickOnTabbedWindowClickButton() {
		tabbedWindowClickButton.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement seperateWindowClickButton;

	public void clickOnSeperateWindowClickButton() {
		seperateWindowClickButton.click();
	}
	
	@FindBy(xpath="//div[@id='Multiple']//button[@class='btn btn-info'][contains(text(),'click')]")
	WebElement multipleWindowClickButton;

	public void clickOnMultipleWindowClickButton() {
		multipleWindowClickButton.click();
	}
	
	public void OpenATabbedWindow() {
		clickOnOpenNewTabbedWindowsLink();
		clickOnTabbedWindowClickButton();
	}
	
	public void OpenASeperateWindow() {
		clickOnOpenNewSeperateWindowsLink();
		clickOnSeperateWindowClickButton();
	}
	
	public void OpenMultipleWindows() {
		clickOnOpenSeperateMultipleWindowsLink();
		clickOnMultipleWindowClickButton();
	}
	
	
}
