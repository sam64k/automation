package com.automation.steps.browsersession;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxSession extends Browser {

	@Override
	public void launchbrowser() {
		System.out.println("******Launching FF browser*******");
		System.setProperty("webdriver.firefox.marionette", "/com.automation.maven/resources/driver/geckodriver.exe");
		session = new FirefoxDriver();
		session.manage().deleteAllCookies();
		session.manage().window().maximize();
		
	}

}
