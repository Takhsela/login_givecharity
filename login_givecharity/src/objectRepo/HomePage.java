package objectRepo;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class HomePage extends BaseClass {
	
	//locators for homepage
public static By home_page=By.linkText("Home");
public static By donate=By.linkText("Donate");
public static By fund=By.linkText("Fundraise");
public static By abt=By.linkText("About");
public static By contact=By.linkText("Contact");
public static By sign_in=By.linkText("Sign In");

//create a method

public static void clickondonatelink()
{
click(donate);
}

public static void clickonfundlink() {
	click(fund);
}

public static void clickonaboutlink() {
click(abt);
}

public static void clickoncontactlink() {
	click(contact);
}

public static void clickonsigninlink() {
	click(sign_in);
}

}