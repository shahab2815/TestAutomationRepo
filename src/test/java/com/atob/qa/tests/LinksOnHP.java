package com.atob.qa.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.atob.qa.base.TestBase;

public class LinksOnHP extends TestBase {
	
	
	@Test
	public static void allLinksOnHP() {
		
	
	initialization();
	List<WebElement> linksize = driver.findElements(By.tagName("a")); 
	int linksCount = linksize.size();
	System.out.println("Total no of links Available: "+linksCount);
	
	
	driver.quit();
	}
	

}
