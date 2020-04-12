package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import base.MobileBaseClass;


public class MHomeWebPage extends MobileBaseClass {
	@FindBy(id="closepopup")
	WebElement closeannounce;
	
	@FindBy(id="search-input")
	WebElement searchProduct;
	
	@FindBy(id="search-input")
	WebElement Enter;
	
	//@FindBy(className="//div[@class='a-section a-spacing-medium']/div/div/div/a[contains(@href, '/Apple-iPhone-Pro-Max-256GB/dp/B07XVMDRZW/ref=mp_s_a_1_1?keywords=Apple+iPhone+11+Pro+Max+%28256GB%29+-+Midnight+Green&qid=1579278614&sr=8-1')]/div/h2/span[@class='a-size-base a-color-base a-text-normal']")
   // WebElement clickelement;
	
	//@FindBy(xpath="//android.view.View[7]/android.view.View[1]/android.view.View[1]/android.view.View[2]")
	//WebElement imageclick;
	//@FindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ViewAnimator[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	//WebElement productselction;
	//@FindBy(id="CLOSE")
	//WebElement clickEnter;
	
	//sendKeys("Apple iPhone 11 Pro Max (256GB) - Midnight Green");
    
   // driver.findElement(By.id("nav-search-keywords")).sendKeys(Keys.ENTER);
   
  //click();
   //click();
    
   // driver.findElement(By.id("add-to-cart-button")).sendKeys(Keys.ENTER);
   //

	
	
	
	
	
	

	public MHomeWebPage() {
		PageFactory.initElements(drivers, this);
		String Url=prop.getProperty("Url");
		drivers.get(Url);
	}

	public void ProductSearch() {
		closeannounce.click();
		//String Product=prop.getProperty("ProductName");
		
	
		searchProduct.click();
		String Product=prop.getProperty("Searchbox");
		Enter.sendKeys(Product);
		//imageclick.click();
	}
	
	//public void ProductSelection() {
		
		//productselction.click();		
	//clickEnter.click();
	//}
	//public void AddtoCart() {
		
	
	//public void ProceedtoCheckout() {
	//}
	//}
	
//}
}