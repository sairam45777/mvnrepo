package Reload;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option*/
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//find all options
		/*List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		//printing options from dropdown
		for(WebElement op:options) {
			System.out.println(op.getText());
		}*/
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));

		for(WebElement op:options) {
			String option=op.getText();
			if(option.equals("Java")||option.equals("Python")||option.equals("MySQL")) {
			op.click();
		}
		
		
		}
		
			
			
			
		
	}

}
