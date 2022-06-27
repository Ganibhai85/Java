package com.Ganesh_Maven;

import org.testng.annotations.Test;

public class Priority_Invocation_Task {

	@Test(priority = -2)
	private void setProperty() {
		System.out.println("Set Proeprty");
	}

	@Test(priority = -1)
	private void browser_Launch() {
		System.out.println("Browser Launch");

	}

	@Test
	private void get_url() {
		System.out.println("Get URL");
	}
	@Test(priority = 1, invocationCount = 5)
	private void refresh() {
		System.out.println("Refresh");

	}
	
}
