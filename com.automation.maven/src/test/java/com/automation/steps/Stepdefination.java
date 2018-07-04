package com.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefination {
	
	@Given("^User launches Browser \"([^\"]*)\"$")
	public void user_launches_Browser(String arg1) throws Throwable {
		System.out.println("Launch Browser");
	}

	@Then("^user loads datasheet \"([^\"]*)\"$")
	public void user_loads_datasheet(String arg1) throws Throwable {
	   System.out.println("load datasheet");
	}

	@Then("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String arg1) throws Throwable {
		System.out.println("navigates to url");
	}

	@Then("^user enter text in textbox \"([^\"]*)\"$")
	public void user_enter_textin_textbox(String arg1) throws Throwable {
	    System.out.println("enters text");
	}

	@Then("^user clicks on button \"([^\"]*)\"$")
	public void user_clicks_on_button(String arg1) throws Throwable {
		System.out.println("clicks on button");
	}

}
