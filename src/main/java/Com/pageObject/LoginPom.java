package Com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom 
{
	@FindBy(how=How.XPATH,using="//input[@id='email']") //Annotation
	private WebElement text_email; //Encapsulation
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement text_pass;
	
	public WebElement gettext_email()
	{
		return text_email;
	}
	
	public WebElement gettext_pass()
	{
		return text_pass;
	}
}
