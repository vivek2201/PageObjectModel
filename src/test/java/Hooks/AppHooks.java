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

	/*
	 * @Before(order=0) public void preCondition() throws IOException { this.driver=
	 * init_driver(); this.driver.get("amazon.com"); }
	 */
	@Before
	public void openBrowser()
	{
		driver=init_driver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	 @After(order=0) public void teardown() { driver.quit(); }
	 
	
	 @After(order=1) public void screenshots(Scenario scenario) {
	  if(scenario.isFailed()) { 
		 String screenahotname= scenario.getName().replaceAll("", "-");
		  TakesScreenshot takesscreenshot =
	  (TakesScreenshot)driver; 
		  byte[] sorcepath=
	 takesscreenshot.getScreenshotAs(OutputType.BYTES);
	 scenario.attach(sorcepath, "image/png",screenahotname);

	 
	  } }
	 

}
