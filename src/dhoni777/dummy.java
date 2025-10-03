package dhoni777;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dummy  {
public static void main(String[] args) throws IOException, AWTException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
WebElement element=driver.findElement(By.xpath(""));
String ss=element.getCssValue("font-size");
	String img=element.getAttribute("src");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid green');", args);
	Keys.chord(Keys.CONTROL,"a");
	js.executeScript("document.getElementById('').click()");
	js.executeScript("wondow.scrollBy(0,500)");
	js.executeScript("arguments[0].scrollIntoView()", args);
	js.executeScript("window.scrollBy(0,document.body().scrollHeight)");
	Actions action=new Actions(driver);
	action.dragAndDropBy(element,100,0);
	action.moveToElement(element).click().build().perform();
	action.moveToElement(element).contextClick();
	action.dragAndDrop(element, element);
	
	js.executeScript("arguments[0].setAttribute('value','sai');",element);
	js.executeScript("arguments[0].value='sai'", args);
	js.executeScript("document.body.style.zoom='120%'");
	driver.switchTo().alert().accept();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
	alert.dismiss();
	alert.sendKeys("");
	js.executeScript("arguments[0].click()", args);
	FileInputStream stream=new FileInputStream("");
	HSSFWorkbook hsbook=new HSSFWorkbook(stream);
	HSSFSheet sheet=hsbook.getSheetAt(0);
	HSSFRow row=sheet.getRow(0);
	HSSFCell cell=row.getCell(0);
	Dimension dd=element.getSize();
	int size=driver.findElements(By.xpath("")).size();
	TakesScreenshot shot=(TakesScreenshot)driver;
	File screenshotdata=shot.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\target\\screenshot.png");
	FileUtils.copyFile(screenshotdata, target);
	Runtime.getRuntime().exec("");
}
	
}



