package com.selenium.windows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.annotations.Test;

import com.selenium.windows.pages.FramesAndWindowsPage;
import com.selenium.windows.pages.SakinaliumHomePage;

public class WindowsDemo {
	WebDriver driver;
  @Test
  public void windowsDemo() {
	  
	  FunctionLibrary fl =new FunctionLibrary();

		driver = fl.launchBrowser("FF");

		fl.openUrl("http://demo.automationtesting.in/Windows.html");
		
		FramesAndWindowsPage fawp = new FramesAndWindowsPage(driver);
		
		fawp.OpenATabbedWindow();
		
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		
		String FirstBrowserName = iterator.next();
		String SecondBrowserName = iterator.next();
		
		System.out.println(" first window name : "+FirstBrowserName);
		System.out.println(" Second window name : "+SecondBrowserName);
				
		driver.switchTo().window(SecondBrowserName);
		//fl.switchToWindow(2);
		
		SakinaliumHomePage shp = new SakinaliumHomePage(driver);
		
		//driver.findElement(By.linkText("Download")).click();
		shp.clickOnDonwloadLink();
		
		
	  
  }
  
  @Test
public void multipleWindowsDemo() {
	  
	  FunctionLibrary fl =new FunctionLibrary();

		driver = fl.launchBrowser("FF");

		fl.openUrl("http://demo.automationtesting.in/Windows.html");
		
		FramesAndWindowsPage fawp = new FramesAndWindowsPage(driver);
		
		fawp.OpenMultipleWindows();
		
		/*Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> iterator = windows.iterator();
		
		ArrayList<String> windowsList = new ArrayList<String>();
		
		for(int i=0;iterator.hasNext();i++) {
			windowsList.add(iterator.next());	
			System.out.println(" window name "+windowsList.get(i));
		}*/
		
		
		/*ArrayList<String> windowsList = fl.handlingMultipleWindows();		
				
		driver.switchTo().window(windowsList.get(2));*/
		
		fl.switchToWindow(2);
		
		SakinaliumHomePage shp = new SakinaliumHomePage(driver);
		
		//driver.findElement(By.linkText("Download")).click();
		shp.clickOnDonwloadLink();
		
		//driver.switchTo().window(windowsList.get(1));
		
		//driver.switchTo().window(windowsList.get(0));
		fl.switchToWindow(0);
				
		//FramesAndWindowsPage fawp1 = new FramesAndWindowsPage(driver);
		
		fawp.OpenMultipleWindows();
		
		//fl.handlingMultipleWindows();
		
		/*ArrayList<String> windowsLatestList = fl.handlingMultipleWindows();
		
		driver.switchTo().window(windowsLatestList.get(4));*/
		
		fl.switchToWindow(4);
		
		
		
	  
  }
  
  @Test
  public void separateWindowsDemo() {
  	  
  	  FunctionLibrary fl =new FunctionLibrary();

  		driver = fl.launchBrowser("FF");

  		fl.openUrl("http://demo.automationtesting.in/Windows.html");
  		
  		FramesAndWindowsPage fawp = new FramesAndWindowsPage(driver);
  		
  		fawp.OpenMultipleWindows();
  		
  		
  		ArrayList<String> windowsList = fl.handlingMultipleWindows();
  		  		
  				
  		driver.switchTo().window(windowsList.get(2));
  		//fl.switchToWindow(2);
  		
  		SakinaliumHomePage shp = new SakinaliumHomePage(driver);
  		
  		//driver.findElement(By.linkText("Download")).click();
  		shp.clickOnDonwloadLink();
  		
  		driver.switchTo().window(windowsList.get(1));
  		
  		//driver.switchTo().window(windowsList.get(0));
  		fl.swithcToFirstBrowser();
  		
  		
  	  
    }
  
  
}
