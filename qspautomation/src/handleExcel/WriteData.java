package handleExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		 FileInputStream fis = new FileInputStream("./Data/Test Data.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("citytour");
	      Row row = sh.getRow(3);
	      
	     Cell cell = row.createCell(5);
	     cell.setCellValue("automation");
	     
	     FileOutputStream fos=new FileOutputStream("./Data/Test DAta.xlsx");
	     wb.write(fos);
	
	
	}

}
