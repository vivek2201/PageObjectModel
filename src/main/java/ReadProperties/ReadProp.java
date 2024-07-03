package ReadProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	String Browser;
	public String getBrowser() throws IOException
	{
	Properties properties = new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Vivek\\Desktop\\automation\\Selenium1\\src\\test\\resources\\config\\config.properties");
	properties.load(fis);
	try {
		Browser = properties.getProperty("browser");
		System.out.println("Brwser value="+Browser);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return Browser;
	}
	

}
