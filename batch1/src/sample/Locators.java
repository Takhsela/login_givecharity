package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
	
WebDriver driver;
	
	By email = By.id("email");
	By pwd = By.id("pass");
	By login = By.xpath("//button[@type='submit']");
	
	
	Locators(WebDriver d)
	{
		driver = d ;
	}
	
	public void txtemail(String emailid)
	{
		driver.findElement(email).sendKeys(emailid);
	
	}
	public void txtpwd(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void btnlogin()
	{
		driver.findElement(login).click();
	}
}


