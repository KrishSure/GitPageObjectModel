package com.selenium.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.annotations.Test;

public class ActionsDemoTest {
	WebDriver driver;
  @Test
  public void dragAndDropByTest() {
	  FunctionLibrary fl = new FunctionLibrary();
	  driver = fl.launchBrowser("FF");
	  fl.openUrl("http://jqueryui.com/draggable/");
	  
	  driver.switchTo().frame(0);
	  
	  Actions actions = new Actions(driver);
	  
	  WebElement source = driver.findElement(By.id("draggable"));
	  
	  actions.dragAndDropBy(source, 0, 100).build().perform();
	  
	  actions.clickAndHold(source).moveByOffset(100, 100).release().build().perform();
	  
	  Actions actions1= actions.clickAndHold(source);
	  Actions actions2 = actions1.moveByOffset(100, 0);
	  Actions actions3 = actions2.release();
	  actions3.build().perform();	  
  }
  
  @Test
  public void dragAndDropTest() {
	  FunctionLibrary fl = new FunctionLibrary();
	  driver = fl.launchBrowser("FF");
	  fl.openUrl("http://jqueryui.com/droppable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement source = driver.findElement(By.id("draggable"));
	  WebElement target = driver.findElement(By.id("droppable"));
	  
	  Actions actions = new Actions(driver);
	  
	  actions.dragAndDrop(source, target).build().perform();
	  
  }
  
  @Test
  public void resizableTest() {
	  FunctionLibrary fl = new FunctionLibrary();
	  driver = fl.launchBrowser("FF");
	  fl.openUrl("http://jqueryui.com/resizable/");
	  
	  driver.switchTo().frame(0);
	  
	  WebElement resizableElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]"));
	  
	  Point p = resizableElement.getLocation();
	  
	  Rectangle r = resizableElement.getRect();
	  
	  Actions actions = new Actions(driver);
	  
	  actions.clickAndHold(resizableElement).moveByOffset(r.height+100, r.width+100).release().build().perform();
	  
  }
  
  @Test
  public void selctableTst() {
	  FunctionLibrary fl = new FunctionLibrary();
	  driver = fl.launchBrowser("FF");
	  fl.openUrl("http://jqueryui.com/selectable/");
	  
	  driver.switchTo().frame(0);
	  
	  List<WebElement> items = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
	  
	  System.out.println(items.size());
	  
	  Actions actions = new Actions(driver);
	  
	  actions.click(items.get(0)).keyDown(Keys.CONTROL).click(items.get(2)).click(items.get(5)).keyUp(Keys.CONTROL).build().perform();
  }
}
