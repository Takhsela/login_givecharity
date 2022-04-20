package testCases;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import objectRepo.ChangePassword;

import utilities.BaseClass;
import utilities.ReadExcel;


public class TC2 extends BaseClass{
	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;

	@Test(priority = 0)
	public void setup() {

		openBrowser("Chrome");
		openUrl("https://gcadmin:tigerhill2020@qa.givecharity.org/gc/open-change-password?reqType=flag");
	}
	
	@Test(priority = 1)
	public void chpass() throws Exception {
		ReadExcel excel = new ReadExcel();
		excel.initializeSheet();
		String cpass = excel.referData().Current_Password;
		String npass = excel.referData().New_Password;
		String rpass=excel.referData().Repeat_newPassword;
		while (true) {
			try {
				ChangePassword.newpass(cpass, npass, rpass);
				
			}
			catch (Exception e) {
				break;
			}
	}
	
	}
}

