package logintest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseCLass;
import pageobjects.HealeniumTestFieldsPage;
import pageobjects.LoginPage;

public class Loginweb extends BaseCLass{
	
	
	
	@BeforeClass
	public void launchwebapp() {
		launchapp();
	}
	/*
	@Test(priority =0)
	public void TestLogin() throws Throwable {
		
		LoginPage login=new LoginPage();
	//	login.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority =1,enabled =true)
	public void testfields() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		htfp.testFieldsPage();
	}
	
	@Test(priority =2,enabled =true)
	public void changeid() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		htfp.ChangeLocaterButton();
		htfp.changeid();
		
	}
	
	@Test(priority =3,enabled =true)
	public void classname() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		Thread.sleep(6000);
		//driver.navigate().refresh();
		htfp.classname();
	}
	
	@Test(priority =4)
	public void tagname() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		//driver.navigate().refresh();
		htfp.tagname();
	}
	@Test(priority =5,enabled=false)
	public void Linktext() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		//driver.navigate().refresh();
		htfp.Linktext();
	}
	
	@Test(priority =6)
	public void inputenabledordisabled() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		//driver.navigate().refresh();
		htfp.inputenabledordisabled();
	}
	*/
	@Test(priority =7)
	public void Alert() throws Throwable {
		HealeniumTestFieldsPage htfp=new HealeniumTestFieldsPage();
		//driver.navigate().refresh();
		htfp.Alert();
	}
	
	@AfterClass
	public void teardown() {
	//	driver.quit();
	}
	
}
