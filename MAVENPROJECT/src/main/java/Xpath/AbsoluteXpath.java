package Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXpath 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.iedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
}
