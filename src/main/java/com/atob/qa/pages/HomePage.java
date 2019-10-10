package com.atob.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.atob.qa.base.TestBase;
import com.atob.qa.utils.AtoBUtil;

public class HomePage extends TestBase {
	
	//Page Factory - OR:
	@FindBy(linkText = "Log In")
	WebElement LogInButton;
	
	@FindBy(id="search_departure_autocompleted")
	WebElement StartFrom;
	
	@FindBy(id="search_arrival_autocompleted")
	WebElement StopTo;
	
	@FindBy(xpath="//input[@placeholder='Depart']")
	WebElement Departure;
	
	@FindBy(xpath="//input[@placeholder='Return']")
	WebElement Return;
	
	
	
	
	
	//from by id 
	//input#search_departure_autocompleted
	
	//Arrival by id
	//input#search_arrival_autocompleted
	
	//click fromAtob logo by class
	//a.navbar__logo

	//popunder by id
	//div#pop-under
	
	
    public HomePage() {
   	 PageFactory.initElements(driver, this);
   	}
   
	
	//method to validate the text on the HP
    
    public void loginFromHomePage()
    {
    LogInButton.click();
    
    }
    public boolean validateHPHeading()
    {
    return driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/h1")).isDisplayed();
    }
   
    //method to get the home page title.
    public String validateHPTitle() {
    	
    return driver.getTitle();
    }  
    
    //method to sign in from the HP
    public LoginPage linktoSignInPage()
    {
    driver.findElement(By.id("sign-in-button")).click();
    	//Signinlink.click();
       return new LoginPage();	   
    }
    
    //Logged in User
    
    public Select myProfile()
    {
    Select selectFromDropDown = new Select(driver.findElement(By.xpath("//a[contains(text(),'My profile')]")));	
    return selectFromDropDown;
    }
    
    
    // Enter Departure City
    public void enterDepartureCity(String DeptCity)
    {
    driver.findElement(By.xpath("//input[@id='search_departure_autocompleted']")).sendKeys(DeptCity);
    }
    
    //Enter Arrival City Name
    public void enterArrivalCity(String ArrCity)
    {
    driver.findElement(By.xpath("//input[@id='search_arrival_autocompleted']")).sendKeys(ArrCity);
    }
    
    //Passengers 
    public WebElement passengers()
    {
    return driver.findElement(By.xpath("//a[@class='btn more-passengers-btn']"));
    }
    
    // Passenger add button
    public void addPassengersButten()
    {
    driver.findElement(By.xpath("//button[@type='button']"));
    }
    
    //Clear First Passenger Age field
    public void clearFirstPassengerAge()
    {
    driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_0_age']")).clear();
    }
    
    //Enter First Passenger  Age
    public WebElement enterFirstPassengerAge()
    {
    WebElement Age = driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_0_age']"));
	return Age;
    }
    
    //First Passenger BahnCard Field 
    
    public Select firstPassengerBCField()
    {
    Select bahnCard1 = new Select (driver.findElement(By.xpath("//select[@id='passenger_group_passengers_attributes_0_agency_discount_id']")));
    return bahnCard1;
    }
     
    //Clear Second Passenger Age Field
   
    public void clearSecondPassengerAge()
    {
    driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_1_age")).clear();
    }
    
    // Enter Second Passenger Age
    public WebElement enterSecondPassengerAge()
    {
    WebElement Age = driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_1_age']"));
	return Age;
    }

    //Second Passenger BahnCard Field 
    
    public Select secondPassengerBCField()
    {
    Select bahnCard2 = new Select (driver.findElement(By.xpath("//select[@id='passenger_group_passengers_attributes_1_agency_discount_id']")));
    return bahnCard2;
    }
    
