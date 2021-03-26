package org.screenpages;

import org.base.LibGlobal2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends LibGlobal2{
public Booking() {
PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement txtFirstName;

@FindBy(id="last_name")
private WebElement txtLastName;

@FindBy(id="address")
private WebElement txtAddress;

@FindBy(id="cc_num")
private WebElement txtCardNo;

@FindBy(id="cc_type")
private WebElement dDnCardType;

@FindBy(id="cc_exp_month")
private WebElement dDnExpMonth;

@FindBy(id="cc_exp_year")
private WebElement dDnExpYear;

@FindBy(id="cc_cvv")
private WebElement txtCCV;

@FindBy(id="book_now")
private WebElement btnBookingNow;

public WebElement getTxtFirstName() {
	return txtFirstName;
}

public WebElement getTxtLastName() {
	return txtLastName;
}

public WebElement getTxtAddress() {
	return txtAddress;
}

public WebElement getTxtCardNo() {
	return txtCardNo;
}

public WebElement getdDnCardType() {
	return dDnCardType;
}

public WebElement getdDnExpMonth() {
	return dDnExpMonth;
}

public WebElement getdDnExpYear() {
	return dDnExpYear;
}

public WebElement getTxtCCV() {
	return txtCCV;
}

public WebElement getBtnBookingNow() {
	return btnBookingNow;
}
@FindBy(xpath = "//td[contains(text(),'Booking Confirmation ')]")
private WebElement bookConfirm;

public WebElement getBookConfirm() {
	return bookConfirm;
}
@FindBy(xpath = "//label[contains(text(),'Please Enter your First Name')]")
private WebElement fNmameError;

public WebElement getfNmameError() {
	return fNmameError;
}

@FindBy(id="radiobutton_0")
private WebElement btnSelect;

@FindBy(id="continue")
private WebElement btnSearch;

public WebElement getBtnSearch() {
	return btnSearch;
}

public WebElement getBtnSelect() {
	return btnSelect;
}

public void selectHotel() {
buttonClick(getBtnSelect());
buttonClick(btnSearch);
}


public void booking(String fNam, String lNam, String bilAdd, String cardNo, String cardType,String cardxepMonth,String cardxepYear,String cardCCV,String expected1) {
sendKey(getTxtFirstName(), fNam);
sendKey(getTxtLastName(), lNam);
sendKey(getTxtAddress(), bilAdd);
sendKey(getTxtCardNo(), cardNo);
selctbytext(getdDnCardType(), cardType);
selctbytext(getdDnExpMonth(), cardxepMonth);
selctbytext(getdDnExpYear(), cardxepYear);
sendKey(getTxtCCV(), cardCCV);
buttonClick(getBtnBookingNow());
String txt = getTxt(getBookConfirm());
myAssertEquals(expected1, txt);

}

public void bookingWithoutUserDetails(String expected2) {
	buttonClick(getBtnBookingNow());
	String txt = getTxt(getfNmameError());
	myAssertEquals(expected2, txt);
}
}
