package com.Ganesh_Maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Adactin {
	public static WebDriver d;
	public static void browser_launch(String Name) {
		if (Name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-Gani2\\Java1\\Driver\\chromedriver.exe");
			d =  new ChromeDriver();
			d.manage().window().maximize();			
		}  
    }
	public static void geturl(String url) {
    d.get(url);    
	}
	public static void username(String webelement,String value) {
    WebElement usrname = d.findElement(By.id(webelement));
    usrname.sendKeys(value);
	}
	public static void password(String webelement,String value) {
		WebElement pwd = d.findElement(By.id(webelement));
		pwd.sendKeys(value);		
    }
	public static void login(String webelement) {
		WebElement lgn = d.findElement(By.id(webelement));
		lgn.click();
	}
	public static void location(String webelement, String value) {
     WebElement loc = d.findElement(By.id(webelement));
     Select s = new Select(loc);
     s.selectByValue(value);
	}
	public static void hotels(String webelement,String Value) {
		WebElement hotel = d.findElement(By.id(webelement));
		Select s = new Select(hotel);
		s.selectByValue(Value);
    }
	public static void roomtype(String webelement,String value) {
		WebElement room = d.findElement(By.id(webelement));
		Select s = new Select(room);
		s.selectByValue(value);
	}
	public static void noofrooms(String webelement,String value) {
		WebElement noofroom = d.findElement(By.id(webelement));
		Select s = new Select(noofroom);
		s.selectByValue(value);
		}
	public static void checkin(String webelement,String value) {
		WebElement chkin = d.findElement(By.id(webelement));
		chkin.sendKeys(value);
	}
	public static void checkout(String webelement,String value) {
		WebElement chkout = d.findElement(By.id(webelement));
		chkout.sendKeys(value);
	}
	public static void adultsperroom(String webelement,String value) {
		WebElement adults = d.findElement(By.id(webelement));
		Select s = new Select(adults);
		s.selectByValue(value);
	}
	public static void childperroom(String webelement,String value) {
		WebElement child = d.findElement(By.id(webelement));
		Select s = new Select(child);
		s.selectByValue(value);
	}
	public static void search(String webelement) {
		WebElement srch = d.findElement(By.id(webelement));
		srch.click();
	}
	public static void selecthotel(String webelement) {
		WebElement selhot = d.findElement(By.id(webelement));
		selhot.click();
	}
	public static void continu(String webelement) {
    WebElement cont = d.findElement(By.id(webelement));
    cont.click();
	}
	public static void firstname1(String webelement,String value) {
		WebElement fstname1 = d.findElement(By.id(webelement));
		fstname1.sendKeys(value);
	}
	public static void lastname1(String webelement,String value) {
		WebElement lstname1 = d.findElement(By.id(webelement));
		lstname1.sendKeys(value);
	}
	public static void address(String webelement,String value) {
		WebElement add = d.findElement(By.id(webelement));
		add.sendKeys(value);
	}
	public static void ccnum(String webelement,String value) {
		WebElement num = d.findElement(By.id(webelement));
		num.sendKeys(value);
	}
	public static void cctype(String webelement,String value) {
		WebElement type = d.findElement(By.id(webelement));
		Select s = new Select(type);
		s.selectByValue(value);
	}
	public static void expirymonth(String webelement,String value) {
		WebElement month = d.findElement(By.id(webelement));
		Select s = new Select(month);
		s.selectByValue(value);
	}
	public static void expiryyear(String webelement,String value) {
		WebElement year = d.findElement(By.id(webelement));
		Select s = new Select(year);
		s.selectByValue(value);
	}
	public static void cvvnum(String webelement,String value) {
		WebElement cvv = d.findElement(By.id(webelement));
		cvv.sendKeys(value);
	}
	public static void booknow(String webelement) {
	    WebElement book = d.findElement(By.id(webelement));
	    book.click();
	}
	
	public static void logout(String webelement) {
		Actions a = new Actions(d);
		WebElement log = d.findElement(By.id(webelement));
		a.click(log);		
	}	
	public static void scrnshot() throws Exception {
		TakesScreenshot sc = (TakesScreenshot) d;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\admin\\eclipse-Gani2\\Ganesh_Maven\\ScreenShot\\image1.png");
		FileUtils.copyFile(src, des);
			}
}