package newThinks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	
	
	public static void main(String[] args) throws IOException, InterruptedException  {
	Proxy proxy=new Proxy();
	proxy.setHttpProxy("proxy address:portnumber");
	WebDriverManager.chromedriver().setup();

	ChromeOptions option =new ChromeOptions();
	option.setProxy(proxy);
	option.setAcceptInsecureCerts(true);
	option.addArguments("--disable-notification");
	ChromeDriver driver=new ChromeDriver();
	File file=new File("");
	FileInputStream stream=new FileInputStream(file);
	Properties pp=new Properties();
	pp.load(stream);
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement all=driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));
	all.sendKeys("sai");
	Keys.chord(Keys.CONTROL,"a");
	Keys.chord(Keys.CONTROL,"c");
	System.out.println("after copying"+Keys.chord(Keys.CONTROL,"v").toString());
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String pseudo="return window.getComputedStyle(arguments[0],'::before').getPropertyValue('content)";
	String text=js.executeScript(pseudo,all).toString();
	if(text.contains("*")) {
		
		
		
	}


}}