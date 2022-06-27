package com.Ganesh_Maven;

import org.testng.annotations.Test;

public class Time_Out {
	@Test(timeOut = 8000)
	private void login() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("System.setproperty");
		Thread.sleep(2000);
		System.out.println("System.setproperty");
		Thread.sleep(2000);
		System.out.println("System.setproperty");
		Thread.sleep(1900);
		System.out.println("System.setproperty");
		
	}
	
	}
