package com.atob.qa.pages;

import org.openqa.selenium.By;


import com.atob.qa.base.TestBase;

public class TripOverviewPage extends TestBase{
	
	
    //outgoing itinerary expand button down.
	public void out_itinerary_expand_downAndup()
	{
	driver.findElement(By.xpath("//div[@id='CheckoutOverview']//div[@class='panel ticket']//div[@class='CheckoutOverviewFare']//div[3]//div[1]//div[@class='trip-card-header']")).click();
	}
	
	//outgoing itinerary expand button up.
	public void out_itinerary_expand_up()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[1]/div[3]/div/div[1]/img")).click();
	}
	
	//return itinerary expand button down
	public void return_itinerary_expand_down()
	{	
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[3]/div/div/img")).click();
	}
	
	//return itinerary expand button up
	public void return_itinerary_expand_up()
	{	
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[3]/div/div[1]/img")).click();	
	}
		
	//Continue to Traveller info
	public void continueToTravellerInfoPage()
	{
	driver.findElement(By.xpath("//span[contains(text(),'Continue to traveller info')]")).click();
	}
	
	//Comfort Class outgoing Second Class radio button
	public void select_out_2_class()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[1]/div[4]/div[2]/label[1]/i")).click();
	}
	
	//Comfort Class outgoing First Class radio button
	public void select_out_1_class()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[1]/div[4]/div[2]/label[2]/i")).click();
	}
    
	//Comfort Class Return Second Class radio button
	public void select_return_2_class()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[4]/div[2]/label[1]/i")).click();
	}
		
	//Comfort Class Return First Class radio button
	public void select_return_1_class()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[4]/div[2]/label[2]/i")).click();
	}
	
	//Outgoing Seat reservation 
	public void out_seat_reservation()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[1]/div[6]/label/i")).click();
	}
	
	//Return Seat reservation 
	public void return_seat_reservation()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[6]/label/i")).click();
	}
	
	//Change button for Outgoing fare
	public void out_change_btn()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[1]/div[7]/div[1]/div[1]/span[2]")).click();
	}
	
	//Change button for return fare
	public void return_change_btn()
	{
	driver.findElement(By.xpath("//*[@id=\"CheckoutOverview\"]/div/div[2]/div[7]/div[1]/div[1]/span[2]")).click();
	}
	
	//Seat Preference close button
	public void closeSeatPreferences()
	{
	driver.findElement(By.xpath("//a[@class='btn btn-clear']")).click();
	}
	
    //Continue button.
	public void continuebutton()
	{
	driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	}
	
	
	

}
