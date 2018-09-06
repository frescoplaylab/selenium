package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url){
		// Write your script here
		
		if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "geckodriver local path" );
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
