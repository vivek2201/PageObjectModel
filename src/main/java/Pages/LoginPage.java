package Pages;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String getLoginTitle()
	{
		return driver.getTitle();
	}
	
	

}
