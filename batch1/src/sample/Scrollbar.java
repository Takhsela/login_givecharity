package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
driver.navigate().to("https://jqueryui.com");
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		//JavascriptExecutor je = (JavascriptExecutor) driver;
		
		//WebElement element = driver.findElement(By.xpath("(//div[@class='deals-shoveler-card-image'])[1]"));
		
	//	je.executeScript("window.scrollBy(0,1000)", element);

		/*
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='deals-shoveler-card-image'])[6]"));	
	
		je1.executeScript("arguments[0].scrollIntoView(true);", element1);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	*/
	}
	
	
	

}
