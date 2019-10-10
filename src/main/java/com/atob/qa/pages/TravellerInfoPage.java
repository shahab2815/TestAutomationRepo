package com.atob.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.atob.qa.base.TestBase;

public class TravellerInfoPage extends TestBase  {

	
	
	
	//User Sign in button
	
	public void signIn()
	{
	driver.findElement(By.xpath("//div[@id='CheckoutInfo']//button[contains(text(), 'Sign In')]")).click();	
	}
	
	//email address for signing in
	
	public void emailAddress(String email)
	{
	driver.findElement(By.xpath("//input[@id='email-10']"));	
	}

	//password for signing in
	
	public void password(String password)
	{
	driver.findElement(By.xpath("//input[@id='password-16']"));	
	}

	
	//Sign In button
	
	public void clickSignIn()
	{
	driver.findElement(By.xpath("//div[@id='app']/child::div[1]/child::div[1]/child::div[2]//button[contains(text(),'Sign In')]")).click();
	}
	
	//Cancel button
	
	public void cancelBtn()
	{
	driver.findElement(By.xpath("//div[@id='app']/child::div[1]/child::div[1]/child::div[2]//button[contains(text(),'Cancel')]")).click();
	}
		
	
	
    //Primary Traveller Details section
	//Title, First Name, Last Name, email, DB BC
	
	
     public void primaryPassengerDetails(String title, String FName, String LName, String EmailAddress)
     {
     Select select = new Select(driver.findElement(By.xpath("//select[@id='title-0-3626']")));
     select.deselectByVisibleText(title);
     driver.findElement(By.xpath("//input[@id='firstName-0-3631']")).sendKeys(FName);
     driver.findElement(By.xpath("//input[@id='lastName-0-3636']")).sendKeys(LName);
     driver.findElement(By.xpath("//input[@id='email-0-3641']")).sendKeys(EmailAddress);
     }
    
     public void BahnCardNo()
     {
     driver.findElement(By.xpath("//input[@id='deBahnLoyalty-0-3647']"));	 
     }
     
     //Contact Information section
     
     //
     
     
     
     //Invoice Address
     //Full Name, Company Name, Address, Addtional Address line, Postal code, City, Country, cancel
     
     //Add Address 
     public void addAddress()
     {
     driver.findElement(By.xpath("//img[@alt='+']")).click();
     }
     
     //Full Name 
     public void fullName()
     {
     driver.findElement(By.xpath("//input[@id='fullName-3731']"));
     }
     
     //Company Name
     public void companyName()
     {
     driver.findElement(By.xpath("//input[@id='companyName-3736']"));
     }
     
     //Address
     public void address()
     {
     driver.findElement(By.xpath("//input[@id='billingAddress-3739']"));
     }
     
     //Additional Address
     public void additionalAddress()
     {
     driver.findElement(By.xpath("//input[@id='additionalAddress-3744']"));
     }
     
     //Postal Code
     public void postalCode()
     {
     driver.findElement(By.xpath("//input[@id='postalCode-3747']"));
     }
     
     //City
     public void city()
     {
     driver.findElement(By.xpath("//input[@id='city-3753']"));
     }
     
     //Country 
     public void county()
     {
     driver.findElement(By.xpath("//select[@id='country-3758']"));
     }
     
     //Cancel button
     public void cancel()
     {
     driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).click();
     }
     
     //Terms & Condition 
     
     public void clickTAndC()
     {
     driver.findElement(By.xpath("//i[@class='form-icon']")).click();
     }
     
     //Continue to Payment page CTA
     
     public paymentPage clickOnPaymentCTA()
     {
     driver.findElement(By.xpath("//span[text() = 'Continue to Payment']")).click();
     return new paymentPage();
     }
     
     
     
     
     
}
