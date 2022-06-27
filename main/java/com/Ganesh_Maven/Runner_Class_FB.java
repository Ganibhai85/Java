package com.Ganesh_Maven;

public class Runner_Class_FB extends Base_Class_FB {
	public static void main(String[] args) {
		browser_launch("Chrome");
		implicit();
		geturl("https://www.facebook.com/");
		phno("email", "9597474503");
		pass("pass", "attitude@1985");
		login("login");
		out("FaceBook Login Successfull");	
		
	}
}
