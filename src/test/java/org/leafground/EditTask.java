package org.leafground;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.Base;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.classes.EditPojo;

public class EditTask extends Base{

	@BeforeClass
	public static void launchBrowser() {
		firefox();
	}
	
	@Test
	public void tc1() throws AWTException, IOException {
		
		launchUrl("http://www.leafground.com/");
		
		EditPojo e = new EditPojo();
		
		clickAny(e.getEdit());		
		
		findEle(e.getEmail(), "abc@gmail.com");
		
		String attr = getAttr(e.getGetDefault());
		System.out.println("Default Text : "+attr);
				
		findEle(e.getAppend(), "Selenium");
		
		clear(e.getClearText());
		
		WebElement enable = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = enable.isEnabled();
		System.out.println(enabled);

		
		
		
		
		
	}

}
