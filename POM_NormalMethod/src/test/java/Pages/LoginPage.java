package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	// write your script here.
	
	
	
	
	
	
	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickLoginTab(){
		
		driver.findElement(LoginTab).click();
	}
	
	public void typeUserName(){
		
		driver.findElement(username).sendKeys("");
	}
	
	public void typePassword(){
		
		driver.findElement(password).sendKeys("");
	}
	
	public void clickLoginButton(){
	
		driver.findElement(logIn).click();
		
	}
	
}
