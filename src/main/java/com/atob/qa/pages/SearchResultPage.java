package com.atob.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atob.qa.base.TestBase;

public class SearchResultPage extends TestBase {
	
	
	public String ValidateSearchResultPage()
	{
		return driver.findElement(By.xpath("//*[@id=\"SearchSubheader\"]/div[1]/div/div[2]/h6")).getText();
	}

	public void enterDepartureCity()
	{
	driver.findElement(By.xpath("//input[@name='departure_stop']"));
	}
	
	public void enterArrivalCity()
	{
		driver.findElement(By.xpath("//input[@name='arrival_stop']"));
	}
	
	
	public void editPassengerbutton()
	{
	driver.findElement(By.xpath("//*[@id=\"PassengersGroupOverview\"]/div/div[3]/div/button"));
	}
	
	//Clear First Passenger Age field
	public void clearFirstPassengerAge()
	{
	driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[1]/div/div[1]/div/input")).clear();
	}

	// Passenger add button
    public void addMorePassengersBtn()
    {
    driver.findElement(By.xpath("//button[contains(text(), 'Add more passengers')]"));
    }
	
	//Enter First Passenger Age
	public WebElement enterFirstPassengerAge()
	{
	WebElement Age = driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[1]/div/div[1]/div/input"));
	return Age;
	}
	
    //First Passenger BahnCard Field 
    public Select firstPassengerBCField()
    {
    Select bahnCard1 = new Select (driver.findElement(By.xpath("//select[@name='passenger-select-0")));
    return bahnCard1;
    }
	
    
    //Clear Second Passenger Age field
  	public void clearSecondPassengerAge()
  	{
  	driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/input")).clear();
  	}
  	
  	//Enter Second Passenger  Age
  	public WebElement enterSecondPassengerAge()
  	{
  	WebElement Age = driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[2]/div/div[1]/div/input"));
  	return Age;
  	}
  	
    //Second BahnCard Field 
    public Select secondPassengerBCField()
    {
    Select bahnCard2 = new Select (driver.findElement(By.xpath("//select[@name='passenger-select-1")));
    return bahnCard2;
    }
    
