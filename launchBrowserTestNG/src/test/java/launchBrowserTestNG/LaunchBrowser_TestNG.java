package launchBrowserTestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LaunchBrowser_TestNG {
	@Test
	  public void LaunchBrowser() throws InterruptedException{
		  
			// Write your script here
			
		  
		  
			
		  
		  
		  
			//Searching for "Fresco Play" in Google search
			
			driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Fresco Play");
			driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			System.out.println("Page Title : " + driver.getTitle());		
					
			//Click "Fresco Apps" link from search list
		  
			driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();
			Thread.sleep(5000);
			System.out.println("Page Title : " + driver.getTitle());
			 driver.quit();
 	 } 
}
