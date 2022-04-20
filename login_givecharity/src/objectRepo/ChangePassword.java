package objectRepo;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class ChangePassword extends BaseClass {

	public static By curr_pass=By.xpath("//input[@placeholder='Current Password *']");
	public static By new_pass=By.xpath("//input[@placeholder='New Password *']");
	public static By conf_pass=By.xpath("//input[@placeholder='Confirm Password *']");
	
	public static void newpass(String currentpwd,String newpwd,String repeatpwd ) {
		enterTxt(curr_pass, currentpwd);
		enterTxt(new_pass, newpwd);
		enterTxt(conf_pass, repeatpwd);
	}
}
