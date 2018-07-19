package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.automation.steps.browsersession.Browser;
import com.automation.steps.browsersession.BrowserType;
import com.automation.steps.browsersession.ChromeSession;
import com.automation.steps.browsersession.FirefoxSession;
import com.automation.steps.browsersession.IESession;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import objectProperties.ObjectProperties;

public class Stepdefination {
	Browser browser;
	
	@Given("^User launches Browser \"([^\"]*)\"$")
	public void user_launches_Browser(String browserName) throws Throwable {
		System.out.println("Launch Browser");
		if(BrowserType.valueOf(browserName)==BrowserType.CHROME){
			browser=new ChromeSession();
			browser.launchbrowser();
		}
		else if(BrowserType.valueOf(browserName)==BrowserType.FIREFOX){
			browser = new FirefoxSession();
			browser.launchbrowser();
		}
		else if(BrowserType.valueOf(browserName)==BrowserType.IE){
			browser = new IESession();
			browser.launchbrowser();
		}
		else{
			System.out.println("Browser not defined or launched");
		}
		
	}

	@Then("^user loads datasheet \"([^\"]*)\"$")
	public void user_loads_datasheet(String arg1) throws Throwable {
	   System.out.println("load datasheet");
	}

	@Then("^User navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) throws Throwable {
		System.out.println("navigates to url");
		browser.navigateToURL(url);
	}

	@Then("^user enter text in textbox \"([^\"]*)\"$")
	public void user_enter_textin_textbox(String arg1) throws Throwable {
	    System.out.println("enters text");
	    ObjectProperties.Uname.getProperty();
	    StringBuilder querystr = new StringBuilder();
	    querystr.append("test string");
	    
	    //JavascriptExecutor js = ((JavascriptExecutor)) Browser.session;
	    //js.executeScript(arg1);
	    //js.
	    //browser.session.getobject(ObjectProperties.Uname.getProperty()).sendKeys();
	    
	    
	}

	@Then("^user clicks on button \"([^\"]*)\"$")
	public void user_clicks_on_button(String arg1) throws Throwable {
		System.out.println("clicks on button");
	}

}
