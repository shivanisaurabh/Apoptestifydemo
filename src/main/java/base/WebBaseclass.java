package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testrailReport.APIClient;
import testrailReport.APIException;
import testrailReport.TestRails;





public class WebBaseclass {
	//String PROJECT_ID = "4";
	//APIClient client = null;
	public static WebDriver drivers=null;
	public static Properties prop;
	
public WebBaseclass() {
	

		
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
}
*/

@BeforeTest
@Parameters("browser")
		
		public static void intialization(String browser) throws Exception 
		{
		
			if (browser.equals("Chrome")) 
			{

				  System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  drivers =new ChromeDriver();
		    }
				
			else if (browser.equalsIgnoreCase("firefox"))
					
			{
						//create firefox instance
				  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shivani\\Downloads\\geckodriver.exe");
				
				  FirefoxOptions firefoxOptions = new FirefoxOptions();
				    firefoxOptions.setCapability("marionette", true);
				   drivers = new FirefoxDriver(firefoxOptions);
			}
				
			else if(browser.equalsIgnoreCase("IE"))
				
			{
					//set path to Edge.exe
				System.setProperty("webdriver.ie.driver","C:\\Users\\Shivani\\Downloads\\IEDriverServer.exe");
					//create Edge instance
				drivers = new EdgeDriver();  ;
				}
		    else
		    {
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		   }
				
		}	
				
@BeforeTest
public  void urllaunch() {
	// TODO Auto-generated method stub
	drivers.manage().window().maximize();
	drivers.manage().deleteAllCookies();
				String Url=prop.getProperty("Url");
				drivers.get(Url);
				drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


/*
@AfterMethod
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

}
	*/
	
	}


