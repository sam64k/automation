package com.automation.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"feature"},
	glue={"com.automation.steps"},
	tags={"@POC1"},
	//format={"pretty","html:target/Report"},
	monochrome=true,
	dryRun = false,
	plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)
public class TestRunner {
	@AfterClass
	public static void generateExtentReport(){
	Reporter.loadXMLConfig(new File("C:\\Users\\IBM_ADMIN\\GIT-Maven\\com.automation.maven\\resources\\extent-report-config\\extent-config.xml"));
	}
}
