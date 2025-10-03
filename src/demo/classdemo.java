package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classdemo {
	public static void main(String[] args) throws IOException, InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
Actions action=new 	Actions(driver);
action.moveToElement(electronics).perform();
WebElement elementy=driver.findElement(By.xpath("//a[text()='Computer Peripherals' or @class=\"_1BJVlg _11MZbx\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style','backgroud:red;border: 2px solid blue');",elementy);
action.moveToElement(elementy);
Thread.sleep(1000);
driver.findElement(By.xpath("//a[text()=\"All\"]")).click();
//driver.close()
;
	}}
