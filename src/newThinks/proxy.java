package newThinks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class proxy {

	public static void main(String[] args) {

Proxy pp=new Proxy();
pp.setHttpProxy("192.168.100.101:8080");
//IPaddress:port number
ChromeOptions options=new ChromeOptions();
options.setProxy(pp);
WebDriver driver=new ChromeDriver(options);
driver.get("https://omayo.blogspot.com/");
JavascriptExecutor js=(JavascriptExecutor)driver;

	}

	
}