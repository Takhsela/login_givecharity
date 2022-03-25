package testCases;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import objectRepo.HomePage;
import objectRepo.SignInPage;

import utilities.BaseClass;
import utilities.ReadExcel;
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
		while (true) {
			try {
				RowData rowData = excel.getData(rowNumber);
				SignInPage.fill_credentials(rowData.Email_address, rowData.password);
				rowNumber++;
			} catch (Exception e) {
				break;
			}
		}
	}
	
}




