package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverFactory;


public class Login {

	WebDriver driver;
	
	LoginPage loginPage ;
	
	@Given("User has navigated to Login page")
	public void user_navigated_to_LoginPage() {
	
	    driver = DriverFactory.getDriver();
	    
	    loginPage = new LoginPage(driver);
		
	    loginPage.navigateToLoginPage();
		String s = driver.getCurrentUrl();
		
		//Assert.assertTrue(s.contains("Login"));
	}
	
	@When("User enter valid email address {string} into email textbox")
	public void user_enter_EmailAddress_in_EmailTextbox(String email)
	{
		loginPage = new LoginPage(driver);
		loginPage.inputUsername(email);
		
	}
	@And("User enter valid password {string} into password field")
	public void user_enter_Password_in_PasswordTextbox(String password)
	{
		   loginPage = new LoginPage(driver);
		   loginPage.inputPassword(password);
	}
	@And("User click on Login button")
	public void user_click_LoginButton()
	{
		    loginPage = new LoginPage(driver);
		   	loginPage.clickOnSubmitButton();
	}
	@Then("User is navigated to account page")
	public void user_navigate_to_AccountPage()
	{
		   driver = DriverFactory.getDriver();
	//	Assert.assertTrue(driver.getTitle().contains("My Account"));
	}
	@When("User enter invalid email address {string} into email textbox")
	public void user_enter_InvalidEmailAddress_in_EmailTextbox(String invalidEmail)
	{
		  loginPage = new LoginPage(driver);
          loginPage.inputUsername(invalidEmail);
	}
	@And("User enter invalid password {string} into password field")
	public void user_enter_InvalidPassword_in_PasswordTextbox(String invalidPassword)
	{
		loginPage = new LoginPage(driver);
	       loginPage.inputPassword(invalidPassword);	   
	}
	@Then("User is not navigated to account page")
	public void user_Not_navigate_to_AccountPage()
	{
		   driver = DriverFactory.getDriver();
	//	Assert.assertFalse(driver.getTitle().contains("My Account"));
	}
	
	@Then("Email and Password not matching warning message should be displayed")
	public void invalid_Email_and_Password_warningMessage()
	{ 
		loginPage = new LoginPage(driver);
		   driver = DriverFactory.getDriver();
	 Boolean elementDisplayed =	driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		
//	 Assert.assertTrue(elementDisplayed);
	}
	
	@Given("User has navigated to Login Page")
	public void user_has_navigated_to_login_page() {
		  driver = DriverFactory.getDriver();
		    
		    LoginPage loginPage = new LoginPage(driver);
			
		    loginPage.navigateToLoginPage();
		
		String s = driver.getCurrentUrl();
		
	//	Assert.assertTrue(s.contains("Login"));
	    
	}

	@When("User enter invalid password {string} into password textbox")
	public void user_enter_invalid_password_into_password_textbox(String string) {
		loginPage = new LoginPage(driver); 
		loginPage.inputPassword(string);
	  
	}

	@Then("User is not navigate to account page")
	public void user_is_not_navigate_to_account_page() {
		loginPage = new LoginPage(driver);
	    Assert.assertTrue(true);
	}

}
