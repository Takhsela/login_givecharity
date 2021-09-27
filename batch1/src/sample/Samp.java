package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Takhsela\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().window().maximize();
driver.navigate().to("https://www.makemytrip.com/");
		
		//try {
			
		//	WebElement text = driver.findElement(By.xpath("//p[text()='Login/Signup for Best Prices']"));
			
		//	if(text.isDisplayed())
			//{
				//driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
			//}
		//}
		
	//	catch(Exception e)
		//{
			//System.out.println(e.getMessage());
		//}
		//Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//li[@data-cy=\"menu_More\"]"));
		
		action.moveToElement(element).build().perform();

	//}

//}

		//driver.get("https://shareselenium.herokuapp.com/DropDown.html");
		//driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 //tagname[@attribute='value']

		//tagname[@attribute='value'])[number]

		 //tagname[text()='value']

		//tagname[text()='value'])[number]

	}
	
}
