package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import testrailReport.APIClient;
import testrailReport.APIException;
import testrailReport.TestRails;

public class MobileBaseClass {
	
	
	//String PROJECT_ID = "4";
	//APIClient client = null;
	public static AppiumDriver<MobileElement> drivers;
	public   static Properties prop;
	
public MobileBaseClass() {
	

		
		try {
			String FilePath="D:\\AppTestifyDemo\\src\\main\\java\\com.data\\config.properties";
					 prop=new Properties();
					 FileInputStream file=new FileInputStream(FilePath);

			prop.load(file);
			String url=prop.getProperty(FilePath);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
}
}
/*@BeforeTest


public void createSuite(ITestContext ctx) throws IOException, APIException {
	client = new APIClient("https://apptestify.testrail.io");
	client.setUser("r.kumar@apptestify.com");
	client.setPassword("YNoYINdOLkrn1J1CKUj8");
	Map data = new HashMap();
	data.put("include_all",true);
	data.put("name","Test Run "+System.currentTimeMillis());
	JSONObject c = null;
	c = (JSONObject)client.sendPost("add_run/"+PROJECT_ID,data);
	Long suite_id = (Long)c.get("id");
	ctx.setAttribute("suiteId",suite_id);
}*/

/*@BeforeMethod
public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
	Method m = method;

	if (m.isAnnotationPresent(TestRails.class)) {
		TestRails ta = m.getAnnotation(TestRails.class);
		System.out.println(ta.id());
		ctx.setAttribute("caseId",ta.id());
	}
}*/


/*@BeforeTest (alwaysRun=true)
public void Appsetup() {
	
	try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	              String Platform=prop.getProperty("AppMobile_Platform");
					String Version=prop.getProperty("AppMobile_Version");
					String DeviceName=prop.getProperty("AppMobile_Name");	
					String DeviceID=prop.getProperty("AppMobile_UDID");
					String Package=prop.getProperty("AppPackage");
					String Activity=prop.getProperty("AppActivity");
					String MobileBrowser=prop.getProperty("Browse");
				
					caps.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform);
					caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,Version);
					caps.setCapability(MobileCapabilityType.DEVICE_NAME,DeviceName);
					caps.setCapability(MobileCapabilityType.UDID,DeviceID);
					caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
					
					caps.setCapability("appPackage", Package);
					caps.setCapability("appActivity", Activity);
					
					 URL url = new URL("http://127.0.0.1:4723/wd/hub");
					 drivers = new AppiumDriver<MobileElement>(url, caps); 
	 
}
	
	catch(Exception exp) {
	System.out.println("cause is : "+exp.getCause());
	System.out.println("Message is : "+exp.getMessage());
	exp.printStackTrace();
	
	}
}*/
@BeforeTest (alwaysRun=true)
public void Websetup() {
	
	try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	              String Platform=prop.getProperty("WebMobile_Platform");
					String Version=prop.getProperty("WebMobile_Version");
					String DeviceName=prop.getProperty("WebMobile_Name");	
					String DeviceID=prop.getProperty("WebMobile_UDID");
					String MobileBrowser=prop.getProperty("Browse");
				
					caps.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform);
					caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,Version);
					caps.setCapability(MobileCapabilityType.DEVICE_NAME,DeviceName);
					caps.setCapability(MobileCapabilityType.UDID,DeviceID);
					caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
					caps.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowser);
					
					 URL url = new URL("http://127.0.0.1:4723/wd/hub");
					 drivers = new AppiumDriver<MobileElement>(url, caps); 
					// drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
	
	catch(Exception exp) {
	System.out.println("cause is : "+exp.getCause());
	System.out.println("Message is : "+exp.getMessage());
	exp.printStackTrace();
	
                      }
}

			
/*				
@BeforeTest(dependsOnMethods="intialization")
public  void urllaunch() {
	// TODO Auto-generated method stub
	drivers.manage().window().maximize();
	drivers.manage().deleteAllCookies();
				String Url=prop.getProperty("Url");
				drivers.get(Url);
				drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}*/



/*@AfterMethod
public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
	Map data = new HashMap();
	if(result.isSuccess()) {
		data.put("status_id",1);
	}
	else {
		data.put("status_id", 5);
		data.put("comment", result.getThrowable().toString());
	}

	String caseId = (String)ctx.getAttribute("caseId");
	Long suiteId = (Long)ctx.getAttribute("suiteId");
	client.sendPost("add_result_for_case/"+suiteId+"/"+caseId,data);

}*/
	

}
