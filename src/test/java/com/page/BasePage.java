package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
   

	 protected static WebDriver driver;
	 
	 
	 public BasePage(WebDriver driver) {
		this.driver = driver;
    	 PageFactory.initElements(driver, this);
	
	 }
	
        public void navigateToUrl(String url) {
    	       driver.get(url);
		   	       
    	  } 
    	  public void waitForElement (int time, WebElement element ) {
    		  WebDriverWait wait = new WebDriverWait(driver, time);
    		  wait.until(ExpectedConditions.visibilityOf(element));
    	  }
}

