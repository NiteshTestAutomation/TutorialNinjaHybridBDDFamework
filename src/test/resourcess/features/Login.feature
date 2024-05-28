
Feature: Login Feature
  
  Scenario: Login with valid credentials
    Given User has navigated to Login page
    When User enter valid email address "niteshbadge@yopmail.com" into email textbox
    And User enter valid password "123456" into password field
    And User click on Login button 
    Then User is navigated to account page 

   
  Scenario: Login with invalid credentails 
     Given User has navigated to Login Page
     When User enter invalid email address "test@test.com" into email textbox 
     And User enter invalid password "7890" into password textbox
     And User click on Login button 
     Then User is not navigate to account page 
     And Email and Password not matching warning message should be displayed 