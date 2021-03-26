package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateReport(String jsonFile) {
		Configuration c = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"), "Adactin Booking");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("Browser Version", "89");
		c.addClassifications("Sprint", "50");
		c.addClassifications("OS", "Windows 8");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder r = new ReportBuilder(jsonFiles, c);
		r.generateReports();
	}
}
