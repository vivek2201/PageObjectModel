package DriverFactory;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ReadProperties.ReadProp;

public class DriverFactory {
	public WebDriver driver;
	static String getbrowser;
	
	public WebDriver init_driver()
	{
		try {
			getbrowser = ReadProp.getBrowser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(getbrowser.equals("chrome"))
		{
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
		return driver;
		}
}
