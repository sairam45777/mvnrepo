package mvnjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");
		//Invokes the browser
			WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		//Pass the URL
		driver.get("https://www.amazon.com/");
		
		//a tag
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		Thread.sleep(2000);
		WebElement footer =driver.findElement(By.xpath("//*[@id='navFooter']/div[4]"));
		Thread.sleep(2000);

		System.out.println(footer.findElements(By.tagName("a")).size());
	int	counts =footer.findElements(By.tagName("a")).size();
	List<WebElement> count = footer.findElements(By.tagName("a"));
		/*WebElement columnFooter = driver.findElement(By.xpath("(//*[@id=\"navFooter\"]//td[1])[1]"));
		System.out.println(columnFooter.findElements(By.tagName("a")).size());*/
		
	
		/*for(int i=0;i<counts;i++) {
			
			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			String tt=footer.findElements(By.tagName("a")).get(i).getText();
System.out.println(tt);
			Thread.sleep(2000);
			
		}*/
		for(WebElement coun:count) {
			String clickonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
Actions aa=new Actions(driver);
			coun.sendKeys(clickonlinkTab);
			//aa.keyDown(Keys.CONTROL).click(coun).keyUp(Keys.CONTROL).perform();

		}
	/*	driver.getWindowHandles();
		ArrayList a=new ArrayList(abc);
		Iterator<String> it=abc.iterator();		
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}*/
	}

}
