package dhoni777;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	WebElement element=driver.findElement(By.xpath("//iframe | //frame"));
	  Dimension ss = element.getSize();
	 System.out.println(ss);
	 List<WebElement>elemen=driver.findElements(By.xpath(""));
	int size= elemen.size();
	 driver.quit();
}
}