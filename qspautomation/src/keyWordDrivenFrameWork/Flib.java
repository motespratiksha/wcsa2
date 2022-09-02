package keyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//all generic reusable methods are kept in this class
public class Flib {

	//read the data from excel file

	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cel = row.getCell(cellcount);
		String data = cel.getStringCellValue();
		return data;		
	}
	
	//get the rowcount from excel file 

	public int getRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rc = sh.getLastRowNum();
		return rc;    
	}
	
	//write the data from excel file
	
	
	public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);

		Cell cel = row.createCell(cellcount);
		cel.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);        
	}

	//read data property file
	
	
	public String readPropertyFile(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}






























