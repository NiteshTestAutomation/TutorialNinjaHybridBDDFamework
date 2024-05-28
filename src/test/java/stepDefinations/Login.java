package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverFactory;


public class Login {

	WebDriver driver;
	
	@Given("User has navigated to Login page")
	public void user_navigated_to_LoginPage() {
	
	    driver = DriverFactory.getDriver();
	
		driver.findElement(By.xpath("//*[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		String s = driver.getCurrentUrl();
		
		Assert.assertTrue(s.contains("Login"));
	}
	
	@When("User enter valid email address {string} into email textbox")
	public void user_enter_EmailAddress_in_EmailTextbox(String email)
	{
		   driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
		
	}
	@And("User enter valid password {string} into password field")
	public void user_enter_Password_in_PasswordTextbox(String password)
	{
		   driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(password);
	}
	@And("User click on Login button")
	public void user_click_LoginButton()
	{
		   driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Then("User is navigated to account page")
	public void user_navigate_to_AccountPage()
	{
		   driver = DriverFactory.getDriver();
		Assert.assertTrue(driver.getTitle().contains("My Account"));
	}
	@When("User enter invalid email address {string} into email textbox")
	public void user_enter_InvalidEmailAddress_in_EmailTextbox(String email)
	{
		   driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys(email);
	}
	@And("User enter invalid password {string} into password field")
	public void user_enter_InvalidPassword_in_PasswordTextbox(String password)
	{
		   driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys(password);
	}
	@Then("User is not navigated to account page")
	public void user_Not_navigate_to_AccountPage()
	{
		   driver = DriverFactory.getDriver();
		Assert.assertFalse(driver.getTitle().contains("My Account"));
	}
	
	@Then("Email and Password not matching warning message should be displayed")
	public void invalid_Email_and_Password_warningMessage()
	{ 
	
		   driver = DriverFactory.getDriver();
	 Boolean elementDisplayed =	driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		
	 Assert.assertTrue(elementDisplayed);
	}
}
