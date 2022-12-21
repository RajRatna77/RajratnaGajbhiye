package com.ChromeBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{

	
	
	
	  
	public static void main(String[] args) throws InterruptedException 
	   {
	      System.setProperty("webdriver.chrome.driver", "D:\\Software TESTING\\Software\\Browser\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      
	      
	   
	      // maximizing browser with maximize()
	    //  driver.manage().window().maximize();
	      
	      
	      
	      
	      //OPen URl without loading 
	      driver.navigate().to(url);
	      Thread.sleep(2000);
	      
	    //To get the Title in the page
	      String g=driver.getTitle();
	      System.out.println(g);
	      
	      
	      driver.navigate().back();
	      Thread.sleep(2000);
	      
	      driver.navigate().forward();
	      Thread.sleep(3000);
	      
	      driver.navigate().refresh();
	      Thread.sleep(2000);
	      
	      String url2="https://www.insightsonindia.com/indian-economy-3/introduction-to-economics/";
	      driver.get(url2);
	     
	      //Getting Current URL:gets current page opened in the Browser
	     String u= driver.getCurrentUrl();
	     System.out.println(u);
	    driver.close();
	     //driver.quit();
	   }
}
