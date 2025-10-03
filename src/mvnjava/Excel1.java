package mvnjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Excel1 objExcelFile = new Excel1();
		
		String filePath = System.getProperty("user.dir")+"\\src";
		
		objExcelFile.readExcel(filePath, "Drmo.xls", "Sheet1");
		
		String[] dataToWrite = {"Sai", "Naveena", "Krish"};
		
		objExcelFile.writeExcel(filePath, "Drmo.xls", "Sheet1", dataToWrite);
	}

	public void readExcel(String filePath, String fileName, String sheetName ) throws IOException {
		
		File file = new File(filePath+"\\"+fileName);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook =null;
		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx")) {
			
			workbook = new XSSFWorkbook(inputStream);
					
		}
		
		else if(fileExtensionName.equals(".xls")) {
			
			workbook = new HSSFWorkbook(inputStream);
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		
	int rowCount =	sheet.getLastRowNum()-sheet.getFirstRowNum();
	
	for(int i=0; i<rowCount; i++) {
		
		Row row = sheet.getRow(i);
		
		for(int j=0; j<row.getLastCellNum(); j++) {
			String data = row.getCell(j).getStringCellValue()+"-";
			System.out.print(row.getCell(j).getStringCellValue()+"-");
			
			if(data.equals("username")) {
			System.out.println(row.getCell(j).getStringCellValue()+"-");	
			}
		}
		
		System.out.println();
	}
	
	}
	
	public void writeExcel (String filePath, String fileName, String sheetName, String[] dataToWrite) throws IOException {
		
	File file = new File(filePath+"\\"+fileName);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook =null;
		
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx")) {
			
			workbook = new XSSFWorkbook(inputStream);
					
		}
		
		else if(fileExtensionName.equals(".xls")) {
			
			workbook = new HSSFWorkbook(inputStream);
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		
	int rowCount =	sheet.getLastRowNum()-sheet.getFirstRowNum();
	
		Row row = sheet.getRow(0);
		
		Row newRow = sheet.createRow(rowCount+1);
		
		for (int j=0; j<row.getLastCellNum(); j++) {
			
			Cell cell = newRow.createCell(j);
			cell.setCellValue(dataToWrite[j]);
		}
		inputStream.close();
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		workbook.write(outputStream);
		
		outputStream.close();
	}
}
