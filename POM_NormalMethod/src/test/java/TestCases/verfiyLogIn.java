package TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class verfiyLogIn {

	@Test
	public void VerifyLogin() throws InterruptedException{
		
	//	System.setProperty("webdriver.gecko.driver", "/home/vsjanani/Desktop/Selenium_Workspace/Drivers/geckodriver" );
	//	WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new HtmlUnitDriver(true);
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Thread.sleep(8000);
		
		
		LoginPage login=new LoginPage(driver);
		login.clickLoginTab();
		login.typeUserName();
		login.typePassword();
		login.clickLoginButton();
		System.out.println("Login is successful");
		
		
		driver.quit();
		System.out.println("Browser Quit is successful");
	}
}
