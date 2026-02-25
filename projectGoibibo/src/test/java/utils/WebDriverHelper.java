package utils;
 
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
 
import io.qameta.allure.Allure;
 
 
 
public class WebDriverHelper {
 
	WebDriver driver;
	ExtentTest test;
	SoftAssert softAssert = new SoftAssert();
 
	public WebDriverHelper(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	/** @author Ajinkya Pathare
	 * Date-07/06/2024
	 * @summary This method clicks on a webelement
	 */
	@SuppressWarnings("deprecation")
	public void clickOnElement(By locator, String logMessage) {
		try {
			WebElement webElement = driver.findElement(locator);
			webElement.click();
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
		}
 
	}
	
	/**@author 10740073 Sanika Vaidya
	 * Date-07/06/2024
	 * @summary This method sends testdata to input field weblement
	 */
	@SuppressWarnings("deprecation")
	public boolean sendKeys(By locator, String data, String logMessage) {
		try {
			WebElement webElement = driver.findElement(locator);
			webElement.sendKeys(data);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			return false;
		}
	}
 
 
	/**@author 10740073 Sanika Vaidya
	 * Date-07/06/2024
	 * @summary This method performs all keyboard actions on a webelement
	 */
	@SuppressWarnings("deprecation")
	public boolean enterAction(By locator, Keys action, String logMessage) {
		try {
			WebElement webElement = driver.findElement(locator);
			webElement.sendKeys(action);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			return false;
		}
	}
	/**
	 * @description: This method hovers over the specified web element.
	 * @param locator:    Web Element
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	@SuppressWarnings("deprecation")
	public boolean hoverOverElement(By locator, String logMessage) {
		try {
			WebElement element = driver.findElement(locator);
			Actions hover = new Actions(driver);
			hover.moveToElement(element).perform();
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage + "is failed");
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			return false;
		}
	}
 
	/**
	 * @description: This method switches to a new browser tab or window.
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	@SuppressWarnings("deprecation")
	public boolean tabSwitch(String logMessage) {
		try {
			String currentTab = driver.getWindowHandle();
			Set<String> tabs = driver.getWindowHandles();
			Iterator<String> itr = tabs.iterator();
			while (itr.hasNext()) {
				String newTabs = itr.next();
				if (!currentTab.equals(newTabs)) {
					driver.switchTo().window(newTabs);
				}
			}
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			return false;
		}
	}
	
	
	
	/**
	 * @author Ajinkya Pathare
	 */
	public void wait(int sec) {
		try {
			Thread.sleep(sec);
		} catch (Exception e) {
//			e.printStackTrace();
			LoggerHandler.error(e.getMessage());
		}
	}
	
	/**@author 10740073 Sanika Vaidya
	 * Date-08/06/2024
	 * @summary This method selects a value from a dropdown field
	 */
	@SuppressWarnings("deprecation")
	public boolean dropDown(By locater, String value, String logMessage) {
		try {
			WebElement element = driver.findElement(locater);
			Select dropMenu = new Select(element);
			dropMenu.selectByValue(value);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			LoggerHandler.error(logMessage + e.getMessage());
			return false;
		}
	}
	
	/**
	 * @description: This method retrieves the text from the specified web element.
	 * @param locator:    Web Element
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return the text content of the element
	 */
	@SuppressWarnings("deprecation")
	public String getText(By locator, String logMessage) {
		String text = "";
		try {
			WebElement element = driver.findElement(locator);
			text = element.getText();
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
 
		} catch (Exception e) {
			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			LoggerHandler.error(logMessage + e.getMessage());
 
		}
		return text;
	}
 
	/**
	 * @description: This method scrolls the specified web element into view.
	 * @param locator:    Web Element
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	@SuppressWarnings("deprecation")
	public boolean scrollOverElement(By locator, String logMessage) {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor JSE = ((JavascriptExecutor) driver);
			JSE.executeScript("arguments[0].scrollIntoView(true)", element);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			
			LoggerHandler.error(logMessage + e.getMessage());
			return false;
		}
	}
 
	/**
	 * @description: This method hovers over the specified web element and clicks
	 *               it.
	 * @param locator: Web Element
	 */
	public void hoverOverElement(By locator) {
		try {
			WebElement webElement = driver.findElement(locator);
			Actions actions = new Actions(driver);
			actions.moveToElement(webElement).click().perform();
		} catch (Exception e) {
			LoggerHandler.error(e.getMessage());
		}
	}
 
	/**
	 * @description: This method waits for the specified web element to become
	 *               visible.
	 * @param locator:          Web Element
	 * @param timeoutInSeconds: Maximum time to wait for the element to be visible
	 */
	public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			LoggerHandler.error(e.getMessage());
		}
	}
 
	/**
	 * @description: This method scrolls to the specified web element and clicks it.
	 * @param locator:    Web Element
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	@SuppressWarnings({ "deprecation", "deprecation", "deprecation", "deprecation", "deprecation" })
	public boolean scrollToClick(By locator, String logMessage) {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor JSE = ((JavascriptExecutor) driver);
			JSE.executeScript("arguments[0].click()", element);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			LoggerHandler.error(logMessage + e.getMessage());
			return false;
		}
	}
 
	/**
	 * @description: This method scrolls the specified web element into view using
	 *               JavaScript.
	 * @param locator: Web Element
	 */
	public void jsScroll(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
 
	/**
	 * @description: This method scrolls down the page by the specified number of
	 *               pixels using JavaScript.
	 * @param locator: Web Element
	 * @param pixel:   Number of pixels to scroll down
	 */
	public void jsScrollDown(By locator, int pixel) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + pixel + ")");
	}
 
	/**
	 * @description: This method scrolls the page to the specified position (in
	 *               pixels) from the top using JavaScript.
	 * @param locator: Web Element
	 * @param picel:  Number of pixels from the top to scroll
	 */
	public void jsScrollTop(By locator, int picel) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, " + picel + ")");
	}
 
	/**
	 * @description: This method clicks the specified web element using JavaScript.
	 * @param locator: Web Element
	 */
	public void jsClick(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			// Handle or rethrow the exception here
//			e.printStackTrace();
			LoggerHandler.error(e.getMessage());
		}
	}
 
	/**
	 * @description: This method selects an option from a dropdown menu by its
	 *               index.
	 * @param locator:    Web Element
	 * @param index:      Index of the option to select
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	public boolean dropDown(By locator, int index, String logMessage) {
		try {
			WebElement element = driver.findElement(locator);
			Select dropMenu = new Select(element);
			dropMenu.selectByIndex(index);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());	
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
			return false;
		}
	}
 
	/**
	 * @description: This method clears the text from the specified input box.
	 * @param locator:    Web Element
	 * @param logMessage: Log message to be displayed in the logs file
	 * @return true if successful, false otherwise
	 */
	public boolean clearText(By locator, String logMessage) {
		try {
			WebElement element = driver.findElement(locator);
			element.clear();
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			
			return false;
		}
	}
 
	
 
	/**
	 * @description: This method simulates pressing the "Escape" key.
	 */
	public void enterEsc() {
	    try {
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.ESCAPE).perform();
	    } catch (Exception e) {
	    	LoggerHandler.error( e.getMessage());
	    }
	}
	/**@author 10740073 Sanika Vaidya
	 * Date-08/06/2024
	 * @summary This method scrolls a window to a specific webelement
	 */
	public boolean jsScroll(By locator, String logMessage) {
		try {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		LoggerHandler.info(logMessage);
		Allure.addDescription(logMessage);			

		writeExtentTest(Status.PASS, logMessage);
		return true;
		}catch(Exception e) {
//			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			
			LoggerHandler.error(logMessage + e.getMessage());
			return false;
		}
	}
	/**@author 10740073 Sanika Vaidya
	 * Date-08/06/2024
	 * @summary This method scrolls a window to a specific location
	 */
	public boolean jsScrollDown(By locator, int picel, String logMessage) {
		try {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + picel + ")");
		LoggerHandler.info(logMessage);
		writeExtentTest(Status.PASS, logMessage);
		Allure.addDescription(logMessage);			

		return true;
		}catch(Exception e) {
			Allure.addDescription(logMessage + "is failed");			
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			
			LoggerHandler.error(logMessage + e.getMessage());
			return false;
		}
	}
	/**@author 10740073 Sanika Vaidya
	 * Date-08/06/2024
	 * @summary This method verifies the window url
	 */
	public boolean verifyURL(String actualText, String logMessage) {
 
		String resTxt = driver.getCurrentUrl();
		try {
			softAssert.assertEquals(actualText, resTxt);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);			

			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			

			return false;
		}
	}
	/**@author Prajwal Sinha
	 * Date-10/06/2024
	 * @summary This method selects and deletes Strings 
	 */
	
	public boolean deleteText(By locator, String logMessage) {
		try {
			WebElement webElement = driver.findElement(locator);
			webElement.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);			

			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage);
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");			
			return false;
		}
	}
	/**@author 10740073 Sanika Vaidya
	 * Date-08/06/2024
	 * @summary This method verifies a text of a webelement
	 */
	public boolean verifyText(By locator, String actualText, String logMessage) {
 
		String resTxt = driver.findElement(locator).getText();
		try {
			softAssert.assertEquals(actualText, resTxt);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			return true;
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			e.printStackTrace();
			return false;
		}
	}
 
	/**
	 * @author 10739987 - Kesava Krishnan
	 * @Date: 08/06/2024
	 * @Summary: This method is used to return the size of a list of elements
	 * @param locator
	 * @param logMessage
	 * @return
	 */
	@SuppressWarnings({ "deprecation", "deprecation" })
	public int getNumberOfWebElements(By locator,String logMessage) {
		try {
			List<WebElement> listOfElements = driver.findElements(locator);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
			return listOfElements.size();
		}
		catch(Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			writeExtentTest(Status.FAIL, logMessage, e);
			Allure.addDescription(logMessage + "is failed");
		}
		return 0;
		
	}
	
	
	/**
	 * @author 10739987 - Kesava Krishnan
	 * @Date: 08/06/2024
	 * @Summary: This method is used to verify the title of a particular page
	 * @param actualText
	 * @param logMessage
	 */
	@SuppressWarnings("deprecation")
	public void verifyTitle(String actualText,String logMessage) {
		String resText = driver.getTitle();
		try {
			resText.contains(actualText);
			LoggerHandler.info(logMessage);
			writeExtentTest(Status.PASS, logMessage);
			Allure.addDescription(logMessage);
		} catch (Exception e) {
			LoggerHandler.error(logMessage + e.getMessage());
			Allure.addDescription(logMessage + "is failed");
			writeExtentTest(Status.FAIL, logMessage, e);
		}
	}
 
	/**
	 * @author Ajinkya Pathare & Sanika Vaidya
	 * @description: This method logs the specified message with the given status in the test report.
	 * @param status: Status level (e.g., Status.PASS, Status.FAIL)
	 * @param logMessage: Log message to be displayed in the test report
	 */
	public void writeExtentTest(Status status, String logMessage) {
		test.log(status, logMessage);
	}
	
	/**
	 * @author Ajinkya Pathare & Sanika Vaidya
	 * @param status
	 * @param logMessage
	 * @param e
	 */
	@SuppressWarnings("deprecation")
	public void writeExtentTest(Status status, String logMessage, Exception e) {
		String screenshot = Screenshot.takeScreenshot(driver, logMessage);
		test.log(status, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
		Allure.addDescription(logMessage);
		}
	
	@SuppressWarnings("deprecation")
	public void writeToReportScreenshot(Status status, String logMessage) {
		String screenshot = Screenshot.takeScreenshot(driver, logMessage);
		test.log(status, MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());
		Allure.addDescription(logMessage + "is failed");
		}
 
 
}