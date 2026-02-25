package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @Summary Locators for the Cabs Payment page
 */
public class GoibiboCabsPaymentPageUI {

	public static By travellerDetails = By.xpath("//h3[text()='Traveller details']");

	public static By fullName = By.xpath("//input[@placeholder='Enter Full Name']");
	public static By mobileNumber = By.xpath("//input[@placeholder='Enter Mobile Number']");
	public static By email = By.xpath("//input[@placeholder='Enter Email']");

	public static By confirmAndPay = By.xpath("//button[@id='paymentButton']");
	public static By screenshot = By.xpath("//h2[text()='Pay ']");

}
