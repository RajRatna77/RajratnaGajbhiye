package com.SeleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPerogram 
{

	
	public static void main(String args[]) throws InterruptedException
	{
		//System:-class ;setProperty:- method(key of chrome browser,chrome browser path.exe
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing Course\\Testing Software\\Selenium\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		//upcasting
		WebDriver driver= new ChromeDriver();
		
		//Maximize Browser Size
		
		 driver.manage().window().maximize();
		 
		 //driver:-object reference variable,
		 //manage:- manage() is a method of optional interface,
		 //window():- interface of driver class,
		 //maximize():- it is a method.
		 
		//Minimize Browser window Size
		// driver.manage().window().minimize();
		 
		 //Particular Url Launching
		 
		 driver.get("https://www.insightsonindia.com/indian-economy-3/introduction-to-economics/");
		
		 //Wait for Specified Time
		 Thread.sleep(3000); //3sec time converted into 3000 ms
		 driver.get("https://www.lambdatest.com/blog/selenium-firefox-driver-tutorial/");
		 Thread.sleep(3000);
		 //Browser Window Closing
		 driver.close();
	}
}
