package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.LoginPage;

public class verfiyLogIn {

	@Test
	public void verifyLogin() throws InterruptedException{
		

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); 
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/selenium/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver(caps);
		System.out.println("PhantomJS Headless Driver launched");
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(8000);
		
		// Write your code here
		
		
		
		
		
		
		driver.quit();
		System.out.println("Browser Quit is successful");
	}
}
