package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementUtil {
	public WebDriver driver;
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void doClick(By locator)
	{
	driver.findElement(locator).click();
	}

}
