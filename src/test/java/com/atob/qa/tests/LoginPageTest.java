package com.atob.qa.tests;

 

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.atob.qa.base.TestBase;
import com.atob.qa.pages.HomePage;
import com.atob.qa.pages.LoginPage;
import com.atob.qa.pages.OrderPage;
import com.atob.qa.pages.SearchResultPage;
import com.atob.qa.utils.AtoBUtil;

public class LoginPageTest extends TestBase{
		
	LoginPage loginpage;
	HomePage homepage;
	
	
	 
	
	public LoginPageTest()
	{
	super();	
	}

	@BeforeSuite
	public void setUp()
	{
	
	initialization();
	homepage = new HomePage();
	loginpage = new LoginPage();
	
	}
	
	@Test
	public void loginTest()
	{
		
		homepage.loginFromHomePage();
		loginpage.enterTheEmailAdd();
		loginpage.enterPassword();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		loginpage.clickToSignIn();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
