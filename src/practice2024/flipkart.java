package practice2024;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart { 
public static void main(String args[]) throws Exception  {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.flipkart.com/");
 List<WebElement >ele=driver.findElements(By.className("Pke_EE"));
 //ele.sendKeys("redmi 12 5g");
 //HashSet ss=new HashSet(ele);
 ArrayList l=new ArrayList(ele);
 Collections.sort(l);
 Robot rr= new Robot();

 rr.keyPress(KeyEvent.VK_ENTER);
 rr.keyRelease(KeyEvent.VK_ENTER);
 //driver.close();//input[@class='_3704LK']
 driver.findElement(By.className("_396cs4")).click();
 //WebElement ee=driver.findElement(By.xpath("//ul[@class=\"row\"]/child::li[1]/child::button"));
WebElement eee=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
 JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",eee);
 	//WebElement element=driver.findElement(By.xpath("//ul[@class='row']/li[1]/button[1]"));
 //WebElement ee=driver.findElement(By.xpath("//div[@class='_1AtVbE']")) 
 //ee.findElement(By.tagName("//div[@class='_1AtVbE']")).click();
}
}