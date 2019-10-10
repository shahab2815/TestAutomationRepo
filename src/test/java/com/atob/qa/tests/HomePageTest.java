package com.atob.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atob.qa.base.TestBase;
import com.atob.qa.pages.HomePage;
import com.atob.qa.pages.LoginPage;
import com.atob.qa.pages.OrderPage;
import com.atob.qa.pages.SearchResultPage;
import com.atob.qa.utils.AtoBUtil;

public class HomePageTest extends TestBase{

  HomePage homepage;
  LoginPage loginpage;
  OrderPage orderpage;
  SearchResultPage searchresultpage;
   
  public HomePageTest()
  {
   super(); 
  }
  
 
  @BeforeTest
  public void setUp()
  {
	    initialization();
        homepage = new HomePage();
        loginpage = new LoginPage();
        orderpage = new OrderPage();
    	searchresultpage = new SearchResultPage();
  
  }
  
 @Test(priority=1)
public void homePageTitleTest()
	{
	String title = homepage.validateHPTitle();
	Assert.assertEquals(title, "Train Tickets for Germany inc 19€ Specials, Bus, Flight and Carpool in one Search | fromAtoB.com" ); 
	}
	
@Test(priority=2) 
public void homePageHeadingTest()
	{
	 boolean flag = homepage.validateHPHeading();
	Assert.assertTrue(flag, "train,bus,flight,carpooling is displayed" );
	}
	
@Test(priority=3)
public void selectBahnCard() throws InterruptedException
	{
	homepage.passengers().click();
	Thread.sleep(1000);
	homepage.clearFirstPassengerAge();
	Thread.sleep(1000);
	homepage.enterFirstPassengerAge().sendKeys("25");
	homepage.firstPassengerBCField().selectByVisibleText("BahnCard 25, 1st Class");
	String abc = homepage.textOnAllVehicles().getText();
	Assert.assertEquals(abc, "All Vehicles");
	}

	
@Test(priority=4)
public void searchATrip() throws Exception
	{
	homepage.enterDepartureCity("berlin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[(text() ='Berlin')]")).click();
	homepage.enterArrivalCity("aachen");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[(text() ='Aachen')]")).click();
	homepage.selectDepartureDate();
	homepage.selectReturnDate();
	homepage.searchBtn();
	String text = searchresultpage.ValidateSearchResultPage(); 
	Assert.assertEquals(text, "Berlin to Aachen");
	System.out.println("the text Berlin to Aache is displayed on search result page" );
	Thread.sleep(200000);
	searchresultpage.SelectBlaBlaFromFilters();
	searchresultpage.SelectBusFromFilters();
	searchresultpage.SelectFlightFromFilters();
	Thread.sleep(10000);
	

	}

  
@AfterTest
 public void close()
 {
	 driver.close();
 }

  
  
}
