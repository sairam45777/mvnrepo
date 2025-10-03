package Reload;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	//find rows
	int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	//find column
	int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

	//read data from the specific row and column
	String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	System.out.println(bookname);
	
	//read all data from the table
	for(int r=2;r<row;r++) {//increment rows
		for(int c=1;c<col;c++){//increment columns
			String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	//we can't pass varible directly into the xpath thats why we write "+r+" and "+c+"
			System.out.print(data+"\t"+"\t");// \t gives tab space
		}
		System.out.println(); 
	}
	
	for(int r=2;r<row;r++) {//increment rows
			String authornames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	//we can't pass varible int the xpath thats why we write "+r+" and  its get all author colum data
			if(authornames.equals("Mukesh")) {
			String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			//mukesh ni find chesi dhani td[1] lo vunna data ni get chestundhi
			//same row lo bookname data get chestunnam
			System.out.println(Bookname);
			}}
	ArrayList<Integer>array=new  ArrayList<Integer>();
	for(int r=2;r<row;r++) {
		String intdata=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		int dataint = Integer.parseInt(intdata);
		array.add(dataint);
		 Collections.sort(array);
	}		
	System.out.println(array.get(0));
System.out.println(array.size());
System.out.println(array.get(array.size()-1));
System.out.println(array);


	driver.quit();
	}}