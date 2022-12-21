package com.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class RelativeXpathIndex 
{

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
	      System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing Course\\\\Testing Software\\\\Selenium\\\\Browser Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      driver.get("https://www.tutorialspoint.com/about/tutorials_writing.htm");
	      // identify element with xpath having index
	      WebElement t = driver.findElement(By.xpath("//ul[@class='list']/li[2]"));
	      //getText to get element text
	      System.out.println("The element is: " + t.getText());
	      driver.close();
	   }
}
