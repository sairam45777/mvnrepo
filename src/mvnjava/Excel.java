package mvnjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Excel {

	public static void main(String[] args) throws IOException {

	//Path of the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\saina\\Documents\\Drmo.xls");
	//Creating a workbook
		HSSFWorkbook workbook = new HSSFWorkbook(fs);
	//Sheet
		HSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell =row.getCell(0);
				
		System.out.println(sheet.getRow(0).getCell(0));	
		System.out.println(sheet.getRow(1).getCell(0));	
		System.out.println(sheet.getRow(2).getCell(0));
		
		System.out.println(sheet.getRow(0).getCell(1));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(2).getCell(1));

		
	}

}
