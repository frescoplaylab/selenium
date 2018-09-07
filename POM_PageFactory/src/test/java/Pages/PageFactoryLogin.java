package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactoryLogin {

	WebDriver driver;
	
	public PageFactoryLogin(WebDriver localdriver){
	this.driver=localdriver;
	}
	
	// Write your script along element locators here.
	
	
	
	
	public void Login(String uid, String pass){	
		loginTab.click();
		username.sendKeys(uid);
		password.sendKeys(pass);
		logIn.click();
	}	
}
