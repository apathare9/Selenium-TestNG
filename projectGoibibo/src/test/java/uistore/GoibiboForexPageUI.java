package uistore;

import org.openqa.selenium.By;

public class GoibiboForexPageUI {

	public static By WhatIsAMultiCurrencyCardOption = By.xpath("//h5[text()='What is a Multicurrency Card?']/parent::li");  // 
			
	public static By clickHereOfWhatIsAMultiCurrency = By.xpath("//h5[text()='What is a Multicurrency Card?']/following-sibling::div//a[contains(text(), 'Click here')]");
			
	public static By moreLinks = By.xpath("//p[text()='more links']");
	
	public static By hotelsNearMe = By.xpath("//p[text()='Hotels Near Me']/parent::a");
	
	public static By listYourHotelForFree = By.xpath("//a[text()='+ List Your Hotel for free!']");
	
	public static By getStartedTodayForFree = By.xpath("//button[text()='get started today for free!']");

}
