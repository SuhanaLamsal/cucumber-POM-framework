package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage  {
	
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]") WebElement logOut;
	 
     public HomePage(WebDriver driver) {
    	 super(driver);
     }
     
    	 public String getTitleOfTheHomePage() {
    		 String title= getTitleOfTheHomePage();
    		 System.out.println("title of the page" + title);
    		 return title;
    	 
    	
     }

		public String getTextFromHomePage() {
			// TODO Auto-generated method stub
			return null;
		}
      
          }
     
     

      
