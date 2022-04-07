package testCases;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import objectRepo.HomePage;
import objectRepo.SignInPage;

import utilities.BaseClass;
import utilities.ReadExcel;
import utilities.ReadExcel.Correct_credentials;
import utilities.ReadExcel.RowData;
public class TC1 extends BaseClass {
	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;

	@Test(priority = 0)
	public void setup() {

		openBrowser("Chrome");
		openUrl("https://gcadmin:tigerhill2020@qa.givecharity.org");
	}
	@Test(priority = 1)
	 public void clickonsignin() {
		 HomePage.clickonsigninlink();
	 }
	
	@Test(priority = 2)
	public void formFill() throws Exception {
		ReadExcel excel = new ReadExcel();
		excel.initializeSheet();
		int rowNumber = 1;
		RowData rowData = excel.getData(rowNumber);
		String correctEmail = excel.getData().Correct_Email;
		String correctPass = excel.getData().Correct_Pass;
		String actual_email=rowData.Email_address;
		String actual_pass=rowData.password;
		while (true) {
			try {
				
				
				if(correctEmail.equalsIgnoreCase(actual_email) && correctPass.equalsIgnoreCase(actual_pass)) {
					
					SignInPage.fill_credentials(correctEmail, correctPass);
					SignInPage.submit();
					break;
				}
				
				else  {
					
					SignInPage.fill_credentials(actual_email,actual_pass );
				
					}
				rowNumber++;
			
			} catch (Exception e) {
				break;
			}
		}
	}
	
}




