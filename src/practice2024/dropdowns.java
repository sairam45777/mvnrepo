package practice2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("http://www.omayo.blogspot.com");
WebElement dropdown=driver.findElement(By.id("drop1"));
Select sc=new Select(dropdown);
sc.selectByIndex(2);
Thread.sleep(5000);
sc.selectByVisibleText("doc 3");
Thread.sleep(5000);
sc.selectByValue("");
List<WebElement> option = sc.getOptions();
WebElement options = sc.getFirstSelectedOption();
//driver.quit();
	}

}
