package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagAndClass {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","D:\\Software TESTING\\Selenium Project\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Software TESTING\\Selenium Project\\geckodriver.exe");
		
		//WebDriver driver1=new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		
		//System.setProperty("webdriver.edge.driver","D:\\Software TESTING\\Selenium Project\\msedgedriver.exe");
		
		//WebDriver driver2=new EdgeDriver();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	

}
