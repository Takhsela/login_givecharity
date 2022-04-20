package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcel {
	private FileInputStream fis;
	private Workbook wb;
	private Sheet sh;
	private Sheet sh1;
//	private FileOutputStream fos;
	
	public void initializeSheet() throws IOException {
		fis = new FileInputStream(".\\src\\dataSet\\testData1.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet3");
		sh1=wb.getSheet("Sheet4");
		
}
	
	
	public class RowData {
		public String Email_address;
		public String password ;
		
		
	}
	public class RowData1{
		public String first_name;
		public String last_name ;	
		public String email;
		public String mobile_number;
		public String comments;
		
	}
	public class Correct_credentials{
		public String Correct_Email;
		public String Correct_Pass;
		
		
	}
	
	public class Change_Password{
		public String Current_Password;
		public String New_Password;
		public String Repeat_newPassword;
	}
	
	public Correct_credentials getData() {
		Correct_credentials correctCredentials=new Correct_credentials();
		Row row2=sh.getRow(1);
		Cell cell1=row2.getCell(0);
		String correct_email= cell1.getStringCellValue();
		System.out.println("email is :"+ correct_email);
		Cell cell2=row2.getCell(1);
		String correct_pass= cell2.getStringCellValue();
		System.out.println("password is"+ correct_pass);
		correctCredentials.Correct_Email = correct_email;

		correctCredentials.Correct_Pass = correct_pass;
		
		return correctCredentials ;
		
		
	}
	public Change_Password referData()  {
		Change_Password change=new Change_Password ();
		
		Row row_change=sh.getRow(5);
		Cell cell_old=row_change.getCell(0);
		String old_password= cell_old.getStringCellValue();
		System.out.println("old password is :"+ old_password );
		Cell cell_new=row_change.getCell(1);
		String new_password= cell_new.getStringCellValue();
		Cell cell_repeat=row_change.getCell(1);
		String repeat_password= cell_repeat.getStringCellValue();
		System.out.println("new password is"+ new_password);
		change.Current_Password=old_password;
		change.New_Password=new_password;
		change.Repeat_newPassword=repeat_password;
		
		
		return change ;
		
		
	}
	public RowData1 getData1(int rownum) throws Exception {
		RowData1 rowData1 = new RowData1();
		
		Row row1 = sh1.getRow(rownum);
		
		rowData1.first_name=row1.getCell(0).toString();
		System.out.println("first name is"+ rowData1.first_name);
	//	String actual_email=rowData.Email_address;
		rowData1.last_name= row1.getCell(1).toString();
		rowData1.email=row1.getCell(2).toString();
		rowData1.mobile_number=row1.getCell(3).toString();
		rowData1.comments=row1.getCell(4).toString();
	//String actual_pass=rowData.password;
		return rowData1;
}
	public RowData getData(int rowNumber) throws Exception {
		RowData rowData = new RowData();
		
		Row row = sh.getRow(rowNumber);
		
		rowData.Email_address=row.getCell(0).toString();
	//	String actual_email=rowData.Email_address;
		rowData.password= row.getCell(1).toString();
	//String actual_pass=rowData.password;
		return rowData;
}
}
