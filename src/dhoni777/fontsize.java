 package dhoni777;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fontsize {
@Test
	public void test(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		List<WebElement>element=driver.findElements(By.xpath(""));
		int ss = element.size();
		WebElement email=driver.findElement(By.name("login"));
	WebElement forget=driver.findElement(RelativeLocator.with(By.tagName("div")).below(email));
		String size=forget.getCssValue("font-size");
		System.out.println(size);
	String size1="14px";
	Dimension d=forget.getSize();
driver.quit();
}

}
