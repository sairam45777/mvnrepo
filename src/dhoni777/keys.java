package dhoni777;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement element=	driver.findElement(By.xpath("//input[@id='email']"));
	element.sendKeys("sai");
	Thread.sleep(2000);
	//WebElement aa=driver.findElement(RelativeLocator.with(By.tagName("input")).below(element));
	//aa.sendKeys("ram");
	//aa.sendKeys(Keys.CLEAR);
	element.sendKeys(Keys.CLEAR);
			//driver.findElement(By.name("login")).sendKeys(Keys.CLEAR);
			WebElement ee=driver.findElement(By.name("login"));
			ee.sendKeys(Keys.DOWN);
			//driver.quit();

	}

}
