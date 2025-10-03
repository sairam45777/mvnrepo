package practice2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newWindow {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://www.bing.com");
Thread.sleep(1000);

driver.switchTo().newWindow(WindowType.WINDOW);
Thread.sleep(1000);
driver.get("http://www.lebyy.com");
driver.switchTo().newWindow(WindowType.TAB);
 
	}

}
