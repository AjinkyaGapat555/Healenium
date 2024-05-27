package logintest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.epam.healenium.SelfHealingDriver;

public class Logintest {

	SelfHealingDriver driver;

	@BeforeClass
    public void setUp() {
		WebDriver delegate = new ChromeDriver();
		driver = SelfHealingDriver.create(delegate);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

    }
	@Test
	public  void testExample () {
		
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("secret_sauce");

		// Find the login button and click it
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		//Add to cart 
		WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		addtocart.click();
		
}
	@AfterClass
    public void tearDown() throws InterruptedException {
        if (driver != null) {
        	Thread.sleep(5000);
            driver.quit();
        }
        
	}
}
