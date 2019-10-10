package com.atob.qa.pages;

import org.openqa.selenium.By;

import com.atob.qa.base.TestBase;

public class headerBarClass extends TestBase 
{
	
	   //traveller info Navigation Bar
		public void travellerInfoNavBar()
		{
		driver.findElement(By.xpath("//a[contains(text(),'Traveller Info')]"));
		}
	
		//Overview Navigation Bar
		public void overviewNavBar()
		{
		driver.findElement(By.xpath("//a[contains(text(),'Overview')]"));
		}
		
		//Payment Navigation Bar
		public void paymentNavBar()
		{
		driver.findElement(By.xpath("//a[contains(text(),'Payment')]"));
		}

}
