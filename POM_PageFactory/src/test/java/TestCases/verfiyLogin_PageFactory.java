package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Pages.PageFactoryLogin;
import utility.BrowserFactory;

public class verfiyLogin_PageFactory {

	WebDriver driver;
	
	@Test
	public void checkValidUser(){
		
		// This helps to launch browser and URL
		WebDriver driver = BrowserFactory.startBrowser("PhantomJS", "https://en.wikipedia.org/wiki/Main_Page");
		
		// Created Page Object using Page Factory
		PageFactoryLogin login_page = PageFactory.initElements(driver, PageFactoryLogin.class);
		
		// Write your username and password in below line

		
		
	
		System.out.println("Page Title : " + driver.getTitle());
		driver.quit();
		System.out.println("Browser Quit is successful");
	}
	
	
}

