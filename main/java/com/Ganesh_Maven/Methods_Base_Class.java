package com.Ganesh_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods_Base_Class {
	public static WebDriver d;

	public static void browser_launch(String Name) {
		if (Name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-Gani2\\Ganesh_Maven\\Driver\\chromedriver.exe");
			d = new ChromeDriver();
			
			d.manage().window().maximize();
		}
	}

	public static void implicit() {
		d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	// Demo QA Practice Site
	public static void geturl(String element) {
		d.get(element);
	}

	/*// Text Box
	public static void textbox(String webelement) {
		WebElement txt = d.findElement(By.xpath(webelement));
		txt.click();
	}

	public static void name(String webelement, String value) {
		WebElement Name = d.findElement(By.id(webelement));
		Name.sendKeys(value);
	}

	public static void email(String webelement, String value) {
		WebElement mail = d.findElement(By.id(webelement));
		mail.sendKeys(value);
	}

	// Check Box
	public static void checkbox(String webelement) {
		WebElement chk = d.findElement(By.xpath(webelement));
		chk.click();
	}

	public static void home(String webelement) {
		WebElement Home = d.findElement(By.xpath(webelement));
		Home.click();
	}

	// Radio Button
	public static void radiobtn(String webelement) {
		WebElement btn = d.findElement(By.xpath(webelement));
		btn.click();
	}

	// Action Class
	
	public static void implicit1() {
		d.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}*/

	public static void mouseaction(String webelement) {
		WebElement mouse = d.findElement(By.xpath(webelement));
		mouse.click();
	}
	 
     public static void doubleclick(String webelement) throws Exception {
    	 Actions a = new Actions(d);
    	 d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    	 WebElement dbclk = d.findElement(By.id(webelement));
    	
    	 a.doubleClick(dbclk).build().perform();
    	 }
	}

