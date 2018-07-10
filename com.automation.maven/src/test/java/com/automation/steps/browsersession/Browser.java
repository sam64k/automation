package com.automation.steps.browsersession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Browser {
	public static WebDriver session;
	final int IMPLICIT_WAIT=60;
	
	Browser(){
		session=null;
	}
	public abstract void launchbrowser();
	public void navigateToURL(String url){
		session.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		session.get(url);
	}
	public void closeBrowserSession(){
		if(session != null)
		{
			session.quit();
			System.out.println("******Browser session closed*******");
		}
	}
	public static void waitForPageLoad(WebDriver driver){
		ExpectedCondition<Boolean> pageLoadFlag = new ExpectedCondition <Boolean>(){

			public Boolean apply(WebDriver driver) {
				System.out.println("Waiting for page load...");
				// TODO Auto-generated method stub
				return ((JavascriptExecutor)session).executeScript("return document.readyState").equals("complete");
			}
			
		};
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(pageLoadFlag);
	}
	public static byte[] getScreenshot(){
		waitForPageLoad(session);
		return ((TakesScreenshot)session).getScreenshotAs(OutputType.BYTES);
	}
}
