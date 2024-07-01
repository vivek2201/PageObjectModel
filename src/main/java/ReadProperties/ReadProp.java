package ReadProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	static String Browser;
	
	public static String getBrowser() throws IOException
	{
	Properties properties = new Properties();
	FileInputStream fis=new FileInputStream("config.properties");
	properties.load(fis);
	fis.close();
	Browser = properties.getProperty("browser");
	return Browser;
	}
	

}
