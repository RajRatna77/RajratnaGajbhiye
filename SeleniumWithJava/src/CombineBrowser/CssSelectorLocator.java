package CombineBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	      String url = "https://www.facebook.com";
	      
	      
	      driver.get(url);
	      // maximizing browser with maximize()
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      //Locator:Css Selector
	      
	     // driver.findElement(By.cssSelector(" tagname[attributename='attrribute value']"));
		
	      driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abc@gmail.com");

	      Thread.sleep(2000);
	}

}
