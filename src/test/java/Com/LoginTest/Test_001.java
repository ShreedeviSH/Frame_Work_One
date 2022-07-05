package Com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Utility.BaseClass;
import Com.Utility.Library;
import Com.pageObject.LoginPom;

public class Test_001 extends BaseClass 
{
	@Test
	public void verifyLoginpage() throws InterruptedException
	{
		LoginPom login = PageFactory.initElements(driver, LoginPom.class);
		
		Library.custom_SendKeys(login.gettext_email(),excel.getStringData("sheet1", 0, 0));
		Thread.sleep(3000);
		Library.custom_SendKeys(login.gettext_pass(),excel.getStringData("sheet1", 0, 1));
		Thread.sleep(3000);
	}
}
