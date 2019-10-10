package com.atob.qa.pages;

import org.openqa.selenium.By;

import com.atob.qa.base.TestBase;

public class paymentPage extends TestBase {
	
	
	//Add a promotional Code
	
	public void addPromotionalCode()
	{
	driver.findElement(By.xpath("//span[contains(text(),'Add a promotional code')]")).click();
	}
	
	//close promotional code
	public void closePromotionalCode()
	{
	driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
	}

	//Enter Promotional code
	
	public void enterPromoCode(String promocode)
	{
	driver.findElement(By.xpath("//input[@id='promoCode-1861']"));
	}
	
	//Add Promotional Code
	public void addPromoCode()
	{
	driver.findElement(By.xpath("//button[contains(text(),'Add code')]")).click();
	}
	
	//Choose Credit Card method.
	
	public void chooseCredidCard()
	{
	driver.findElement(By.xpath("//span[text() ='Pay with credit card']"
			+ "/parent::label[@class='form-radio']/child::i[@class='form-icon']")).click();
	}
	
	// Enter Credit Card Number
	public void enterCCnumber(String cardnumber)
	{
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame4']")));
    driver.findElement(By.xpath("//input[@name='cardnumber']")).clear();
    driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys(cardnumber);
    driver.switchTo().defaultContent();
	}
	
	//Enter Expiry Date
	public void enterExpiryDate(String expdate)
	{
	 
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame5']")));
	driver.findElement(By.xpath("//div[@id='root']//input[@name='exp-date']")).clear();
	driver.findElement(By.xpath("//div[@id='root']//input[@name='exp-date']")).sendKeys(expdate);
	driver.switchTo().defaultContent();
	}
	
	//Enter CVC number
	public void enterCVCnumber(String cvcnumber)
	{
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__privateStripeFrame6']")));
	driver.findElement(By.xpath("//input[@name='cvc']")).clear();
	driver.findElement(By.xpath("//input[@name='cvc']")).sendKeys(cvcnumber);
	driver.switchTo().defaultContent();
	}
	
	//Choose Paypal Method
	
	public void choosePayPal()
	{
	driver.findElement(By.xpath("//span[text() ='Pay with']/parent::label[@class='form-radio']"
			+ "/child::input[@value='paypal']/following-sibling::i[@class='form-icon']")).click();
	}
    
	//Choose Sofort Method
	
	public void chooseSofort()
	{
	driver.findElement(By.xpath("//span[text() ='Pay with']/parent::label[@class='form-radio']"
			+ "/child::input[@value='sofort']/following-sibling::i[@class='form-icon']")).click();
	}
	
	//Confirm and Book CTA
	
	public void confirmAndBookCTA()
	{
	driver.findElement(By.xpath("//button[@class='pay button t-cta c-bg-primary']")).click();
	}
	
	
	public void outClickCTA()
	{
	driver.findElement(By.xpath("//div[@id='CheckoutSidebar']//button[@class='button pay-external t-cta c-bg-primary']")).click();
	}
	
	
}
