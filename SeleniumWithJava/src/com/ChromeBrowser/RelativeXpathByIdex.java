package com.ChromeBrowser;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByIdex 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Selenium Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String url = "https://www.facebook.com";
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      Thread.sleep(2000);
	      
	     
	      WebElement t= driver.findElement(By.xpath("(//div[@class='_6lux']/div[2]"));
	     
	      System.out.println ("Element is: " + t.getText ());
	      
	      driver.close();
	      ///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
	      
	   
	}
}
