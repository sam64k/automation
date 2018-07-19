package com.automation.utility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.steps.browsersession.Browser;

import objectProperties.ObjectProperties;

public class ObjectUtility {
	public static By by;
	public WebElement getObject(String ppt){
		String locatortype;
		String locatorvalue;
		
		locatortype= ppt.split("==>")[0];
		locatorvalue= ppt.split("==>")[1];
		
	return (Browser.session.findElement(BY(locatortype,locatorvalue)));
	}

	
	public static By BY(String locatorType,String locatorValue){
		//DataProvider.readPropertyFile(args1);
		switch(locatorType)
		{
		case "id":
			by = By.id(locatorValue);
			break;
		case "css":
			by=By.cssSelector(locatorValue);
			break;
		case "xpath":
			by=By.xpath(locatorValue);
			break;
		case "class":
			by=By.className(locatorValue);
			break;
		case "linktext":
			by=By.linkText(locatorValue);
			break;
		case "partiallinktext":
			by=By.partialLinkText(locatorValue);
			break;
		case "tagname":
			by=By.tagName(locatorValue);
			break;
		case "name":
			by=By.name(locatorValue);
			break;
		default:
			by=null;
			throw new NoSuchElementException();
		}
		return by;
	}

}
