package com.Ganesh_Maven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_test {
	@Test
	private void demo() {
		String s = "Java";
		String s1 = "Selenium";
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(s, s1);
		System.out.println("Data Verification");
		}
	@Test
	public void demo1() {
		String s = "Java";
		String s1 = "Selenium";
		Assert.assertNotEquals(s, s1);
		System.out.println("Data validation");

	}

}
