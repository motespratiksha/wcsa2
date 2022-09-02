package dataDrivenFrameWork;

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

public class Flib {

//generic reusable method
	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;	    		
	}

//generic reusable method to get the row count from excel file 
     public int getRowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;  

	}
     
     //generic reusable method to write the data in excel file
      public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
     {
    	      FileInputStream fis = new FileInputStream(excelpath);
    	      Workbook wb = WorkbookFactory.create(fis);            //make file ready for read operation
    	      Sheet sh = wb.getSheet(sheetname);               //go to specified sheet
    	      Row row = sh.getRow(rowcount);              //go to specified row
    	      
    	      Cell cel = row.createCell(cellcount);          //create cell
    	      cel.setCellValue(data);                        //send the data
    	      
    	      FileOutputStream fos = new FileOutputStream(excelpath);    //specify path of excel file
			  wb.write(fos);    //write the data
			  
    	 
     }
	
	









}
