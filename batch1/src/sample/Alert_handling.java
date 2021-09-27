package sample;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 // Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        
       driver.findElement(By.name("submit")).submit();
   		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		

		
		/*driver.get("https://demoqa.com/alerts");
		   driver.manage().window().maximize();
		  // This step will result in an alert on screen
		  // Actions actions = new Actions(driver);
		   WebElement element = driver.findElement(By.id("promtButton"));
		  // actions.doubleClick(element).perform();
		   //((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		   element.click();
		   Thread.sleep(5000);
		   Alert promptAlert  = driver.switchTo().alert();
		   Thread.sleep(5000);
		   String alertText = promptAlert.getText();
		  // Thread.sleep(5000);
		   System.out.println("Alert text is " + alertText);
		  // Send some text to the alert
		   promptAlert.sendKeys("Test User");
		   Thread.sleep(5000);
		   
		   System.out.println("Have sent the user name");
		   
		   promptAlert.accept();
		   
        */
	}

}
