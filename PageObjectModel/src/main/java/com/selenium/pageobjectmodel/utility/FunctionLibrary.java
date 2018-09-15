package com.selenium.pageobjectmodel.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.selenium.eventFiring.WebDriverEventListenerImplementaion;

public class FunctionLibrary {
	public static WebDriver driver=null;
	public static String defaultBrowser="ff";
	public static EventFiringWebDriver efDriver=null;
	
	public WebDriver launchBrowser(String browser)
	{					
			switch (browser) {
			case "CH":
				System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe"); 	  
				driver = new ChromeDriver();
				System.out.println("Chrome browser is launched");
				break;
			case "FF":
				System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
				//disabling the notifications
				FirefoxProfile ffprofile = new FirefoxProfile();
				ffprofile.setPreference("dom.webnotifications.enabled", false);
				FirefoxOptions ffoptions=new FirefoxOptions();
				ffoptions.setProfile(ffprofile);		  
				driver = new FirefoxDriver(ffoptions);
				System.out.println("Firefox browser is launched");
				break;	
			case "IE":
				System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("InternetExplorer browser is launched");
				break;	
			default:
				System.out.println(browser+" browser is not avaliable So launching default "+defaultBrowser);
				if(defaultBrowser!=null) {
					System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				break;
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			efDriver = new EventFiringWebDriver(driver);
			efDriver.register(new WebDriverEventListenerImplementaion());
			driver = efDriver;
			return driver;
	}
	public void openUrl(String Url) {
		driver.get(Url);
	}
	
	public Alert switchToAlert() {
		
		Alert alert=null;
		
		try {
			alert = driver.switchTo().alert();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alert;
	}
	
	public String getMessageOfAlert(Alert alert) {
		return alert.getText();
	}
	
	public void clickAlertOkButton(Alert alert) {
		alert.accept();
	}
	
	public void clickAlertCancelButton(Alert alert) {
		alert.dismiss();
	}
	
	public void setAlertTextBox(Alert alert,String text) {
		alert.sendKeys(text);
	}
	
	public void swithcToFirstBrowser() {
		driver.switchTo().defaultContent();
	}

	public void clickOnElement(WebElement element,String proceed) {
		if(elementIsDisplayed(element,proceed)) {
			element.click();
			System.out.println("Element is clicked :"+element.toString());
		}
		else
			System.out.println("Element is not clicked");
	}
	
	public boolean elementIsDisplayed(WebElement element, String proceed)  {
		try {			
			return element.isDisplayed();		
		}catch(Exception e) {
			//e.printStackTrace();		
			if(proceed!="Y")
				throw new NoSuchElementException("Error came and required element is not displayed");
			else
				return false;
		}
		
	}
	
	public void switchToWindow(int i) {
		
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		if(windows.size()>i) {
			try {
				driver.switchTo().window(windows.get(i));
			} catch (NoSuchWindowException e) {
				e.printStackTrace();
			}
		}else
		{
			System.out.println("Only "+windows.size()+" open windows available "+i+"th window is not existing");
		}
		
	}
	
	public ArrayList<String> handlingMultipleWindows() {
		Set<String> windows = driver.getWindowHandles();
  		
  		Iterator<String> iterator = windows.iterator();
  		
  		ArrayList<String> windowsList = new ArrayList<String>();
  		
  		for(int i=0;iterator.hasNext();i++) {
  			windowsList.add(iterator.next());	
  			System.out.println(" window name "+windowsList.get(i));
  		}
  		
  		return windowsList;
	}
	
	public void takeScreenShot(String methodName,String format) {
		TakesScreenshot tsDriver = (TakesScreenshot) driver;
		long timeNumber = Calendar.getInstance().getTimeInMillis();
		LocalDate today = LocalDate.now();
		try {
			
			File firstScreenshot = tsDriver.getScreenshotAs(OutputType.FILE);

			File screenshot = new File(System.getProperty("user.dir")+"\\Screenshots\\"+today+"\\"+methodName+"\\screen"+timeNumber+"."+format);
									
			FileUtils.copyFile(firstScreenshot, screenshot);
			
			System.out.println("Screenshot location : "+screenshot.toPath());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void takeScreenShot() {
		TakesScreenshot tsDriver = (TakesScreenshot) driver;
		long timeNumber = Calendar.getInstance().getTimeInMillis();
		LocalDate today = LocalDate.now();
		try {
			
			File firstScreenshot = tsDriver.getScreenshotAs(OutputType.FILE);

			File screenshot = new File(System.getProperty("user.dir")+"\\Screenshots\\"+today+"\\"+"Firing"+"\\screen"+timeNumber+".png");
									
			FileUtils.copyFile(firstScreenshot, screenshot);
			
			System.out.println(screenshot.toPath());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
