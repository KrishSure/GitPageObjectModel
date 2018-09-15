package com.selenium.pageobjectmodel.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.annotations.Test;

import com.selenium.pageobjectmodel.pages.GmailHomePage;
import com.selenium.pageobjectmodel.pages.GmailLoginPage;

public class GmailLogin {
	WebDriver driver;
	String browser;
  @Test
  public void f() {
	  
	  FunctionLibrary fl = new FunctionLibrary();
	  driver = fl.launchBrowser("CH");
	  fl.openUrl("https://mail.google.com");
	  
	  GmailLoginPage glp = PageFactory.initElements(driver, GmailLoginPage.class);
	  glp.setEmailOrPhoneField("dilipkumarpv9988@gmail.com");
	  glp.clickEmailNextButton();
	  glp.setPasswordField("Dilip258963");
	  glp.clickPasswordNextButton();
	  
	  GmailHomePage ghp = new GmailHomePage(driver);
	  //String titleOfTheAccount = ghp.getTitleOfAccountsIcon();
	  ghp.clickAccountsIcon();
	  String emailAddress=ghp.getEmailText();
	  System.out.println(emailAddress);
	  
	  assertTrue("dilipkumarpv9988@gmail.com".equals(emailAddress));
	  
  }
  
}
