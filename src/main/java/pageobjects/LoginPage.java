package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionclass.Actionclass;
import baseClass.BaseCLass;


public class LoginPage  extends BaseCLass{
	
	public LoginPage()  //constructor for initialising 
	{
		PageFactory.initElements(selfHealingDriver, this);
	}
	
	@FindBy(id="user-name")
	WebElement  username;
	@FindBy(id="password")
	WebElement  password;
	@FindBy(id="login-button")
	WebElement  LoginButton;
	
	@FindBy(id="change_id")
	WebElement  change_id;
	
	
	
	public void Login(String Username ,String Password) throws Throwable {
		
		Actionclass.type(username, Username);
		Actionclass.type(password, Password);
		Actionclass.click(LoginButton);
	}
	public void HealeniumTestFields() {
		
		
		
		
		
	}
}
