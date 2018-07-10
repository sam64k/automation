package com.automation.steps.browsersession;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IESession extends Browser {

	@Override
	public void launchbrowser() {
		System.out.println("******Launching IE browser*******");
		System.setProperty("webdriver.ie.driver", "/com.automation.maven/resources/driver/IEDriverServer.exe");
		session=new InternetExplorerDriver();
		session.manage().deleteAllCookies();
		session.manage().window().maximize();
		
	}

}
