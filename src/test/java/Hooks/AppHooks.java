package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class AppHooks extends DriverFactory{
	WebDriver driver;
	@Before
	public void openBrowser()
	{
		driver=init_driver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	 @After
	 public void teardown() { driver.quit(); }
	 
	
	 @After
	 public void screenshots(Scenario scenario) {
	  if(scenario.isFailed()) { 
		 String screenahotname= scenario.getName().replaceAll("", "-");
		  TakesScreenshot takesscreenshot =
	  (TakesScreenshot)driver; 
		  byte[] sorcepath=
	 takesscreenshot.getScreenshotAs(OutputType.BYTES);
	 scenario.attach(sorcepath, "image/png",screenahotname);

	 
	  } }
	 

}
