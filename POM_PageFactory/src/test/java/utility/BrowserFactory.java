package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url ){
		
		// Write your script here
		
		
		
		else if (browserName.equalsIgnoreCase("PhantomJS"))
		{
			 DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setJavascriptEnabled(true); 
			 caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/selenium/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
			 driver = new PhantomJSDriver(caps);
			System.out.println("PhantomJS Headless Driver launched");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
}
