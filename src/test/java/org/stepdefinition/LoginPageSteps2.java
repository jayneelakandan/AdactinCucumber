package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.LibGlobal2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.screenpages.LoginPage;
import org.screenpages.SearchHotel;
import org.screenpages.SelectHotel;
import org.screenpages.Booking;
import org.screenpages.CancelBooking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSteps2 extends LibGlobal2 {
	static int count;
	LoginPage loginpage;
	SearchHotel searchHotel;
	SelectHotel selectHotel;
	Booking booking;
	CancelBooking cancel;

	@Given("I enter the {string} and {string} in Login Page")
	public void i_enter_the_and_in_Login_Page(String user, String pass) {
		loginpage = new LoginPage();
		loginpage.loginPage(user, pass);
	}

	@Given("select the All Options of the Hotel {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void select_the_All_Options_of_the_Hotel(String hLoc, String hNam, String rTyp, String noRoom, String inDay,
			String outDay, String adult, String child, String expected) {

		searchHotel = new SearchHotel();
		searchHotel.searchHotel(hLoc, hNam, rTyp, noRoom, inDay, outDay, adult, child, expected);

	}

	@Given("select the All Options of the Hotel with Mandatory {string},{string},{string},{string},{string},{string}")
	public void select_the_All_Options_of_the_Hotel(String hLoc, String noRoom, String inDay, String outDay,
			String adult, String expected) {
		searchHotel = new SearchHotel();
		searchHotel.searchHotelMandatory(hLoc, noRoom, inDay, outDay, adult, expected);
	}

	@Given("select the Wrong Date With Valid Datas{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void select_the_Wrong_Date_With_Valid_Datas(String hLoc, String hNam, String rTyp, String noRoom,
			String inDay, String outDay, String adult, String child, String expected) {
		searchHotel = new SearchHotel();
		searchHotel.checkDate(hLoc, hNam, rTyp, noRoom, inDay, outDay, adult, child, expected);
	}

	@Given("Click Search Button {string}")
	public void click_Search_Button(String expected) {
		searchHotel = new SearchHotel();
		searchHotel.clickSearchWithoutData(expected);

	}

	@Given("select the Options of the Hotel {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void select_the_Options_of_the_Hotel(String hLoc, String hNam, String rTyp, String noRoom, String inDay,
			String outDay, String adult, String child, String expected, String fNam, String lNam, String bilAdd,
			String cardNo, String cardType, String cardxepMonth, String cardxepYear, String cardCCV, String expected1) {
		searchHotel = new SearchHotel();
		searchHotel.searchHotel(hLoc, hNam, rTyp, noRoom, inDay, outDay, adult, child, expected);
		selectHotel = new SelectHotel();
		selectHotel.selectHotel();
		booking = new Booking();
		booking.booking(fNam, lNam, bilAdd, cardNo, cardType, cardxepMonth, cardxepYear, cardCCV, expected1);
	}
	@Given("select the Options of the Hotel {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void select_the_Options_of_the_Hotel(String hLoc, String hNam, String rTyp, String noRoom, String inDay,
			String outDay, String adult, String child, String expected,String expected2) {
		searchHotel=new SearchHotel();
		searchHotel.searchHotel(hLoc, hNam, rTyp, noRoom, inDay, outDay, adult, child, expected);
		selectHotel=new SelectHotel();
		selectHotel.selectHotel();
		booking=new Booking();
		booking.bookingWithoutUserDetails(expected2);
		
	}
	@Given("Book the Hotel and cancel the Booking{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void book_the_Hotel_and_cancel_the_Booking(String hLoc, String hNam, String rTyp, String noRoom, String inDay,
			String outDay, String adult, String child, String expected, String fNam, String lNam, String bilAdd,
			String cardNo, String cardType, String cardxepMonth, String cardxepYear, String cardCCV, String expected1,String expected3) {
		searchHotel = new SearchHotel();
		searchHotel.searchHotel(hLoc, hNam, rTyp, noRoom, inDay, outDay, adult, child, expected);
		selectHotel = new SelectHotel();
		selectHotel.selectHotel();
		booking = new Booking();
		booking.booking(fNam, lNam, bilAdd, cardNo, cardType, cardxepMonth, cardxepYear, cardCCV, expected1);
		cancel=new CancelBooking();
		cancel.cancelBookId(expected3);
		
		
		
	}
	@Given("Cancel Oredr Id {string}")
	public void cancel_Oredr_Id(String expected3) {
	cancel=new CancelBooking();
	cancel.DirectCancelBooking(expected3);
		

	}

}
