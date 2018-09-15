package com.selenium.alerts;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.alerts.pages.AlertPage;
import com.selenium.alerts.pages.ConfirmAlertPage;
import com.selenium.alerts.pages.JavascriptTutorialIntroPage;
import com.selenium.alerts.pages.PromptAlertPage;
import com.selenium.alerts.pages.TizagTutorialsHomePage;

public class AlertsDemo {
	WebDriver driver;
	@Test
	public void alertDemo() {

		FunctionLibrary fl =new FunctionLibrary();

		driver = fl.launchBrowser("FF");

		fl.openUrl("http://www.tizag.com");

		TizagTutorialsHomePage ttp = PageFactory.initElements(driver, TizagTutorialsHomePage.class);

		ttp.clickOnJavascriptTutorialLink();

		JavascriptTutorialIntroPage jtip = PageFactory.initElements(driver, JavascriptTutorialIntroPage.class);

		jtip.clickOnJavascriptAlertLink();

		/*WebElement alertLink=driver.findElement(By.linkText("View an alert message"));
	  alertLink.click();*/

		AlertPage ap = new AlertPage(driver);

		ap.clickOnAlertLink();

		Alert alert = fl.switchToAlert();

		System.out.println(fl.getMessageOfAlert(alert));

		fl.clickAlertOkButton(alert);

		//confirm Alert

		ap.clickOnConfirmAlertButton();

		Alert confirmAlert = fl.switchToAlert();

		System.out.println(fl.getMessageOfAlert(confirmAlert));

		fl.clickAlertOkButton(confirmAlert);


		/*Alert alert= driver.switchTo().alert();


	  System.out.println(alert.getText());

	  alert.accept();

	  driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();

	  Alert confirmAlert = driver.switchTo().alert();

	  System.out.println(confirmAlert.getText());

	  confirmAlert.accept();*/
	}

	@Test
	public void confirmAlertDemo() {

		FunctionLibrary fl =new FunctionLibrary();

		driver = fl.launchBrowser("FF");

		fl.openUrl("http://www.tizag.com");

		TizagTutorialsHomePage ttp = PageFactory.initElements(driver, TizagTutorialsHomePage.class);

		ttp.clickOnJavascriptTutorialLink();

		JavascriptTutorialIntroPage jtip = PageFactory.initElements(driver, JavascriptTutorialIntroPage.class);

		jtip.clickOnJavascriptConfirmLink();

		ConfirmAlertPage cap = PageFactory.initElements(driver, ConfirmAlertPage.class);

		cap.clickOnLeaveTizagButton();

		Alert confrimDismissAlert = fl.switchToAlert();

		System.out.println(fl.getMessageOfAlert(confrimDismissAlert));

		fl.clickAlertCancelButton(confrimDismissAlert);

		// switching back to default browser
		//driver.switchTo().defaultContent();

		fl.swithcToFirstBrowser();	  

		//After clicking cancel button it is opening another alert

		Alert confirmAlet = fl.switchToAlert();

		System.out.println(fl.getMessageOfAlert(confirmAlet));

		fl.clickAlertOkButton(confirmAlet);
	}

	@Test
	public void promptAlertDemo() {

		FunctionLibrary fl =new FunctionLibrary();

		driver = fl.launchBrowser("FF");

		fl.openUrl("http://www.tizag.com");

		TizagTutorialsHomePage tthp = new TizagTutorialsHomePage(driver);

		JavascriptTutorialIntroPage jtip = tthp.clickOnJavascriptTutorialLink();

		PromptAlertPage pap =  jtip.clickOnJavascriptPromptLink();

		pap.clickOnSayMyNameButton();

		Alert promptAlert =  fl.switchToAlert();

		if(promptAlert!=null) {

			fl.setAlertTextBox(promptAlert, "Venkata Krishna Rao Sure");

			fl.clickAlertOkButton(promptAlert);

			fl.swithcToFirstBrowser();
		}else
		{
			Assert.assertFalse(true,"Alert is not open");
		}

		Alert confirmAlert = fl.switchToAlert();
		if(confirmAlert!=null) {

			String confirmAlertMessage = fl.getMessageOfAlert(confirmAlert);

			Assert.assertTrue(confirmAlertMessage.contains("Venkata Krishna Rao Sure"),"Name should present in the confirm popup");
		}
		else
		{
			Assert.assertFalse(true,"Alert is not open");
		}

	}
}
