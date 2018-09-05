package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url){
		
		if (browserName.equalsIgnoreCase("chrome")){
		
			
			driver.get("https://en.wikipedia.org/wiki/Main_Page");
			System.setProperty("webdriver.chrome.driver", "/home/vsjanani/Desktop/Selenium_Workspace/Drivers/chromedriver");
			driver=new ChromeDriver();	
		}
		
		
		else if (browserName.equalsIgnoreCase("firefox")){
			
			
			System.setProperty("webdriver.gecko.driver", "/home/vsjanani/Desktop/Selenium_Workspace/Drivers/geckodriver" );
			driver= new FirefoxDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("HtmlUnitDriver")){
			
			 driver = new HtmlUnitDriver(true);
			
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
