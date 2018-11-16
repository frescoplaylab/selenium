package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Local variable which help to perform the action
	
	WebDriver driver;
	
	// In this class we will store all the locator and methods for LogIn page.
	
	
	
	
	
	
	// By.id("wpPassword1");
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginTab(){
		
		driver.findElement(LoginTab).click();
	}
	
	public void typeUserName(){
		
		driver.findElement(username).sendKeys("Prem55D");
	}
	
	public void typePassword(){
		
		driver.findElement(password).sendKeys("Prem@123");
	}
	
	public void clickLoginButton(){
	
		driver.findElement(logIn).click();
		
	}
	
}
