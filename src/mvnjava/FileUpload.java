package mvnjava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");

		//Invokes the browser
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		
		driver.findElement(By.id("pickfiles")).click();
		
		//AutoIT
		Runtime.getRuntime().exec("C:\\Users\\saina\\Documents\\AutoIT\\FileUpload.exe");
		
		
		
		
		
	}
	

}
