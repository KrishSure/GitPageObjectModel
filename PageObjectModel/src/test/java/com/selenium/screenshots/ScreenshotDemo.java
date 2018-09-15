package com.selenium.screenshots;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.selenium.pageobjectmodel.utility.FunctionLibrary;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	WebDriver driver;
	@Test
	public void screenshotDemo() {
		FunctionLibrary fl = new FunctionLibrary();
		driver = fl.launchBrowser("FF");

		fl.openUrl("https://www.amazon.in/");
		
		
		fl.takeScreenShot("screenshotDemo","gif");
	}
}
