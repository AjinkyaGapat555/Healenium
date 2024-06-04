package actionclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.epam.healenium.SelfHealingDriver;

import baseClass.BaseCLass;

public class Actionclass extends BaseCLass{
	
	 // Click action with exception handling and XPath printing on failure
    public static void click(WebElement locator) {
        try {
        	locator.click();
            System.out.println("Successfully clicked the element");
        } catch (Exception e) {
            System.out.println("Failed to click the element");
            System.out.println("XPath of the element: " + locator.toString());
        }
    }
    
    public static void doubleClick(SelfHealingDriver Idriver, WebElement locator) throws Throwable
	{
    	   try {
		Actions act = new Actions(Idriver);
		act.doubleClick(locator).build().perform();

	} catch (Exception e) {
        System.out.println("Failed to click the element");
        System.out.println("XPath of the element: " + locator.toString());
    }

}
    public static void movetoElement(SelfHealingDriver Idriver, WebElement locator) throws Throwable
	{

		Actions act = new Actions(Idriver);
		act.moveToElement(locator).build().perform();

	}
  
  	public static void type(WebElement ele, String text) throws Throwable
  	{
  	 
  	    try {
  	        ele.clear();
  	        ele.sendKeys(text);
  	    } catch(Exception e) {
  	        System.out.println("Location Not found");
  	    }
}
}