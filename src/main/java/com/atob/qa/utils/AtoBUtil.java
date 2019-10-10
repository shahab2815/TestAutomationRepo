package com.atob.qa.utils;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AtoBUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	static WebDriver driver;
	
	public static void takeScreenshot() throws IOException 
	{
		//1. take screenshot and store it as a file format:
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//2. now copy the screenshot to desired location using copyFile method.
		//String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File("/Users/fromatob/testAutomation/src/main/java/Screenshots"+".png"));
	
	}
	 

	
}
