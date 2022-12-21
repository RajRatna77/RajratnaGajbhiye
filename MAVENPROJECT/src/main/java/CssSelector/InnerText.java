package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerText 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		String url="https://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		 driver.findElement(By.cssSelector("font:contains('UserName: ')")).sendKeys("1234");

	}

}
