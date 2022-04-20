package testCases;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import objectRepo.ContactUs;
import objectRepo.HomePage;
import objectRepo.SignInPage;
import utilities.BaseClass;
import utilities.ReadExcel;
import utilities.ReadExcel.RowData;
import utilities.ReadExcel.RowData1;

public class TC3 extends BaseClass{
	Workbook wb;
	Sheet sh1;
	int numrows;
	int numcols;
	@Test(priority = 0)
	public void setup() {

		openBrowser("Chrome");
		openUrl("https://gcadmin:tigerhill2020@qa.givecharity.org");
	}
	@Test(priority = 1)
	 public void clickoncontact() {
		 HomePage.clickoncontactlink();
	 }
	@Test(priority = 2)
	public void contactfill() throws Exception {
		ReadExcel excel = new ReadExcel();
		excel.initializeSheet();
		int rownum = 1;
		RowData1 rowData1 = excel.getData1(rownum);
		
		String Fname=rowData1.first_name;
		String Lname=rowData1.last_name;
		String Mail=rowData1.email;
		String Number=rowData1.mobile_number;
		String Comments=rowData1.comments;
		while (true) {
			try {
							

					ContactUs.contactcredentials(Fname, Lname, Mail, Number, Comments);
				
					rownum++;
		}
				
			
			catch (Exception e) {
				break;
			}
			
		}

	}
}