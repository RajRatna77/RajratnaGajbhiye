package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Software\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
      String url = "https://jqueryui.com/droppable/";
      
      driver.get(url);
      // maximizing browser with maximize()
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      Thread.sleep(3000);
      
	//Switching to iframe
      driver.switchTo().frame(0);
      
      //element to find draggable webelement
     WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
     
   //element to find dropbale webelement
     
     WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
     
     Actions a= new Actions(driver);
     
     //method:-1 dragAndDrop(WebElement source,WebElement target)
     
     
     a.clickAndHold(source).moveToElement(target).release().build().perform();
     
     a.dragAndDrop(source,target);
         
     Thread.sleep(3000);
     
	driver.close();
	
		
}
}
