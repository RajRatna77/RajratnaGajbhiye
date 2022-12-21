package com.Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeByWebElement 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Software\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
      String url = "https://demo.guru99.com/test/guru99home/";
      
      driver.get(url);
      // maximizing browser with maximize()
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      Thread.sleep(3000);
      
      // iframe by Index
      driver.switchTo().frame("a077aa5e"); //Swtching to the Id by the Name/Id
      
      Thread.sleep(3000);
      
      System.out.println("***********We Are on the Iframe**************");
      
      driver.findElement(By.xpath("/html/body/a/img")).click();//click on the iframe
      
      System.out.println("***********We Are on the Iframe Image**************");
      
      Thread.sleep(5000);
      
      driver.switchTo().defaultContent();
      
      
      Thread.sleep(3000);
      
     // driver.quit();
	}
}
