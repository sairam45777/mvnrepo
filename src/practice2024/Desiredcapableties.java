package practice2024;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Desiredcapableties {

	public static void main(String[] args) throws MalformedURLException {
	
DesiredCapabilities ds=new DesiredCapabilities();
ds.setBrowserName("chrome");
ds.setPlatform(Platform.WINDOWS);
WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"),ds);
//ChromeDriver driver=new ChromeDriver();
driver.get("http:omayo.blogspot.com/");
driver.findElement(By.id("sai"));
driver.quit();
	}

}
