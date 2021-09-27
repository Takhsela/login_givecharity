package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void fb() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		//Locators lt = new Locators(driver);
		
		Locators1 lt = new Locators1(driver);
		
		
		lt.txtemail("Testing");
		Thread.sleep(2000);
		
		lt.txtpwd("password");
		Thread.sleep(2000);
		
		lt.btnlogin();
		
		}



}
