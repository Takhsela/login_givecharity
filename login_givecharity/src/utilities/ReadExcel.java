package utilities;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

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
	public RowData getData(int rowNumber) throws Exception {
		RowData rowData = new RowData();
		
		Row row = sh.getRow(rowNumber);
		
		rowData.Email_address = row.getCell(0).toString();
		rowData.password = row.getCell(1).toString();
		
		return rowData;
}
}
