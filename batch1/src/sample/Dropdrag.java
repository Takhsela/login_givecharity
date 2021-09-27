package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdrag {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();

driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(2);//by index
		
		WebElement index = driver.findElement(By.xpath("(//a[text()='Index'])[1]"));
		index.click();
		
		//Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");//by name
		
		WebElement element = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']"));
		element.click();

	}

}
