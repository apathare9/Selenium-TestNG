package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @summary This method stores the locators of webelements of goibibo cabs
 *          search result page
 */
public class GoibiboCabsSearchResultPageUI {
	public static By dzireOrSimilarCarModelFilter = By.xpath("(//span[text()='Dzire or similar']/ancestor::li)[2]");
	public static By firstCarSelectButton = By.xpath("(//button[text()='SELECT']/parent::span)[2]");
	public static By payAndConfirmNowButton = By.id("paymentButton");
	public static By genderDropdown = By.xpath("//select[@id='gender']");

	public static By nameInputField = By.xpath("(//input[@class='textInput'])[2]");
	public static By mobileNumberInputField = By.xpath("(//input[@class='textInput'])[3]");
	public static By emailInputField = By.xpath("(//input[@class='textInput'])[4]");
	public static By signInsignUpField = By.xpath("//div[text()='SignIn/SignUp to speed up your booking process']");
	public static By loginSignUp = By.xpath("//h3[text()='Login/Signup']");

}
