package Reload;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practiece {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
WebElement ss=driver.findElement(By.xpath("//div[@class='form-group'][4]"));
	File source = ss.getScreenshotAs(OutputType.FILE);
	File target=new File(System.getProperty("user.dir")+"\\screenshots\\saas.png");
	source.renameTo(target);
	
	
	}

}
