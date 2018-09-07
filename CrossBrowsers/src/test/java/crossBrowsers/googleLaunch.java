package crossBrowsers;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class googleLaunch {

	public WebDriver driver;
	
	@BeforeTest
	
	@Parameters("browser")
	public void SelectBrowser(String browser)
	{
	
		// Write your script here  
		
		
		
		
		
		
	
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void GoogleSreach() throws InterruptedException{
		
		//Searching for "Fresco Play" in Google search
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Fresco Play");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		System.out.println("Page Title : " + driver.getTitle());
				
				
		//Click "Fresco Apps" link from search list
		driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
		
	}
	
	
	@AfterTest
	public void BroswerQuit(){
		driver.quit();
	}	
	
}
	
	
