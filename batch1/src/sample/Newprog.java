package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newprog {

	  public static void main(String[] args) throws InterruptedException {
	       System.out.println("Hello!!");
			
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys("takhsela86@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("kirubhakaran");
//			Thread.sleep(3000);

			WebElement element=driver.findElement(By.name("login"));
			element.click();
			//WebElement clk=driver.findElement(By.xpath("//div[@class='n00je7tq arfg74bv qs9ysxi8 k77z8yql i09qtzwb n7fi1qx3 b5wmifdl hzruof5a pmk7jnqg j9ispegn kr520xx4 c5ndavph art1omkt ot9fgl3s rnr61an3']"));
	 //       clk.click();
	//        driver.close();
	       
	    }

	}