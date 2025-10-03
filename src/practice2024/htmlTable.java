package practice2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class htmlTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//driver.get("https://money.rediff.com/indices"); +
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//String afternumber= "]td[1]";
//String beforenumber="//tr[" ;

		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
//beforenumber+afternumber 

		String afterNumbercomp = "]/td[1]";
		String afterNumbercontact = "]/td[2]";
		String afterNumbercountry = "]/td[3]";

		String after = "//table[@class='ws-table-all']/tbody//tr[";
//tr[2]/td[1]
		for (int i = 2; i < rows.size(); i++) {

			String xpathcompany = new StringBuilder().append(after).append(i).append(afterNumbercomp).toString();
			String xpathcompanycontact = new StringBuilder().append(after).append(i).append(afterNumbercontact)
					.toString();
			String xpathcompanycountry = new StringBuilder().append(after).append(i).append(afterNumbercountry)
					.toString();

			String compname = driver.findElement(By.xpath(xpathcompany)).getText();
			String contactname = driver.findElement(By.xpath(xpathcompanycontact)).getText();
			String countryname = driver.findElement(By.xpath(xpathcompanycountry)).getText();

			System.out.println(compname + " , " + contactname + " , " + countryname);

			Object totalTabledata = driver.findElement(By.xpath(xpathcompany)).getText();
			if (totalTabledata.equals("Ernst Handel")) {
				System.out.println(rows.get(3).getText() + "\t");
				System.out.println("  ");

			}
			// driver.quit();
		}
	}
}
/*
 * driver.get("https://money.rediff.com/indices");
 * 
 * driver.findElement(By.id("dataTable")); WebElement table=
 * driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));
 * List<WebElement> rows=table.findElements(By.tagName("tr"));
 * System.out.println(rows.size()); String first="//tr["; 
 * String second="]/td[1]"; 
 * for(int i=2;i<rows.size();i++) { 
 * String xx=new StringBuilder().append(first).append(i).append(second).toString();
 * 
 * System.out.println(driver.findElement(By.xpath(xx)).getText());
 * 
 * }
 */