package newThinks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOption {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option=new ChromeOptions(); 
		option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option); 
driver.get("https://www.justdial.com/");

	}

}
  