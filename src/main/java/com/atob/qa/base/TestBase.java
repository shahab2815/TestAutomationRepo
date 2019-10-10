package com.atob.qa.base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.atob.qa.utils.WebEvenListener;

public class TestBase {
	
 
	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver event_driver;
	public static WebEvenListener eventListener;
	 
	
	public TestBase()
	{
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+  "/src/main/java/com/AtoB/qa/config/config.properties");
		prop.load(ip);		 
		
		} catch(FileNotFoundException e) {
		e.printStackTrace();
		}catch (IOException e) {
		e.printStackTrace();
		}

	 
	}
	
	public static WebDriver initialization() {
	 

	prop.getProperty("browser");
	
	driver = new ChromeDriver();
	
	event_driver = new EventFiringWebDriver(driver);
	eventListener = new WebEvenListener();
	event_driver.register(eventListener);
	driver = event_driver;	

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(com.atob.qa.utils.AtoBUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(com.atob.qa.utils.AtoBUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	return driver;
	
	}
	
}
