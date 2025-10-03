package Reload;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggesionDropDown {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("selenium");
//List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
Thread.sleep(2000);
//<WebElement> list = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li"));
//List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
List<WebElement>list=driver.findElements(By.xpath("//div[@id=\"Alh6id\"]//li"));
System.out.println(list.size());
/*for(int i=0;i<list.size();i++) {
	//System.out.println(list.get(i).getText());
	if(list.get(i).getText().equals("selenium python")) {
		list.get(i).click();
		break;
	}*/
for(WebElement ll:list) {
	if(ll.getText().equalsIgnoreCase("selenium python")) {
	ll.click();
	break;
}}
//driver.close();

}
}