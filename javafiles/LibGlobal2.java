package org.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

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

}
