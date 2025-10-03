package newThinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class sslcerificates {
//
	public void test() {
		 ChromeOptions option=new ChromeOptions();
		 option.setAcceptInsecureCerts(true);
		 WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://expired.badssl.com/");
	
driver.quit();
}
}