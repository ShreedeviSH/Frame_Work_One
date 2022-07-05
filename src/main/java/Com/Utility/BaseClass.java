package Com.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void StartSetup() throws IOException
	{
		config = new ConfigDataProvider();
		excel = new ExcelDataProvider();
	}
	
	@Parameters({"BrowserName"}) 
	//this parameters are used for cross browsing
	
	@BeforeMethod
	public void setUp(String BrowserName) throws InterruptedException
	{
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
//		else if(BrowserName.equalsIgnoreCase("Edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver = new ChromeDriver();
//		}
		driver.get(config.getBaseUrl_QA1());
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
