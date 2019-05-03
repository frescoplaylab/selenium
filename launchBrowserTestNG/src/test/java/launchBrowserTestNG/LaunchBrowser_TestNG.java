package launchBrowserTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LaunchBrowser_TestNG {

 
	@Test
	  public void LaunchBrowser() throws InterruptedException{
		
		
		

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true); 
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "/root/selenium/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver(caps);
		System.out.println("PhantomJS Headless Driver launched");
		
		// Write your script here
		
		  
		  
		  
	

		//Searching for "Fresco Play" in Google search
			
		driver.findElement(By.("")).sendKeys("Fresco Play");
		driver.findElement(By.("")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
					
	}
}

      
