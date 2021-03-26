package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LibGlobal2 {
	public static WebDriver driver;
	public DataTable dataTable;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();

	}

	public void loadUrl(String url) {
		driver.get(url);
		maximize();
		implicitlyWait();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void sendKey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void selctbytext(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}

	public void selectbyvalue(WebElement element, String data) {
		new Select(element).selectByValue(data);
	}

	public void selectbyindex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}

	public List<String> getOptions(WebElement element, String data) {
		List<String> l = new ArrayList<String>();
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement newOpt : options) {
			l.add(newOpt.getText());
		}
		return l;
	}

	public void submit(WebElement element) {
		element.submit();
	}

	public Map<String, String> Maps(int index) {

		List<Map<String, String>> m = dataTable.asMaps();
		Map<String, String> ma = m.get(index);
		return ma;

	}
	public String getattribute(WebElement element) {
String attribute = element.getAttribute("value");
return attribute;
	}
	public void sendkeyWithEnter(WebElement element,String data) {
element.sendKeys(data,Keys.ENTER);
}
	public void closewindow() {
		driver.close();
	}

	public String getTxt(WebElement element) {
		String text = element.getText();
		return text;

	}

	public void clear(WebElement element) {
		element.clear();

	}

	public void myAssertEquals(String s1, String s2) {
		Assert.assertEquals("Satisfied", s1, s2);
	}
	public void ConfirmAlert() {
Alert a=driver.switchTo().alert();
a.accept();
	}

}
