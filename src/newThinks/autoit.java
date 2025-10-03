package newThinks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoit {
	public static void main(String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/upload");
WebElement element=driver.findElement(By.id("file-upload"));
Actions action=new Actions(driver);
action.moveToElement(element).click().perform();
//element.click();
Runtime.getRuntime().exec("C:\\Users\\saina\\Documents\\AutoIT\\autoit22222.exe");

/*ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1","C:\Users\saina\Downloads\images.jpeg")
ControlClick("Open","","Button1")
*/

driver.get("https://fineuploader.com/demos.html");
 WebElement element1 = driver.findElement(By.xpath("(//div[@class=\"qq-total-progress-bar-selector qq-progress-bar qq-total-progress-bar\"]/following::div[2])[2]"));
 element1.click(); 
 WebElement element11=driver.findElement(By.className("orange"));
 JavascriptExecutor jj=(JavascriptExecutor)driver;
 jj.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid blue')",element1 );
Actions action1 =new Actions(driver);
action.moveToElement(element).click().perform();
 
 jj.executeScript("documents.getElementByXpath('//div[@class=\"qq-total-progress-bar-selector qq-progress-bar qq-total-progress-bar\"]/following::div[2])[2]').click()");
 jj.executeScript("arguments[0].click()",element1);
 
}
}