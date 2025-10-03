package Reload;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
	Actions action =new Actions(driver);
	
	//ctrl+A select the text 
	action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
//keydown tho control click chesi + keyup the click chesina ctrl ni release chesam
	//keydown means pressing the key and keyup is release the key
	
	//copy the Text
	action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	//Tab
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	//ctrl+v
	action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	//we want shift commands
	//action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("V").keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).perform();

	
	
	
	
	}

}
