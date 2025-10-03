package dhoni777;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imagesource  {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://omayo.blogspot.com/");
WebElement img=driver.findElement(By.xpath("//div[@class=\"widget-content\"]/img"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid green');", img);
String att=img.getAttribute("src");
WebElement textfield=driver.findElement(By.xpath("//textaREA[@id='ta1']"));
textfield.sendKeys("sai");
Thread.sleep(2000);
//textfield.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//textfield.sendKeys(Keys.DELETE);
textfield.clear();
//source of image
System.out.println(att);
	}

}
