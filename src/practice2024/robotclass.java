
package practice2024;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotclass {

	public static void main(String[] args) throws AWTException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://omayo.blogspot.com/");
WebElement elemt=driver.findElement(By.id("uploadfile"));

//driver.findElement(By.xpath("//input[@id='uploadfile']"));.sendKeys("C:\\Users\\saina\\Pictures\\1640142661040_.jpg")
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",elemt);
Robot rb=new Robot();
rb.delay(2000);
StringSelection ss=new StringSelection("C:\\Users\\saina\\Pictures\\1640142661040_.jpg");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

rb.keyPress(KeyEvent.VK_CONTROL);//control midha click chestunnam
rb.keyPress(KeyEvent.VK_V);

rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
