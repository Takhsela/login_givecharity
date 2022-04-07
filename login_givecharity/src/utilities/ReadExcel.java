package utilities;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
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
//	private FileOutputStream fos;
	
	public void initializeSheet() throws IOException {
		fis = new FileInputStream(".\\src\\dataSet\\testData1.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet3");
		
}
	
	public class RowData {
		public String Email_address;
		public String password ;
		
		
	}
	public class Correct_credentials{
		public String Correct_Email;
		public String Correct_Pass;
		
		
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
