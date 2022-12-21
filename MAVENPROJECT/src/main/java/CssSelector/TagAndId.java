package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagAndId 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.iedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
	}
}
