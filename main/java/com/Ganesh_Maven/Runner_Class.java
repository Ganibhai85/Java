package com.Ganesh_Maven;

public class Runner_Class extends Base_Class {


	public static void main(String[] args) throws InterruptedException {
		browser_launch("Chrome");
		
		geturl("https://www.facebook.com/");
		navi("https://www.redbus.in/");
		sleep();
		navbck();
		navref();
		alert("https://demoqa.com/alerts");
		timer("timerAlertButton");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
