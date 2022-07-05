package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;
	
	public ConfigDataProvider() throws IOException
	{
		String path = "C:\\Users\\Shreedevi\\eclipse-workspace\\Frame_Work_One\\config\\config.properties";
		//location of congig.properties file
		
		FileInputStream fis = new FileInputStream(path);
		
		pro = new Properties();
		pro.load(fis);
		//properties is a class, it will load the FileInputStream reference
	}
	
	public String getBaseUrl_QA1()
	{
		return pro.getProperty("BaseUrl_QA1");		
	}
}
