package DriverFactory;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ReadProperties.ReadProp;

public class DriverFactory {
	public static WebDriver driver;
	String getbrowser;
	ReadProp readprop = new ReadProp();
	
	public WebDriver init_driver()
	{
		try {
			getbrowser = readprop.getBrowser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getbrowser.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
		}
		return driver;
		}
}
