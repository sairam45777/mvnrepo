package mvnjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

 class demoooo {
	public static void main (String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	List<WebElement>allLinks=driver.findElements(By.tagName(""));
	
	for(WebElement link:allLinks) {
		String clickfunction=Keys.chord(Keys.CONTROL,Keys.ENTER);
		link.sendKeys(clickfunction);
	}
for(WebElement link:allLinks) {
	 String url = link.getAttribute("href");
	 if(url==null|url.isEmpty()) {
		 System.out.println("url broken");
	 }
	 HttpURLConnection connection=(HttpURLConnection)(new URL(url).openConnection());
connection.connect();
if(connection.getResponseCode()>=400) {
	
}

}

}
}