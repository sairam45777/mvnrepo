package Reload;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement drpcountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcountry=new Select(drpcountryEle);
		
		//select option from the dropdown
		//drpcountry.selectByVisibleTest("France");
		//drpcountry.selectByIndex(2);
		//drpcountry.deselectByValue("japan");
		
		//capture the all options from dropdown
		List<WebElement> options = drpcountry.getOptions();
		System.out.println(options.size());
		
		//print all options
		for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
		}
		
		
		
		

	}

}
