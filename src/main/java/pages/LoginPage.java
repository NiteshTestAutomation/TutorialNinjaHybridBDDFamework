package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@title='My Account']")
	private WebElement MyAccount_Btn;
	
	
	@FindBy(xpath="//*[text()='Login']")
	private WebElement Login_Btn;
	

	@FindBy(id="input-email")
	private WebElement UserName_InputTextBox;
	

	@FindBy(id="input-password")
	private WebElement Password_InputTextBox;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Submit_Btn;
	

	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement LoginSuccess_AlertMessage;
	
	
	public void navigateToLoginPage()
	{
		MyAccount_Btn.click();
		Login_Btn.click();
	}
	
	public void inputUsername(String username)
	{
		UserName_InputTextBox.sendKeys(username);
	}
	
	public void inputPassword(String password)
	{
		Password_InputTextBox.sendKeys(password);
	}
	public void clickSubmit()
	{
		Submit_Btn.click();
	}

	public void clickOnSubmitButton() {
		// TODO Auto-generated method stub
		Submit_Btn.click();
	}
	
	
}
