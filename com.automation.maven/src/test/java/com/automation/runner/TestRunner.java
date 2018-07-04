package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features={"feature"},
	glue={"com.automation.steps"},
	tags={"@POC1"},
	//format={"pretty","html:target/Report"},
	monochrome=true,
	dryRun = false
	//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)
public class TestRunner {

}
