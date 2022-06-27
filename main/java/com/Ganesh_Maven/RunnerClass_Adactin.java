package com.Ganesh_Maven;

public class RunnerClass_Adactin extends BaseClass_Adactin{
	public static void main(String[] args) throws Exception {
		
		browser_launch("Chrome");
		geturl("https://adactinhotelapp.com/");
		username("username", "Ganibhai123");
		password("password", "EXWD3S");
		login("login");
		location("location", "Melbourne");
		hotels("hotels", "Hotel Sunshine");
		roomtype("room_type", "Deluxe");
		noofrooms("room_nos", "2");
		checkin("datepick_in", "22/06/2022");
		checkout("datepick_out", "24/06/2022");		
		adultsperroom("adult_room", "2");
		childperroom("child_room", "1");
		search("Submit");
		selecthotel("radiobutton_0");
		continu("continue");
		firstname1("first_name", "Ganesh Kumar");
		lastname1("last_name", "Jaya Kumar");
		address("address", "No;134-68,Abacus Apartment,Hillrov Lane,Melbourne-234568");
		ccnum("cc_num", "7654896723419534");
		cctype("cc_type", "AMEX");
		expirymonth("cc_exp_month", "12");
		expiryyear("cc_exp_year", "2022");
		cvvnum("cc_cvv", "578");
		booknow("book_now");
		logout("logout");
		scrnshot();
	
		
		}
}