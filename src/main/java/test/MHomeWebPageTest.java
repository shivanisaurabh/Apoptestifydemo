package test;


import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.MHomeWebPage;

import base.MobileBaseClass;
import utility.Log;



/*import testrailapi.APIClient;
import testrailapi.APIException;
import util.JiraPolicy;
*/
public class MHomeWebPageTest  extends MobileBaseClass {

	MHomeWebPage mhomewebpage;
	//String PROJECT_ID = "4";
	//APIClient client = null;
	@BeforeMethod
public void setup() {
		
		mhomewebpage=new MHomeWebPage();
		Log.info("Home page intialization");
	}
	

	
	//@JiraPolicy(logTicketReady=true)
	//@TestRails(id="14")
	@Test
	public void MobileWebTest() {
		
		
		
		//mwebpage.ProductSelection();
		//mwebpage.AddtoCart();
		
		mhomewebpage.ProductSearch();
		
	}
	
	

    
	@AfterTest

	public void teardown() {
		drivers.quit();
	}

}
