package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//Local variable which help to perform the action
	
	WebDriver driver;
	
	// In this class we will store all the locator and methods for LogIn page.
	// Write your script here with element locators.
	
	
	
	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginTab(){
		
		driver.findElement(LoginTab).click();
	}
	
	// Make sure to give your username in sendKeys
	
	public void typeUserName(){
		
		driver.findElement(username).sendKeys(" ");
	}
	
	// Make sure to give your password in sendKeys
	
	public void typePassword(){
		
		driver.findElement(password).sendKeys(" ");
	}
	
	public void clickLoginButton(){
	
		driver.findElement(logIn).click();
		
	}
	
}
