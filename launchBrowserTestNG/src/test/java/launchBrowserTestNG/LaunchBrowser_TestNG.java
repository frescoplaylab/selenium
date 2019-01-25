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
		
		
		// Write your script here

		
		 
		
		
		
		
		
		
		
		

	

		//Searching for "Fresco Play" in Google search
			
		driver.findElement(By.("")).sendKeys("Fresco Play");
		driver.findElement(By.("")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
					
					
		//Click "Fresco Apps" link from search list
			
		driver.findElement(By.("")).click();
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
		driver.quit();
	}
}

      
