package org.screenpages;

import org.base.LibGlobal2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal2 {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnLoction;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtDataCheckIn;

	@FindBy(id = "datepick_out")
	private WebElement txtDataCheckOut;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getdDnLoction() {
		return dDnLoction;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtDataCheckIn() {
		return txtDataCheckIn;
	}

	public WebElement getTxtDataCheckOut() {
		return txtDataCheckOut;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void searchHotel(String hLoc, String hNam, String rTyp, String noRoom, String inDay, String outDay,
			String adult, String child) {
		selctbytext(getdDnLoction(), hLoc);
		selctbytext(getdDnHotels(), hNam);
		selctbytext(getdDnRoomType(), rTyp);
		selctbytext(getdDnNoOfRooms(), noRoom);
		sendKey(getTxtDataCheckIn(), inDay);
		sendKey(getTxtDataCheckOut(), outDay);
		selctbytext(getdDnAdultsPerRoom(), adult);
		selctbytext(getdDnChildPerRoom(), child);
		buttonClick(getBtnSearch());

	}
}
