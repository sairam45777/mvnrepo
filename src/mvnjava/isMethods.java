package mvnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");
		//Invokes the browser
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		//Pass the URL
		driver.get("http://total-qa.com/checkbox-example/");
		
	boolean display= driver.findElement(By.name("chk")).isDisplayed();
		System.out.println(display); //true
	boolean enable=	driver.findElement(By.name("chk")).isEnabled();
		System.out.println(enable);//true
	WebElement select = 	driver.findElement(By.name("chk"));
		System.out.println(select.isSelected());//false
		
		driver.findElement(By.name("chk")).click();
		Thread.sleep(2000);
	boolean selected =	driver.findElement(By.name("chk")).isSelected();

System.out.println(selected);//true


	}

}
