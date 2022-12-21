package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FullSelenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
      String url = "https://www.facebook.com/reg/";
      
      driver.get(url);
      // maximizing browser with maximize()
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      Thread.sleep(3000);
      
      //Locator:Name
      driver.findElement(By.name("firstname")).sendKeys("WeTHEPeople");
      Thread.sleep(3000);
      
      //Locator: Name
      
      driver.findElement(By.name("lastname")).sendKeys("OfINDIA");
      
      Thread.sleep(3000);
      
    //Locator: Name
      
      driver.findElement(By.name("reg_email__")).sendKeys("wetheppeople@gmail.com");
      
      Thread.sleep(3000);
      
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));//To Select Day
	
	Select s=new Select(day);
	s.selectByIndex(11);
	//s.selectByValue();
	//s.selectByVisibleText();
	
	 Thread.sleep(3000);
	 
	WebElement month=driver.findElement(By.xpath ("//select[@id=\"month\"]"));
	
	Select s1=new Select(month);
	//s1.selectByIndex(6);
	s1.selectByValue("2");
	
	Thread.sleep(3000);
	
	WebElement year=driver.findElement(By.xpath ("//select[@id='year']"));
	
	Select s2=new Select(year);
	
	s2.selectByVisibleText("2018");
	
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("(//span[@class=\"_5k_2 _5dba\"])[2]")).click();
	
	Thread.sleep(3000);
	
	//driver.close();
	
}
}
