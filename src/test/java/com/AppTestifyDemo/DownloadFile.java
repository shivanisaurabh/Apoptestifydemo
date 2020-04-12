package com.AppTestifyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Install wget from cmd command line:cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate http://demo.guru99.com/selenium/msgr11us.exe
public class DownloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shivani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver drivers =new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/yahoo.html";
        drivers.get(baseUrl);
        WebElement downloadButton=drivers.findElement(By.id("messenger-download"));
        String sourceLocation=downloadButton.getAttribute("href");
        //Set-up the syntax for wget using the following command.
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
        //Initiate the download process by calling wget from our WebDriver code.

        try {
        Process exec = Runtime.getRuntime().exec(wget_command);
        int exitVal = exec.waitFor();
        System.out.println("Exit value: " + exitVal);
        } catch (Exception ex) {
        System.out.println(ex.toString());
        }
        drivers.close();
        
        
	}

}
