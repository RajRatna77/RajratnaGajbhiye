package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributeName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://www.w3schools.com";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	      
	      //Locator:Relative Xpath by Attribute Name
	      //Syntax: //(tagname[@attribute name='attribute value'])
	      
	      driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
	      
	      
	       Thread.sleep(9000);
	       
	       driver.close();
	      
	}
}
