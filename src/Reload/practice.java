package Reload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws IOException {
		Proxy pr=new Proxy();
		pr.setHttpProxy("");
		ChromeOptions opton=new ChromeOptions();
opton.setProxy(pr);
		FileInputStream ff=new FileInputStream("");
		HSSFWorkbook book=new HSSFWorkbook(ff);
		HSSFSheet sheet=book.getSheetAt(0);
		HSSFRow row=sheet.getRow(0);
		HSSFCell cell=row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Properties property=new Properties();
		property.load(ff);
		

		WebDriverManager.chromedriver().setup();
		File filee=new File("");
	//	FileInputStream stream=new FileInputStream(filee);
		ChromeOptions option=new ChromeOptions();
		option.setProxy(pr);
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		List<WebElement>all=driver.findElements(By.xpath(""));
			/*
			 * controlfocus(title comment controlId)
			 * controlsetText(title,comment,path,controlid)
			 * controlClick(title ,comment,control);*/
		JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('')", args);
js.executeScript("windows.scrollBy(0,500)");
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		for(WebElement al:all) {
		String s="return window.getComputedStyle(arguments[0],'Befire::*'.getProperty(content)";
		String cc=js.executeScript(s,al).toString();
		}
	
		
		
		
	
}	
}

