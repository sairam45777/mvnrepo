package javascriptsss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoominZoomout {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.body.style.zoom='192%'");
	}

}
