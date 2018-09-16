package com.selenium.dynamicwebtable.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicTablePage {

	WebDriver driver;
	//Dynamic Table Page constructor
	public DynamicTablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
