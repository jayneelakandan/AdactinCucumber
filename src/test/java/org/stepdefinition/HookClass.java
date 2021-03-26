package org.stepdefinition;

import org.base.LibGlobal2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends LibGlobal2{
@Before
public void beforeScenario() {
	getDriver();
	loadUrl("https://adactinhotelapp.com/");
}

@After
public void afterScenario(Scenario s) {
TakesScreenshot ts=(TakesScreenshot) driver;
byte[] b = ts.getScreenshotAs(OutputType.BYTES);
s.embed(b, "img/pass");
closewindow();

}
}
