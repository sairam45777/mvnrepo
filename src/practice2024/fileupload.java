package practice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
	   
	driver.get("http://omayo.blogspot.com/");
	String ss=System.getProperty("user.dir");

	//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\saina\\Pictures\\1640142661040_.jpg");
	driver.findElement(By.id("uploadfile")).sendKeys(ss+"\\Files\\1640142661040_.jpg");
 
	}

}
