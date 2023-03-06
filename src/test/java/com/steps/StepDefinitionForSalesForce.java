package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.page.HomePage;
import com.page.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionForSalesForce {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	String url, browser;
	
	
	
	@Before(order=0)
	public void setUp1() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	
	@Before(order=1)
	public void setUp2() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Given("user open salesforce application")
	public void user_open_salesforce_application() {
	    driver.get("https://login.salesforce.com");
	}
	
   
	@When("user on {string}")
    public void user_on(String page) {
 
		if(page.equalsIgnoreCase("LoginPage"))
       	 login= new LoginPage(driver);
		else if (page.equalsIgnoreCase("homepage"))
			home= new HomePage(driver);
}
    @When("user enters value into the box username as {string}")
    public void user_enters_value_into_the_box_username_as(String data) {
         login.enterUsername(data);
     	System.out.println("user name entered");   
}
    @When("user clear password field as {string}")
    public void user_clear_password_field_as(String string) {
    	login.clear();  	
    
}
    @When("click on Login button")
    public void click_on_login_button() {
    	login.clickLogin(); 
}
    @Then("alert is present with the text {string}")
    public void alert_is_present_with_the_text(String data) throws InterruptedException  {
    	login.getErrorMessage();
    	
    	Thread.sleep(4000);
      	   
}

    @And("User is redirected to {string}")
    public void verifyRedirect(String expectedUrl) {
    	 driver.get("https://login.salesforce.com");
    	
    }
    @When("user enter value  into the box password as {string}")
    public void user_enter_value_into_the_box_password_as(String data) {
        login.enterPassword(data);
        System.out.println("password entered");
    }

    @Then("User should be logged in to Salesforce")
    public void user_should_be_logged_in_to_salesforce() throws InterruptedException {
     
    	Thread.sleep(4000);
    }
  
   
    @When("user click on remember user name check box")
    public void user_click_on_remember_user_name_check_box() {
    	login.clickrememberMe(url);
    
}
     @When("user click on user menu drop down")
      public void user_click_on_user_menu_drop_down() {
    	 login.clickUserMenu(browser);
    
}
     @When("click logout")
     public void click_logout() {
        
     }
    	   	
     @Then("Loginpage is present as {string}> should be displayed")
      public void loginpage_is_present_as_should_be_displayed(String data) {
    	
   }
     @When("user Click on Forgot password")
     public void user_click_on_forgot_password() {
    	 login.forgotpassword();
         
     }

     @When("Provide {string} in Salesforce Forgot Password page and click on Continue button")
     public void provide_in_salesforce_forgot_password_page_and_click_on_continue_button(String string) {
       login.clickContinueButton();
     }
     
     @Then("the user menu dropdown should expand")
     public void the_user_menu_dropdown_should_expand() {
         
     }

} 

    
	
	



