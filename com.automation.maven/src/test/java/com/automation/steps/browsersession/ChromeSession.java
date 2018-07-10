package com.automation.steps.browsersession;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSession extends Browser{

	@Override
	public void launchbrowser() {
		System.out.println("******Launching Chrome browser*******");
		System.setProperty("webdriver.chrome.driver", "/com.automation.maven/resources/driver/chromedriver.exe");
		session = new ChromeDriver();
		
		session.manage().deleteAllCookies();
		session.manage().window().maximize();
		
	}

}
