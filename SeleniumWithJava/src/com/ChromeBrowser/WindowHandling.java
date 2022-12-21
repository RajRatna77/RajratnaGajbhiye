package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software TESTING\\\\Software\\\\Browser\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https:https://phptravels.com/demo/";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(3000);
	      
	      //Locator:Absolute Xpath
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc@gmail.com");
	      
	      
	       Thread.sleep(3000);
	       
	       driver.close();
	      
	}
	
}
