package mvnjava;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo777 {
 
	public static void main(String[] args) throws AWTException, IOException {
String s="sai";
Integer.parseInt(s);
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
FileInputStream stream=new FileInputStream("");
HSSFWorkbook book=new HSSFWorkbook();
HSSFSheet sheet=book.getSheetAt(0);
Row row=sheet.getRow(0);
row.getCell(0);
Properties pp=new Properties();
pp.load(stream);
System.out.println(pp.get("firstname"));
}}