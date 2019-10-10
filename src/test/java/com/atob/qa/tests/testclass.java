package com.atob.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.atob.qa.base.TestBase;

public class testclass extends TestBase {
	

	@Test
	public static void helloWorld() throws IOException, InterruptedException
	{
		System.out.println("hello world");
		initialization();
		 
		
	    //driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.cssSelector("input#search_departure_autocompleted")).sendKeys("Berlin");
		List<WebElement> cityList = driver.findElements(By.cssSelector("#ui-id-1"));
	    cityList.get(2).click();
		for(WebElement element : cityList)
		{
			System.out.println(element.getText());
		}
		
		/*
		driver.findElement(By.cssSelector("div.autocomplete-destination > ul li:nth-child(4)")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Aachen");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div.autocomplete-destination > ul li:nth-child(2)")).click();
		driver.findElement(By.id("departureAt")).click();
		
		//1) 
		//*li and nth child*
		//syntax 
		//tagname.classname > ul li:nth-child(0, 1, 2...).click();
		
		
		// 2)
		//JavaScript to scroll down 
		/*
		driver.findElement(By.cssSelector("div#pop-under div.checkbox")).click();
		JavascriptExecutor scrDown = (JavascriptExecutor)driver;
		scrDown.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
        driver.findElement(By.cssSelector("img[alt='Berlin']")).click();
		*/
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("/Users/fromatob/testAutomation/src/test/java/com/atob/qa/tests/ScreenShots" + ".png"));
		System.out.println("the screenshot is taken");
		//driver.quit();*/
	}

	
	
	//DATA driver approuch
	
	//cachelook is used when the element is called several time and it is static element not dynamic in nature.
	//so use @cachelookup annotation where ever you fill necassary 
	
	//Webdriver fire event
	
	
	 
@Test
public static void switchstatment()
{

    String charvalue = "January";
	switch(charvalue.toUpperCase())
	{
	case "JANUARY":
		System.out.println("the value is Jan");
		break;
	case "feb":
		System.out.println("the value is Feb");
		break;
	case "march":
		System.out.println("the value is Mar");
		break;
		
	default:
		System.out.println("the value is neigther A, B or C");
		break;
	}

		
}
@Test
public static void printDayOfTheWeek()
{
int day =1;
switch(day)
{
case 0:
	System.out.println("It is Sunday");
break;

case 1:
	System.out.println("it is Monday");
	break;
default:
	System.out.println("it is not a week day");
}

}

@Test
public static void DayofTheWeekChallenge()
{
int day=1;

if(day==1)
{
System.out.println("it is sunday");
}
else if(day==2) 
{
	System.out.println("it is Monday");
}
else if(day==3) 
{
	System.out.println("it is Tuesday");
}

else if(day==4) 
{
	System.out.println("it is Wed");
}
else if(day==5) 
{
	System.out.println("it is Thursday");
}
else
	System.out.println("it is not a day of the week");
}


@Test
public static void iLeapYear()
{
 int year = 2000;
 
	if(year>=1&&year<=9999)
	{
	 if(year%400==0)
	 {
		 System.out.println("this " + year + " is lear year");
	 }else
		 System.out.println("this " + year + " is not a leap year");
	
	}
}
@Test
public static int getLargestPrime()
{
int number =0;
if(number == 0 && number/2==0)
{

}
//return number;
return -1;


}

}