    //Remove Second passenger 
    public void removeSecondPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[3]/div[3]/button")).click();
    }
  
    //Clear Third Passenger Age Field
    
    public void clearThirdPassengerAge()
    {
    driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_2_age']")).clear();
    }
    
    // Enter third Passenger Age
    public WebElement enterThirdPassengerAge()
    {
    WebElement Age = driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_2_age']"));
	return Age;
    }
    
    
    //third Passenger BahnCard Field 
    
    public Select thirdPassengerBCField()
    {
    Select bahnCard3 = new Select (driver.findElement(By.xpath("//select[@id='passenger_group_passengers_attributes_2_agency_discount_id']")));
    return bahnCard3;
    }
    
    //Remove Third Passenger
    public void removeThirdPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[4]/div[3]/button")).click();
    }
    
   //Clear Forth Passenger Age Field
    public void clearForthPassengerAge()
    {
    driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_3_age']")).clear();
    }
    
    // Enter Forth Passenger Age
    public WebElement enterForthPassengerAge()
    {
    WebElement Age = driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_3_age']"));
	return Age;
    }
    
    //Forth Passenger BahnCard Field 
    public Select ForthPassengerBCField()
    {
    Select bahnCard4 = new Select (driver.findElement(By.xpath("//select[@id='passenger_group_passengers_attributes_3_agency_discount_id']")));
    return bahnCard4;
    }
    
	//Remove Forth Passenger
	public void removeForthPassenger()
    {
    driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[5]/div[3]/button")).click();
    }

    //Clear Fifth Passenger Age Field
    public void clearFifthPassengerAge()
    {
    driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_4_age']")).clear();
    }
    
	// Enter Fifth Passenger Age
    public WebElement enterFifthPassengerAge()
    {
    WebElement Age = driver.findElement(By.xpath("//input[@id='passenger_group_passengers_attributes_4_age']"));
	return Age;
    }
    
    //Second Passenger BahnCard Field 
    public Select FifthPassengerBCField()
    {
    Select bahnCard5 = new Select (driver.findElement(By.xpath("//select[@id='passenger_group_passengers_attributes_4_agency_discount_id']")));
    return bahnCard5;
    }
    
    //Remove Fifth Passenger
  	public void removeFifthPassenger()
    {
      driver.findElement(By.xpath("//*[@id=\"passenger-options\"]/div/div[6]/div[3]/button")).click();
    }
    
    //All Vehicles
    public WebElement editVehicles()
    {
    return driver.findElement(By.xpath("//a[@class='btn more-options-btn']"));
    }
    
    //Text visible on all Vehicles section
    public WebElement textOnAllVehicles()
    {
    WebElement textonallvehicle = driver.findElement(By.xpath("//span[contains(text(),'All Vehicles')]"));
    return textonallvehicle;
    }
    
    //Remove Train
    public void removeTrain()
    {
    driver.findElement(By.xpath("//label[@class='switch-toggle' and @for='vehicles_train']"));
    }
    
    //Text visible after removing Train 
    public WebElement textVisibleWithoutTrain()
    {
    WebElement textvisiblewithouttrain = driver.findElement(By.xpath("//span[contains(text(),'Bus, Plane, Carpool')]"));
    return textvisiblewithouttrain;
    }
   
    
    //Remove Bus
    public void removeBus() {
    driver.findElement(By.xpath("//label[@class='switch-toggle' and @for='vehicles_Bus']"));
    }
    
    //Text visible after removing Bus
    public WebElement textVisibleWithoutBus()
    {
    WebElement textvisiblewithoutBus = driver.findElement(By.xpath("//span[contains(text(),'Train, Plane, Carpool')]"));
    return textvisiblewithoutBus;
    }
    
    //Remove Plane
    public void removePlane() {
    driver.findElement(By.xpath("//label[@class='switch-toggle' and @for='vehicles_Plane']"));
    }
    
    //Text visible after removing Plane
    public WebElement textVisibleWithoutPlane()
    {
    WebElement textvisiblewithoutplane= driver.findElement(By.xpath("//span[contains(text(),'Train, Bus, Carpool')]"));
    return textvisiblewithoutplane;
    }
    
    
    //Remove ride_share
    public void removeRide_Share() {
    driver.findElement(By.xpath("//label[@class='switch-toggle' and @for='vehicles_ride_share']"));
    }
    
    //Text visible after removing carpool
    public WebElement textVisibleWithoutCarpool()
    {
    WebElement textvisiblewithoutcarpool= driver.findElement(By.xpath("//span[contains(text(),'Train, Bus, Plane')]"));
    return textvisiblewithoutcarpool;
    }
    
    //Text visible when no vehicles selected
    public WebElement textVisibleforNoVehicles()
    {
    WebElement textvisiblewithoutvehicles= driver.findElement(By.xpath("//span[contains(text(),'No Vehicles')]"));
    return textvisiblewithoutvehicles;
    }
 
    //Search button
    public SearchResultPage searchBtn()
    {
    driver.findElement(By.xpath("//input[@id='submit-search-btn' and @value='Search']")).click();
    return new SearchResultPage();
    }
 
    
        //Departure Date
	    public void selectDepartureDate() throws Exception {
		String Expected = "April"; 
		//departure date field.	
		driver.findElement(By.xpath("//input[@class='datepicker input-lg departure_on hasDatepicker']")).click();;
		Thread.sleep(2000);  
		//next month
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//previous month
		//driver.findElement(By.xpath("//span[contains(text(),'Prev')]" )).click();
		Thread.sleep(2000);
		String CurrentMonth = driver.findElement(By.xpath("//span[contains(text(),'April')]")).getText();
		
		if(Expected.equals(CurrentMonth))
		{
		System.out.println("the month is already selected");
		}
		else
		{
		System.out.println("expected mnth is not selected. ");	
		}
	
		Thread.sleep(1000);
		
		
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody"));
		List<WebElement> dates = datepicker.findElements(By.tagName("a"));
		
		for(WebElement date : dates)
		{
			
		String colDate = date.getText();
		if(colDate.equals("1"))
		{
			date.click();
			break;
		}
		}
		}
		
	   // Return Date
	    public void selectReturnDate() {
		 
		String returnExpected = "April";
		
		//return date picker
		driver.findElement(By.xpath("//input[@class='datepicker input-lg return_on hasDatepicker']")).click();
		
		//next month link
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		String ReturnMonth = driver.findElement(By.xpath("//span[contains(text(),'April')]")).getText();
		
		if(returnExpected.equals(ReturnMonth))
		{
		System.out.println("the correct monht is selected.");	
		}
		else
		{
		System.out.println("the correct date is not selected");	
		}
		
		WebElement returnDatepicker = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody"));
		
		List <WebElement> returnDates = returnDatepicker.findElements(By.tagName("a"));
		
		for(WebElement rdate : returnDates)
		{
		
		String Col_r_dates = rdate.getText();
			
		if(Col_r_dates.equals("28"))	
		{
		rdate.click();	
		}
		}
		
		}
    
    
}
