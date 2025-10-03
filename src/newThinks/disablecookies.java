package newThinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disablecookies {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-cookies");
WebDriver driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://tutorialsninja.com/demo/");
	
driver.quit();
}
}