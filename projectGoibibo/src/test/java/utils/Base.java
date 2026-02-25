package utils;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	/**@author 10740073 Sanika Vaidya
	 * Date-07/06/2024
	 * @summary This method initializes the browser
	 */
	
	public void openBrowser() {
		Properties properties;
		properties= PropertyFileReader.loadProperties();
		
		String browserName = properties.getProperty("browser");
		switch(browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			LoggerHandler.info("Chrome browser is set up");
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			LoggerHandler.info("Edge browser is set up");
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			LoggerHandler.info("FireFox browser is set up");
			break;
		
		default:
			LoggerHandler.error("Browser not supported. Enter valid browser name");
			//System.out.println("Browser not supported. Enter valid browser name");
		}
		if(driver!=null) {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(properties.getProperty("url"));
		}
	}
}
