package objectRepo;

import org.openqa.selenium.By;



import utilities.BaseClass;


public class SignInPage extends BaseClass {
	
	//loactors
public static By email_id=By.name("email");
public static By pass=By.name("password");
public static By submit_button=By.name("login");

public static void fill_credentials(String id, String pwd) {
	
	enterTxt(email_id, id);
	enterTxt(pass, pwd);
	
	click(submit_button);
	
}
}
