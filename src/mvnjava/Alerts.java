package mvnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");

		//Invokes the browser
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		
		String alertMsg=driver.switchTo().alert().getText();
		
		System.out.println(alertMsg);
		
		//driver.switchTo().alert().dismiss();
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
