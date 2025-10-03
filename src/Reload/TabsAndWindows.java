package Reload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
//we want to open another url we pass that it will open same tab
//we want to open in new ....we use switch command its avilable in selenium4

driver.switchTo().newWindow(WindowType.TAB);
//we want separate browser window one
	driver.switchTo().newWindow(WindowType.WINDOW);


driver.get("https://orangehrm.com/");//Driver focus on second one
	}

}
