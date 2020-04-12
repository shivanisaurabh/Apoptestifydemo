package com.AppTestifyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivers =new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/upload/";
        drivers.get(baseUrl);
       WebElement FileUpload= drivers.findElement(By.id("uploadfile_0"));
       FileUpload.sendKeys("C:\\Users\\Shivani\\Desktop\\finalreport\\index.html");
       drivers.findElement(By.id("terms")).click();
       drivers.findElement(By.id("submitbutton")).click();
       drivers.quit();
       
        
	}

}
