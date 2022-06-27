package com.Ganesh_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class_FB {
	public static WebDriver d;

	public static void browser_launch(String Name) {
		if (Name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-Gani2\\Ganesh_Maven\\Driver\\chromedriver.exe");
			d = new ChromeDriver();
			d.manage().window().maximize();
		}
	}

	public static void implicit() {
		d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	public static void geturl(String browser) {
		d.get(browser);
	}
	public static void phno(String webelement,String value) {
		WebElement phone = d.findElement(By.id(webelement));
		phone.sendKeys(value);
	}
	public static void pass(String webelement,String value) {
    WebElement pwd = d.findElement(By.id(webelement));
    pwd.sendKeys(value);
	}
	public static void login(String webelement) {
		WebElement log = d.findElement(By.name(webelement));
		log.click();
	}
	public static void out(String output) {
		System.out.println(output);

	}
	}
