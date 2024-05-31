package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class MyHooks {

	WebDriver driver;
	
	@Before
	public void setup()
	{
	 
	 // Properties prop = ConfigReader.loadPropertyfile();
	  DriverFactory.initializeDriver("chrome");
	  driver = DriverFactory.getDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("https://tutorialsninja.com/demo/");

	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}
}
