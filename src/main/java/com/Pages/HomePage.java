 package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.WebBaseclass;



	public class HomePage extends WebBaseclass {

		@FindBy(id="deskmenu_64")
		WebElement personalfinance;
		
		@FindBy(linkText="Lumpsum Investment Calculator")
		WebElement Text;
		
		@FindBy(id="justinvestLumpAmt")
		WebElement AmountEnter;
		@FindBy(id="Investtime")
		WebElement year;
		
		
		@FindBy(id="calculateJustInvest")
		WebElement submit;
		@FindBy(id="closepopup")
		WebElement sub;
		@FindBy(css="#Justrecommendation")
		WebElement proceed;
		

	public HomePage() {
		PageFactory.initElements(drivers, this);
		System.out.println("Driver Intialized");
	}


	public void LumpsumCalculator() throws InterruptedException {
		System.out.println("Enter into methoads");
		personalfinance.click();
		Text.click();
		String Product=prop.getProperty("Amount");
		AmountEnter.sendKeys(Product);
		String data=prop.getProperty("Time");
		year.sendKeys(data);
		Thread.sleep(5000);
		submit.sendKeys(Keys.ENTER);
		
	}
	
	

	public void Calculate() {
		sub.click();
		proceed.click();
	}
	}


