package org.screenpages;

import org.base.LibGlobal2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal2 {
public SelectHotel() {
PageFactory.initElements(driver, this);
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
}
