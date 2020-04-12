package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Pages.HomePage;

import base.WebBaseclass;
import jeera.JiraPolicy;
import testrailReport.TestRails;
import utility.Log;

public class LoginTest extends WebBaseclass {
	 
	HomePage homepage;
	

	
	@BeforeMethod
	
	public void setup() {
		
		homepage=new HomePage();
		Log.info("Home page intialization");
	}
	
	//@JiraPolicy(logTicketReady=true)
	//@TestRails(id="16")	

@Test
public void HomeTest() throws InterruptedException {
	 Log.info("My Account link element found");
		
	homepage.LumpsumCalculator();
	homepage.Calculate();
		
	}
	
	
	@AfterTest

	public void teardown() {
		drivers.quit();
	}
		

}
