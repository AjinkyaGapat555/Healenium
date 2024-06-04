package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import actionclass.Actionclass;
import baseClass.BaseCLass;

public class HealeniumTestFieldsPage  extends BaseCLass{

	public HealeniumTestFieldsPage()  //constructor for initialising 
	{
		PageFactory.initElements(selfHealingDriver, this);
	}
	
	@FindBy(id="change_id")
	WebElement  input1;
	@FindBy(className ="test_class")
	WebElement  classname;
	
	@FindBy(tagName="test_tag")
	WebElement  Tagname;       //changes input
	
	@FindBy(id="change_enabled")
	WebElement  inputfield;
	
	@FindBy(id="change_checked")
	WebElement  checkbox;
	
	@FindBy(name="change_name")
	WebElement  changename;
	
	@FindBy(xpath="//*[@id=\"Submit\"]")
	WebElement  changelocaterbutton;
	
	@FindBy(linkText ="Change: LinkText, PartialLinkText")
	WebElement  Linktext;
	
	@FindBy(id ="submit_alert")
	WebElement  submit_alert;
	
	  
	public void testFieldsPage () throws Throwable {
		Actionclass.type(input1, "newabc");
		Actionclass.type(classname, "new123");
		Actionclass.type(Tagname, "newtagname");
		Actionclass.type(inputfield, "new test");
		Actionclass.click(checkbox);
		
	}
	public void ChangeLocaterButton () throws Throwable {
		Actionclass.click(changelocaterbutton);
	}
	public void changeid () throws Throwable {
		Thread.sleep(2000);
		Actionclass.type(input1, "newabc");	}
	public void classname() throws Throwable {
		
	//	Actionclass.click(changelocaterbutton);
		Actions actions = new Actions(selfHealingDriver);
		  
        actions.sendKeys(classname, "123class").perform();
	}
	public void tagname() throws Throwable {
	//	Actionclass.click(changelocaterbutton);
		  Actions actions = new Actions(selfHealingDriver);
	  
	        actions.sendKeys(Tagname, "message").perform();

		//Actionclass.type(Tagname, "tagname");
	}
	public void inputenabledordisabled() throws Throwable {
		//Actionclass.click(changelocaterbutton);
		Actionclass.type(inputfield, "inputfieldcheck");
	}
	public void checkbox() throws Throwable {
		//Actionclass.click(changelocaterbutton);
		Actionclass.click(checkbox);
	}
	public void Linktext() throws Throwable {
		//Actionclass.click(changelocaterbutton);
		Actionclass.click(Linktext);
	}
	public void Alert() throws Throwable {
		//Actionclass.click(changelocaterbutton);
		
		   WebDriverWait wait = new WebDriverWait(selfHealingDriver, Duration.ofSeconds(10));

	        WebElement generateAlertButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit_alert")));
	        generateAlertButton.click();

	        wait.until(ExpectedConditions.alertIsPresent());
	        String alertText=   selfHealingDriver.switchTo().alert().getText();
	        System.out.println("Alert text: " + alertText);
	        if ("this".equals(alertText)) {
	            System.out.println("The alert text matches the expected text.");
	            selfHealingDriver.switchTo().alert().accept();
	        } else {
	            System.out.println("The alert text does not match the expected text.");
	        }
	        selfHealingDriver.switchTo().alert().accept();
	
}
}