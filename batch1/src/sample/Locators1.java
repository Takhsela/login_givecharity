package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Locators1 {
WebDriver driver;
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement lgn;

	Locators1(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
		
	}
	
	public void txtemail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void txtpwd(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void btnlogin()	
	{
		lgn.click();
	}
}


