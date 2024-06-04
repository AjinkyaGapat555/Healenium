	package baseClass;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	
	import com.epam.healenium.SelfHealingDriver;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class BaseCLass {
		
	    public static Properties prop;
	    public static SelfHealingDriver selfHealingDriver;
	
	@BeforeSuite
	public void beforesuit() {
	
	}
	
		@BeforeTest
		public void loadConfig()
		{
			try {
				prop =new Properties();
				System.out.println("Super Constructor Invoked");
				FileInputStream ip=new FileInputStream(
						System.getProperty("user.dir")+ "\\Configuration\\Config.properties");
				prop.load(ip);
						System.out.println("driver: "+selfHealingDriver);
	
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
		public  void launchapp()
		{
			//System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	
			String browserName= prop.getProperty("browser");
			WebDriver delegate;
			 switch (browserName) {
	         case "Firefox":
	             WebDriverManager.firefoxdriver().setup();
	             delegate = new FirefoxDriver();
	    
	             break;
	         case "chrome":
	             ChromeOptions chromeOptions = new ChromeOptions();
	             chromeOptions.addArguments("--remote-allow-origins=*");
	             delegate = new ChromeDriver(chromeOptions);
	             break;
	         case "EdgeDriver":
	             EdgeOptions edgeOptions = new EdgeOptions();
	             edgeOptions.addArguments("--remote-allow-origins=*");
	             delegate = new EdgeDriver(edgeOptions);
	             break;
	         default:
	             throw new IllegalArgumentException("Unknown browser: " + browserName);
	     }
		        selfHealingDriver = SelfHealingDriver.create(delegate);
		        selfHealingDriver.manage().window().maximize();
		        selfHealingDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        selfHealingDriver.get(prop.getProperty("url2"));
	 }
	
		}
