package org.screenpages;

import org.base.LibGlobal2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends LibGlobal2{
public CancelBooking() {
PageFactory.initElements(driver, this);
}

@FindBy(id="my_itinerary")
private WebElement buttonItenarary;

@FindBy(id="order_no")
private WebElement orderNo;

@FindBy(id="order_id_text")
private WebElement searchOrderId;

@FindBy(name="ids[]")
private WebElement checkOrderId;

@FindBy(xpath="//input[@type='button']")
private WebElement cancelSelected;

@FindBy(xpath="//input[@type='button']")
private WebElement DirectCancelSelected;

public WebElement getDirectCancelSelected() {
	return DirectCancelSelected;
}

@FindBy(xpath = "//a[contains(text(),'Booked Itinerary')]")
private WebElement iterenary;

@FindBy(id="search_result_error")
private WebElement iterenaryError;

public WebElement getIterenary() {
	return iterenary;
}

public WebElement getButtonItenarary() {
	return buttonItenarary;
}

public WebElement getOrderNo() {
	return orderNo;
}

public WebElement getSearchOrderId() {
	return searchOrderId;
}

public WebElement getCheckOrderId() {
	return checkOrderId;
}

public WebElement getCancelSelected() {
	return cancelSelected;
}

public WebElement getIterenaryError() {
	return iterenaryError;
}

public void cancelBookId(String expected3) {
String txt = getTxt(getOrderNo());
String getattribute = getattribute(getOrderNo());
System.out.println(getattribute);
System.out.println(txt);
buttonClick(getButtonItenarary());
sendkeyWithEnter(getSearchOrderId(), getattribute);
buttonClick(getCancelSelected());
ConfirmAlert();
String txt2 = getTxt(getIterenaryError());
myAssertEquals(expected3, txt2);

}
public void DirectCancelBooking(String expected3) {
buttonClick(getIterenary());
buttonClick(getDirectCancelSelected());
ConfirmAlert();
String txt = getTxt(getIterenaryError());
myAssertEquals(expected3, txt);
}
}
