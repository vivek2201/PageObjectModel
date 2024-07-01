package Hooks;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class AppHooks {
	DriverFactory driverfactory;
	public WebDriver driver;
	@Before(order=0)
	public void preCondition() throws IOException
	{
		driver= driverfactory.init_driver();
		driver.get("Amazon.com.au");
	}
	@After(order=0)
	public void teardown()
	{
		driver.quit();
	}
	/*
	 * @After(order=1) public void screenshots(Scenario scenario) {
	 * if(scenario.isFailed()) { //takesscreenshot //String screenahotname=
	 * scenario.getName().replaceAll("", "-"); //TakesScreenshot takesscreenshot =
	 * (TakesScreenshot)driver; //byte[] sorcepath=
	 * takesscreenshot.getScreenshotAs(OutputType.BYTES);
	 * //scenario.attach(sorcepath, "image/png",screenahotname);
	 * 
	 * } }
	 */

}
