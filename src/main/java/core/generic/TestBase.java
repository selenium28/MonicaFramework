package core.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	// Local Variables
	public static WebDriver driver;
	protected static WebDriverWait webDriverWait;


	public void setUp() throws FileNotFoundException, IOException{

//		// Load configuration file
//		Properties objConfig = new Properties();
//		objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/core/config/config.properties"));
//
//		if(objConfig.getProperty("test.browser").equalsIgnoreCase("chrome")){
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "E:\\Class\\Plugins\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver(capabilities);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(objConfig.getProperty("test.browser.url"));

//		}
		System.setProperty("webdriver.chrome.driver","Driver99/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void tearDown(){
		
		driver.quit();
	}
}
