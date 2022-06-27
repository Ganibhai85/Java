package com.Ganesh_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public static WebDriver d;

	public static void browser_launch(String Name) {

		if (Name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-Gani2\\Java1\\Driver\\chromedriver.exe");
			d = new ChromeDriver();
		}
		d.manage().window().maximize();
	}

	public static void geturl(String url) {

		d.get(url);
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public static void navi(String url1) {
		d.navigate().to(url1);
	}

	public static void navbck() {
		d.navigate().back();
	}

	public static void navref() {
		d.navigate().refresh();
	}

	public static void alert(String url2) {
		d.get(url2);
	}

public static void timer(String key) {
	WebElement findElement = d.findElement(By.id(key));
	findElement.click();
	d.switchTo().alert().accept();

}

	


}
