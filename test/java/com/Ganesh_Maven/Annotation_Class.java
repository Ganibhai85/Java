package com.Ganesh_Maven;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Class {
	@BeforeSuite
	private void SetProperty() {
		System.out.println("Set Property");
	}

	@BeforeClass
	private void browserlaunch() {
		System.out.println("Browser Launch");
	}

	@BeforeTest
	private void urllaunch() {
		System.out.println("Url Launch");
	}

	@BeforeMethod
	private void Signin() {
		System.out.println("Sign In");
	}

	@Test
	private void Dresses() {
		System.out.println("Dresses");
	}

	@Test
	private void Women() {
		System.out.println("Women");
	}

	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}

	@AfterMethod
	private void Signoff() {
		System.out.println("SignOff");
	}

	@AfterClass
	private void Home_Page() {
		System.out.println("Home Page");
	}

	@AfterSuite
	private void Delete_Cookies() {
		System.out.println("Delete Cookies");
	}

}
