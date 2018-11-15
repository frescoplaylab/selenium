package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import Pages.LoginPage;

public class verfiyLogIn {

	@Test
	public void verifyLogin() throws InterruptedException{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); // not really needed: JS enabled by default
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/selenium/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver(caps);
		System.out.println("PhantomJS Headless Driver launched");
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(8000);
		
		// Write your code here
		
		
		
		
		
		
		System.out.println("Login is successful");
		driver.quit();
		System.out.println("Browser Quit is successful");
	}
}
