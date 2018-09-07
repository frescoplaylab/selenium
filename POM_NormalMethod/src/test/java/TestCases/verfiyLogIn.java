package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import Pages.LoginPage;

public class verfiyLogIn {

	@Test
	public void verifyLogin() throws InterruptedException{
		
		WebDriver driver = new HtmlUnitDriver(true);
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(8000);
		
		// Write your code here
		
		
		
		
		
		
		System.out.println("Login is successful");
		driver.quit();
		System.out.println("Browser Quit is successful");
	}
}
