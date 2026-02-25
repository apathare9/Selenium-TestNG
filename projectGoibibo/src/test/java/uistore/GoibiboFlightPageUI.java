package uistore;

import org.openqa.selenium.By;

/**
 * @throws InterruptedException
 * @author Ajinkya Pathare
 * @Date 6/7/2024
 * @Summary Navigating through Home Page to Search Flights Available form Mumbai to Delhi. 
 */ 

public class GoibiboFlightPageUI {

//	Hide  Pop-Up.
	public static By hidePopUp = By.xpath("(//span[@class='logSprite icClose'])");
	
//	Hide Offer Pop-Up.
	public static By hideOfferPopUp = By.xpath("(//p[@class='sc-jlwm9r-1 ewETUe'])");
	
//	Click on From Box.
	public static By clickOnFromBox = By.xpath("(//span[text()='From'])");
	
//	Enter Mumbai.
	public static By enterMumbai = By.xpath("(//input[@type='text'])");
	
//	Enter Delhi.
	public static By enterDelhi = By.xpath("(//input[@type='text'])");

//	Click On Departure.
	public static By clickOnDeparture = By.xpath("(//span[text()='Departure'])");
	
//	Click on 15th june.
	public static By clickOn15 = By.xpath("(//p[text()='15'])[1]");
	
//	Click On Departure.
	public static By clickOnReturn = By.xpath("(//span[text()='Return'])");
	
//	Click on 20th june.
	public static By clickOn20 = By.xpath("(//p[text()='20'])[1]");
	
//	Click on Travellers and Class.
	public static By clickOnTravellers = By.xpath("(//span[text()='Travellers & Class'])");
	
//	Increase Child Count.
	public static By increaseChildCount = By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[4]");
	
//	Click on Economy.
	public static By clickOnEconomy = By.xpath("(//li[text()='economy'])");
	
//	Click on Done.
	public static By clickOnDone = By.xpath("(//a[text()='Done'])");
	
//	Click on Search Flights.
	public static By clickOnSearchFlights = By.xpath("(//span[text()='SEARCH FLIGHTS'])");
	


	
}
