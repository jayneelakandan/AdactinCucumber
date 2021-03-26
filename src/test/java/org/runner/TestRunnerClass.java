package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"org.stepdefinition"},dryRun = false,monochrome = true,plugin= {"json:src\\test\\resources\\Reports\\jsonfile.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterClass()
	{
	JVMReport.generateReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\jsonfile.json");	

	}	
} 
