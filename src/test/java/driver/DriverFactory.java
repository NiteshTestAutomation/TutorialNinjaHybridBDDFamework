package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	static WebDriver driver = null;	
	
	public static WebDriver initializeDriver(String browserName)
    {
		
	    driver = DriverFactory.initializeDriver(browserName);
	    
	    if (browserName=="chrome")
	    {
	    	driver = new ChromeDriver();
	    }
	    else if (browserName=="firefox")
	    {
	    	driver = new FirefoxDriver();
	    }
	    return driver ;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
