package com.AppTestifyDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivers =new ChromeDriver();
     
        drivers.get("http://demo.guru99.com/test/autoit.html");				
	    	
	    drivers.findElement(By.id("postjob")).click();			

	    drivers.findElement(By.id("input_3")).sendKeys("Gaurav");                                 					
	    drivers.findElement(By.id("id_4")).sendKeys("test.test@gmail.com");					
	    drivers.findElement(By.id("input_4")).click();	
	    
	   /* before this download autoit and drag the loaction which file we want to submit.using autoit script editor
	    the same the file and create a exe file 
	    
	    below comand should be updtaed in editior
	    ControlFocus
	    ControlSetText
	    ControlClick
	    */
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("E:\\AutoIT\\fileupload.exe");		
	    drivers.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    drivers.findElement(By.id("input_2")).click();
	    drivers.close();
	     

	}

}
