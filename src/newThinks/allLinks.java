package newThinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		//Pass the URL
		driver.get("https://www.flipkart.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		//WebElement ee=driver.findElement(By.xpath(""));
		//Dimension ww = ee.getSize();
		//System.out.println(ww);
		String[] str = new String[links.size()];
		System.out.println(links.size());
		int index=0;
		for(WebElement link:links) {
			//System.out.println(str[index++]=link.getText());
			System.out.println(link.getText());
			index++;
		}
		System.out.println(index);
		driver.quit();
	}

}
