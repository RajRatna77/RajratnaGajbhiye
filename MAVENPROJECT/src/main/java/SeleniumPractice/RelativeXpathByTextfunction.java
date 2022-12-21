package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpathByTextfunction 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.facebook.com/login/";
		driver.get(url);
		
		WebElement e=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		e.click();	
	
	}
	
}