    //Remove Second Passenger 
    public void removeSecondPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[3]/div[3]/button"));
    }
    
    
    //Clear Third Passenger Age field
  	public void clearThirdPassengerAge()
  	{
  	driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[3]/div/div[1]/div/input")).clear();
  	}
  	
  	//Enter Third Passenger  Age
  	public WebElement enterThirdPassengerAge()
  	{
  	WebElement Age = driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[3]/div/div[1]/div/input"));
  	return Age;
  	}
  	
    //Third BahnCard Field 
    public Select thirdPassengerBCField()
    {
    Select bahnCard3 = new Select (driver.findElement(By.xpath("//select[@name='passenger-select-2")));
    return bahnCard3;
    }
    
    //Remove Third Passenger 
    public void removeThirdPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[4]/div[3]/button"));
    }
    
    //Clear Forth Passenger Age field
  	public void clearForthPassengerAge()
  	{
  	driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[4]/div/div[1]/div/input")).clear();
  	}
  	
  	//Enter Forth Passenger  Age
  	public WebElement enterForthPassengerAge()
  	{
  	WebElement Age = driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[4]/div/div[1]/div/input"));
  	return Age;
  	}
  	
    //Forth BahnCard Field 
    public Select forthPassengerBCField()
    {
    Select bahnCard4 = new Select (driver.findElement(By.xpath("//select[@name='passenger-select-3")));
    return bahnCard4;
    }
    
    //Remove forth Passenger 
    public void removeForthPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[5]/div[3]/button"));
    }
    
  //Clear Fifth Passenger Age field
  	public void clearFifthPassengerAge()
  	{
  	driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[5]/div/div[1]/div/input")).clear();
  	}
  	
  	//Enter Fifth Passenger  Age
  	public WebElement enterFifthPassengerAge()
  	{
  	WebElement Age = driver.findElement(By.xpath("//*[@id=\"SearchWidget\"]/div[2]/div[4]/div/div[2]/div[5]/div/div[1]/div/input"));
  	return Age;
  	}
  	
    //Fifth BahnCard Field 
    public Select fifthPassengerBCField()
    {
    Select bahnCard5 = new Select (driver.findElement(By.xpath("//select[@name='passenger-select-4")));
    return bahnCard5;
    }
    
    //Remove Fifth Passenger 
    public void removeFifthPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[6]/div[3]/button"));
    }
    
    //Switch-toggle for Train in Filter
    
    public void SelectTrainFromFilters()
    {
    driver.findElement(By.xpath("//*[@id='SearchFilterVehicles']/div[2]/div[@class='switch']/div[@class='CheckboxSwitch']/label[@class='switch-toggle']")).click();
    }
	
    //Switch-toggle from Bus Filter
    public void SelectBusFromFilters()
    {
    driver.findElement(By.xpath("//*[@id='SearchFilterVehicles']/div[3]/div[@class='switch']/div[@class='CheckboxSwitch']/label[@class='switch-toggle']")).click();
    }
    
    //Switch-toggle from Flight Filter
    public void SelectFlightFromFilters()
    {
    driver.findElement(By.xpath("//*[@id='SearchFilterVehicles']/div[4]/div[@class='switch']/div[@class='CheckboxSwitch']/label[@class='switch-toggle']")).click();
    }
    
   //Switch-toggle from BlaBla Filter
    public void SelectBlaBlaFromFilters()
    {
    driver.findElement(By.xpath("//*[@id='SearchFilterVehicles']/div[5]/div[@class='switch']/div[@class='CheckboxSwitch']/label[@class='switch-toggle']")).click();
    }
    
               /*       //select appropriate CTA
   
    //Fastest CTA
    public void fastestCTA() {
      driver.findElement(By.xpath("//*[@id=\"fareFormfastest\"]/div[1]/button[1]")).click();
    	}
    
    //Recommended CTA
    public void recommendedCTA() {
    driver.findElement(By.xpath("//*[@id=\"fareFormrecommended\"]/div[1]/button[1]")).click();
    }
    
    //Cheapest CTA
    public void cheapestCTA() {
    driver.findElement(By.xpath("//*[@id=\"fareFormcheapest\"]/div[1]/button[1]")).click();
    }
    
    //RecommendedAndCheapest CTA
    public void recommendedAndCheapestCTA() {
    driver.findElement(By.xpath("//*[@id=\"fareFormrecommended-cheapest\"]/div[1]/button[1]")).click();
    }
    
    //CheapestAndFastest CTA
    public void cheapestAndFastestCTA() {
    driver.findElement(By.xpath("//*[@id=\"fareFormcheapest-fastest\"]/div[1]/button[1]")).click();
    }
    
   
   //Expand Button = Recommended & Cheapest Fare 
    
    public void expandRecommendedAndCheapestBtn()
    {
    driver.findElement(By.xpath("//*[@id=\"fareFormrecommended-cheapest\"]/div[1]/button[2]")).click();
    }
    
    //Expand Button - Fastest  
    public void expandFastestBtn()
    {
    driver.findElement(By.xpath("//*[@id=\"fareFormfastest\"]/div[1]/button[2]")).click();
    }
    
    //Expand Button Recommended 
    public void expandRecommendedBtn()
    {
    driver.findElement(By.xpath("//*[@id=\"fareFormrecommended\"]/div[1]/button[2]")).click();
    }
    
   //Expand Button = Cheapest  
    public void expandCheapestBtn()
    {
    driver.findElement(By.xpath("//*[@id=\"fareFormcheapest\"]/div[1]/button[2]")).click();
    }
    
    //Expand Button - Cheapest & Fastest  
    public void expandCheapestAndFastestBtn()
    {
    driver.findElement(By.xpath("//*[@id=\"fareFormcheapest-fastest\"]/div[1]/button[2]")).click();
    }
    
    //Recommended & Cheapest Segment
    public void recommendAndCheapestSegment()
    {
    driver.findElement(By.id("fareFormTariffOptionrecommended-cheapest")).click();
    }
    
    
      We will not sure this methods.                       */
    
    
    public void SelectFare()
    {
    driver.findElement(By.xpath("//*[@id=\"Search\"]/div[2]/div/div[4]/div/div[2]/div[1]/div[2]/form/div[1]/button[1]")).click();
    
    }
    
    public void SelectFareOptions()
    {
    
    driver.findElement(By.xpath("//*[@id='Search']/div[2]/child::div/child::div[4]/child::div[1]/div/child::div[2]/div/following-sibling::form/div/button[2]")).click();
    	
    
    }
    
    public Select selectFareFromDropDown()
    {
    WebElement selectFromDropDown = driver.findElement(By.xpath("//*[@id=\"Search\"]/div[2]/div/div[4]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/select"));
    
    Select fare = new Select(selectFromDropDown);
	return fare;
	
     
    }
    
    //
    
    
    
}
