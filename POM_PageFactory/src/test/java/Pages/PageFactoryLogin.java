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
	
	@FindBy(xpath="//*[@id='pt-login']/a")WebElement loginTab;
	
	@FindBy(id="wpName1")WebElement username;
	
	@FindBy(how=How.ID,using="wpPassword1")WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id='wpLoginAttempt']")WebElement logIn;
	
	
	
	public void Login(String uid, String pass){
		
		loginTab.click();
		username.sendKeys(uid);
		password.sendKeys(pass);
		logIn.click();
	}
	
}
