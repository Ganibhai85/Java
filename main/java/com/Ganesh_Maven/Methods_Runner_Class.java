package com.Ganesh_Maven;

public class Methods_Runner_Class extends Methods_Base_Class {

	public static void main(String[] args) throws Exception {
		browser_launch("Chrome");
		implicit();
		geturl("https://demoqa.com/buttons");
        /*textbox("(//span[@class='text'])[1]");
        name("userName", "Ganesh Kumar.J");
        email("userEmail", "meetganesh85@gmail.com");
        checkbox("(//span[@class='text'])[2]");
        home("//span[@class='rct-checkbox']");
		radiobtn("//li[@id='item-2'][1]");
		implicit1();*/
		mouseaction("//span[text()='Buttons']");
		doubleclick("doubleClickBtn");
	}
}
