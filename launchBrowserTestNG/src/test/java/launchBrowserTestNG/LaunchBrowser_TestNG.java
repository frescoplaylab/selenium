package launchBrowserTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LaunchBrowser_TestNG {

 
	@Test
	  public void LaunchBrowser() throws InterruptedException{
		
		
				// Write your script here

	

		  
		  
				//Searching for "Fresco Play" in Google search
				// Find the element locators for the below actions.
		
				// 1) Find locator for Google Search Box and sendkeys as Fresco Play as below.
				driver.findElement(By.("")).sendKeys("Fresco Play");
				
				// 2) Find locator for Google Search Box and sendkeys as Enter  as below.
				driver.findElement(By.("")).sendKeys(Keys.ENTER);
				Thread.sleep(6000);
				System.out.println("Page Title : " + driver.getTitle());
						
						
				//Click "Fresco Apps" link from search list
				// 3) Find locator for Google Search Results and click  Fresco Apps link.
				Thread.sleep(5000);
				driver.findElement(By.("")).click();
				Thread.sleep(5000);
				System.out.println("Page Title : " + driver.getTitle());
	}
}

      
