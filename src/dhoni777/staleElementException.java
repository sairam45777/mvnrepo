package dhoni777;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staleElementException {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
WebElement element=	driver.findElement(By.id("ta1"));
	//WebElement element = driver.findElement(By.xpath("//div[@id='HTML2']/child::div[1]"));
	element.sendKeys("sai");
	String size = element.getCssValue("font-size");
	System.out.println(size);
	Thread.sleep(2000);
	driver.findElement(By.linkText("compendiumdev")).click();
	driver.navigate().back();
	driver.navigate().to("");
	element=driver.findElement(By.id("ta1"));
	element.clear();
	driver.quit();
	}

}
