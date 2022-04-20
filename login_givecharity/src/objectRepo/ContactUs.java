package objectRepo;

import org.openqa.selenium.By;

import utilities.BaseClass;

public class ContactUs extends BaseClass {
	public static By first_name=By.xpath("//input[@placeholder=\"First Name *\"]");
	public static By last_name=By.xpath("//input[@placeholder=\"Last Name *\"]");
	public static By email=By.xpath("//input[@placeholder=\"Email *\"]");
	public static By mobnum=By.xpath("//input[@placeholder=\"Mobile Number *\"]");
	public static By comment=By.xpath("//textarea[@placeholder=\"Comment *\"]");
	
	public static void contactcredentials(String fname,String lname,String id,String mnum,String comm ) {
		enterTxt(first_name, fname);
		enterTxt(last_name, lname);
		enterTxt(email, id);
		enterTxt(mobnum, mnum);
		enterTxt(comment, comm);
	}
}
