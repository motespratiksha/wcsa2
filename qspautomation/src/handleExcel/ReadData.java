package handleExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./Data/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);   //make file ready to read option
		Sheet sh = wb.getSheet("Citytour");    //go to specified sheet
		Row row = sh.getRow(0);    //go to the specified row
		Cell cell = row.getCell(0);  //go to specified column
		String data = cell.getStringCellValue();    //get the data from cell
		System.out.println(data);      //print the data		
		
		
		
		
	
		
	}

}
