package uistore;

import org.openqa.selenium.By;

/**
 * @author Ajinkya Pathare
 * @Summary Locators for the Trains page
 */
public class GoibiboTrainsPageUI {

	public static By fromTrains = By.xpath("(//div[@class='styles_FswFld__UzC_6 styles_fswFld__u5UWc   '])[1]");
	public static By enterFromData = By.xpath("//input[@type='text']");
	public static By mainJunction = By.xpath("//span[text()='Coimbatore Main Junction']");

	public static By toTrains = By.xpath("(//div[@class='styles_FswFld__UzC_6 styles_fswFld__u5UWc   '])[2]");
	public static By enterToData = By.xpath("//input[@type='text']");
	public static By allStations = By.xpath("//span[text()='Chennai - All Stations']");

	public static By date = By.xpath("(//p[text()='20'])[1]");
	public static By searchTrains = By.xpath("//span[text()='SEARCH TRAINS']");

	public static By puneJunction = By.xpath("//span[text()='Pune Junction']");
	public static By mumbaiCst = By.xpath("//span[text()='Mumbai - All Stations']");
	public static By departureDate = By.xpath("(//p[text()='13'])[1]");

	public static By deccan = By.xpath("//span[text()='Hyderabad Deccan Nampally Railway Station']");
	public static By madgaonJunction = By.xpath("//span[text()='Madgaon Junction']");
	public static By selectDate = By.xpath("(//p[text()='15'])[1]");

	/**
	 * @author Aman Tiwari
	 */

//	Click on Trains.
	public static By clickOnTrains = By.xpath("(//span[text()='Trains'])");

//	Click on From Box.
	public static By clickOnTrainsFromBox = By
			.xpath("(//div[@class='styles_FswFld__UzC_6 styles_fswFld__u5UWc   '])[1]");
//	(//div[@class='styles_FswFld__UzC_6 styles_fswFld__u5UWc   '])[1]
//	(//p[text()='From'])

//	Enter Mumbai.
	public static By enterTrainForMumbai = By.xpath("(//input[@type='text'])");

//	Click on Mumbai All Stations.
	public static By clickOnMumbaiAllStations = By.xpath("(//span[text()='Mumbai - All Stations'])");

//	Click On To Box.
	public static By clickOnTrainsToBox = By
			.xpath("(//div[@class='styles_FswFieldItem__WiCpQ styles_FswFieldItemIsDestination__aflHN'])");

//	Enter Pune.
	public static By enterTrainForPune = By.xpath("(//input[@type='text'])");

//	Click on Pune All Stations.
	public static By clickOnPuneAllStations = By.xpath("(//span[text()='Pune - All Stations'])");

//	Click on Departure.
	public static By clickOnTrainDeparture = By.xpath("(//p[text()='Departure'])");

//	Click on 16th June.
	public static By clickOn16 = By.xpath("(//p[contains(text(),'16')])[1]");

//	Click on Search Trains.
	public static By clickOnSearchTrains = By.xpath("(//span[text()='SEARCH TRAINS'])");

}
