package Reload;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class OpenLinkwithNewTab {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
WebElement registerpage=driver.findElement(By.xpath("//a[text()='Register']"));

//control +enter click on register element link  open another webpage
//we do manual like click on register its open same page
Actions action =new Actions(driver);
action.keyDown(Keys.CONTROL).click(registerpage).keyUp(Keys.CONTROL).perform();
String ss=Keys.chord(Keys.CONTROL,Keys.ENTER);
registerpage.sendKeys(ss);
//switching to registreation page because driver focussing on first page
//Set<String> id = driver.getWindowHandles();
//heare two window ids we get using set...no(set is not a getmethod and set not allow indexing) we use list collection
List<String> array=new ArrayList();
//registerpage.cleck();// its open in same page
String childid = array.get(1);// index start with zero zero....parant,one...child
driver.switchTo().window(childid);
//we want to move to home
driver.switchTo().window(array.get(0));




	}

}
