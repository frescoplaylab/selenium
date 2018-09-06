package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Local variable which help to perform the action
	
	WebDriver driver;
	
	// In this class we will store all the locator and methods for LogIn page.
	
	By LoginTab=By.xpath("//*[@id='pt-login']/a");
	By username=By.xpath("//*[@id='wpName1']");
	By password=By.xpath("//*[@id='wpPassword1']");
	By logIn=By.xpath("//*[@id='wpLoginAttempt']");
	
	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginTab(){
		
		driver.findElement(LoginTab).click();
	}
	
	// Don't forget to mention your username in sendKeys
	public void typeUserName(){
		
		driver.findElement(username).sendKeys("Prem55D");
	}
	
	// Don't forget to mention your password in sendKeys
	public void typePassword(){
		
		driver.findElement(password).sendKeys("Prem@123");
	}
	
	public void clickLoginButton(){
	
		driver.findElement(logIn).click();
		
	}
	
}
