package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	
	public void setUp()
	{
	  WebDriver driver = new ChromeDriver();
	 
	}
	
	public void tearDown()
	{
		
	}
	
	@Given("User has navigated to Login page")
	public void user_navigated_to_LoginPage()
	{
		
	}
	
	@When("User enter valid email address \"amotooricap9@gmail.com\" into email textbox")
	public void user_enter_EmailAddress_in_EmailTextbox(String email)
	{
		
	}
	@And("User enter valid password \"12345\" into password field")
	public void user_enter_Password_in_PasswordTextbox(String password)
	{
		
	}
	@And("User click on Login button ")
	public void user_click_LoginButton()
	{
		
	}
	@Then("User is navigated to account page ")
	public void user_navigate_to_AccountPage()
	{
		
	}
	@When("User enter valid email address \"test@test.com\" into email textbox")
	public void user_enter_InvalidEmailAddress_in_EmailTextbox(String email)
	{
		
	}
	@And("User enter valid password \"6789\" into password field")
	public void user_enter_InvalidPassword_in_PasswordTextbox(String password)
	{
		
	}
	@Then("User is not navigated to account page ")
	public void user_Not_navigate_to_AccountPage()
	{
		
	}
	
	@Then("Email and Password not matching warning message should be displayed")
	public void invalid_Email_and_Password_warningMessage()
	{
		
	}
}
