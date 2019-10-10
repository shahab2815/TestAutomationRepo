package com.atob.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atob.qa.base.TestBase;

public class LoginPage extends TestBase{


	//Page Factory
		@FindBy(css= "div.login div.login__main div.login__pre.hide-xs span.login__link.hide-xs > a.login__fat-link")
		WebElement signUp;
		
		@FindBy(css= "button.social-login__button--facebook")
		WebElement loginWithFacebook;
		
		@FindBy(css= "button.social-login__button--google")
		WebElement loginWithGoogle;
		
		@FindBy(css = "a.login__forgot-password-link")
		WebElement forgotYourPassword;
		
		
		@FindBy(name = "user-reception-email")
		WebElement Email;
		
		
		@FindBy(name = "user-reception-password")
		WebElement Password;
		   
	
	
	 //Init the page objects;
	 public LoginPage() {
		 
		 PageFactory.initElements(driver, this);
	}
	
	 
	 //Action:
	 public void enterTheEmailAdd()
	 {
		 Email.sendKeys("syed.shahabuddin@fromatob.com");
		 
	 }
	 
	 public void enterPassword()
	 {
		 Password.sendKeys("India123!");
	 }
	 
	 public void clickToSignIn()
	 {
		driver.findElement(By.cssSelector("button:contains('Log In')")).click();
	 }
}
