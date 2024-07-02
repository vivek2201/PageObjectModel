package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.ElementUtil;

public class LoginPage extends ElementUtil {
	public WebDriver driver;
	
	By cucumberAddToCart = By.xpath("//h4[contains(text(),\"Cucumber - 1 Kg\")]//parent::div//div[@class=\"product-action\"]//button");
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	
	}
	public void clickOnAddToCart()
	{
		doClick(cucumberAddToCart);
	}


}
