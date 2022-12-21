package com.ChromeBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software TESTING\\\\Software\\\\Browser\\\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.facebook.com";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	       //ClassName Locator
	   
				      
	     WebElement e= driver.findElement(By.className("_8esh"));
	     
	     System.out.println(e.getText());
	   
		
	      driver.findElement(By.className("_8esh")).click();
		    Thread.sleep(3000);
		    
		    String title =driver.getTitle();
		 
		    
		    System.out.println("Title of the Current webpage : "+title);
	      driver.quit();
	}

}
