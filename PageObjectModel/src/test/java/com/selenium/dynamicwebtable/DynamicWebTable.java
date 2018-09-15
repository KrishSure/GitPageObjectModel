package com.selenium.dynamicwebtable;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.annotations.Test;

import com.selenium.dynamicwebtable.pages.DynamicTablePage;

public class DynamicWebTable {
	WebDriver driver;
	
	@Test(enabled=false)
	public void f() {
		FunctionLibrary fl = new FunctionLibrary();
		driver = fl.launchBrowser("FF");
		fl.openUrl("https://money.rediff.com/gainers/bse/daily/groupall");

		//DynamicTablePage dtp = PageFactory.initElements(driver, DynamicTablePage.class);
		DynamicTablePage dtp = new DynamicTablePage(driver);

		String requiredCompanyName = "NCC";

		WebElement tableBodyElement = driver.findElement(By.xpath("//table/tbody"));

		List<WebElement> rowElemnts = tableBodyElement.findElements(By.tagName("tr"));

		System.out.println("no of rows :"+rowElemnts.size());

		for(int i=0;i<rowElemnts.size();i++) {
			List<WebElement> coloumnElements = rowElemnts.get(i).findElements(By.tagName("td"));

			System.out.println(i+"th row: no of coloumns :"+coloumnElements.size());

			String actualCompanyName = coloumnElements.get(0).findElement(By.tagName("a")).getText();

			if(requiredCompanyName.equals(actualCompanyName)) {			 			 
				System.out.println("Company Name:"+actualCompanyName);
				System.out.println("Group : "+coloumnElements.get(1).getText());
				System.out.println("Prev Close (Rs) : "+coloumnElements.get(2).getText());
				System.out.println("Current Price (Rs) : "+coloumnElements.get(3).getText());
				System.out.println("% Change : "+coloumnElements.get(4).findElement(By.tagName("font")).getText());
				break;
			}

		}
	}
	
	@Test
	public void dynamicWebTableDemo()
	{
		FunctionLibrary fl = new FunctionLibrary();
		driver = fl.launchBrowser("FF");
		fl.openUrl("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
		WebElement tableHederRowElement = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr"));
		
		List<WebElement> coloumnElements = tableHederRowElement.findElements(By.tagName("th"));
		
		System.out.println(" Number of coloumns : "+coloumnElements.size());
		
		for(WebElement element:coloumnElements){
			System.out.print("\t"+element.getText());
		}
		System.out.println("\n____________________________________________________________________");
		
		
		WebElement tableBodyElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		
		List<WebElement>  rowElements = tableBodyElement.findElements(By.tagName("tr"));
		
		for(WebElement element:rowElements){
			List<WebElement> dataElements= element.findElements(By.tagName("td"));
			for(WebElement element2:dataElements){
				System.out.print("\t"+element2.getText());
			}
			System.out.println("");
		}
		
		System.out.println(" Number of rows : "+rowElements.size());
		
	}
	
	@Test
	public void  dynamicWebTableDemo2(){
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		String requiredelement = "MOIL Ltd.";
		
		
		WebElement tableBodyElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		
		List<WebElement>  rowElements = tableBodyElement.findElements(By.tagName("tr"));
		
		for(WebElement element:rowElements){
			List<WebElement> dataElements= element.findElements(By.tagName("td"));
			
			String companyName = dataElements.get(0).getText();
			if(companyName.equalsIgnoreCase(requiredelement))
			{
				System.out.println("Group : "+dataElements.get(1).getText());
				System.out.println("Prev Close (Rs) : "+dataElements.get(2).getText());
				System.out.println("Current Price (Rs) : "+dataElements.get(3).getText());
				System.out.println("% Change : "+dataElements.get(4).getText());
				break;
			}
			
			//System.out.println("");
		}
	}
	
	@Test
	public void  dynamicWebTableDemo3() throws ParseException{
		FunctionLibrary fl = new FunctionLibrary();
		driver = fl.launchBrowser("FF");
		//fl.openUrl("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		WebElement tableBodyElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		
		List<WebElement>  rowElements = tableBodyElement.findElements(By.tagName("tr"));
		
		float total = 0;
		for(WebElement element:rowElements){
			List<WebElement> dataElements= element.findElements(By.tagName("td"));
			
			String current_Price = dataElements.get(3).getText();	
			NumberFormat f =NumberFormat.getNumberInstance(); 
			
            Number num = f.parse(current_Price);
            current_Price = num.toString();
            
            float current_Price_Value = Float.parseFloat(current_Price);
            
            total = total + current_Price_Value;
           			
		
			
			//System.out.println("");
		}
		
		System.out.println("Curretn Price Total : "+total);
	}
	
	@Test
	public void dynamicWebTableDemo4()
	{FunctionLibrary fl = new FunctionLibrary();
	driver = fl.launchBrowser("FF");
	//fl.openUrl("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		WebElement tableHederRowElement = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr"));
		
		List<WebElement> coloumnElements = tableHederRowElement.findElements(By.tagName("th"));
		
		System.out.println(" Number of coloumns : "+coloumnElements.size());
		
		for(WebElement element:coloumnElements){
			System.out.print("\t\t\t"+element.getText());
		}
		System.out.println("\n________________________________________________________________________________________________");
		
		
		WebElement tableBodyElement = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
		
		List<WebElement>  rowElements = tableBodyElement.findElements(By.tagName("tr"));
		
		for(WebElement element:rowElements){
			List<WebElement> dataElements= element.findElements(By.tagName("td"));
			
			for(int i=0;i<dataElements.size();i++){
				String element1 = dataElements.get(i).getText();
				if(element1.length()<8)
					System.out.print("\t\t\t"+element1);
				else if(element1.length()<16)
					System.out.print("\t\t"+element1);
				else 
					System.out.print("\t"+element1);
				
			}
			System.out.println("");
		}
		
		System.out.println(" Number of rows : "+rowElements.size());
			
	}
}
