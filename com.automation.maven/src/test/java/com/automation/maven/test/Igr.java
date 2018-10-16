package com.automation.maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Igr {
	
	public static void main(String args[]){
		WebDriver session;
		System.setProperty("webdriver.firefox.marionette", "/com.automation.maven/resources/driver/geckodriver.exe");
		session = new FirefoxDriver();
		session.findElement(By.id("txtCaptcha"));
		System.out.println("Push to master123");
	}

}
