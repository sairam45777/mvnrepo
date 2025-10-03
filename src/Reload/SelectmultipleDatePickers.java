package Reload;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectmultipleDatePickers {
	//select future dates
	static void selectfuturedates(WebDriver driver,String month,String year,String date) {
		
		while(true) {//true manaki kavalasina data vache varaku execute avutadhi
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//month 
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(currentMonth.equals(month)&&currentyear.equals(year)) {
				break;
			}
			//next button clicking
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//previous date kavali ante
			//driver.findElement(By.xpath("//spam[@class='ui-icon ui-icon-circle-triangle-w]")).click();

		}	
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table//td/a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	//select past dates
	static void selectpastdates(WebDriver driver,String month,String year,String date) {
		
		while(true) {//true manaki kavalasina data vache varaku execute avutadhi
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//month 
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
			if(currentMonth.equals(month)&&currentyear.equals(year)) {
				break;
			}
			//next button clicking
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//previous date kavali ante
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}	
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table//td/a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			
		}
	}}
	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
driver.manage().window().maximize();
driver.get("https://jqueryui.com/datepicker/");
driver.switchTo().frame(0);
//only one frame it's have ...we use index
/*String year="2025";
String month="May";
String date="20";*/
driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
//future dates u want
selectfuturedates(driver,"May","2025","20");//or selectfuturedates(driver,"2025","may","20");
//selectpastdates(driver,"May","2023","25");
//past dates;






}

}


