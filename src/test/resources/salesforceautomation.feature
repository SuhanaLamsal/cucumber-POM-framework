Feature: login into salesforce automation functionality 

Background: User open salesforce application
  
 Scenario: login with clear password field
  
  Given user open salesforce application
  When user on "LoginPage"
  When user enters value into the box username as "suhana7@tekarch.com"
  When user clear password field as ""
  When click on Login button
  Then  alert is present with the text "Please enter your password."
  
  
  Scenario: login with valid username and valid password
  
   Given user open salesforce application
   When user on "LoginPage"
   When user enters value into the box username as "suhana7@tekarch.com"
   When user enter value  into the box password as "United@0304"
   When click on Login button
   Then User should be logged in to Salesforce
   
   
    Scenario: login with valid username and valid password
    
    Given user open salesforce application
    When user on "LoginPage"
    When user enters value into the box username as "suhana7@tekarch.com"
    When user enter value  into the box password as "United@0304"
    When user click on remember user name check box
    When click on Login button
    When user click on user menu drop down 
    And click logout 
    Then Loginpage is present as "<username"> should be displayed  
    
    
      Scenario: Forgot password
      
      Given user open salesforce application
      When user on "LoginPage"
      When user Click on Forgot password  
      Then Provide "<username>" in Salesforce Forgot Password page and click on Continue button
       
      
      Scenario:  Login with invalid username and invalid password
      
      Given user open salesforce application
      When user on "LoginPage"
      When user enters value into the box username as "123"
      When user enter value  into the box password as "22131"
      Then click on Login button
      
      
      Scenario: SalesForce login and check user menu dropdown
      
       Given user open salesforce application
       When user on "LoginPage"
       When user enters value into the box username as "suhana7@tekarch.com"
       When user enter value  into the box password as "United@0304"
       When click on Login button
       When user click on user menu drop down 
       Then the user menu dropdown should expand
     
      
  
    
    
    
    
    
    
    