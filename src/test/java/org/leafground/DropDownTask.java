package org.leafground;

import java.util.List;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.classes.DropDownPojo;

public class DropDownTask extends Base {
	
	@BeforeClass
	public static void launchBrowser() {
		
		chrome();
		launchUrl("http://www.leafground.com/");
		maxWindow();
	}
	
	@Test
	public void tc1() {
		
		DropDownPojo d = new DropDownPojo();
		clickAny(d.getDropDown());
		selectByIndexUsingId(d.getDropDownIndex(), 1);
		selectByVisibleTextUsingXpath(d.getDropDownTxt(), "Appium");
		selectByStringUsingId(d.getDropDownValue(), "4");
		int dropDownSize = dropDownSize(d.getValuesSize());
		System.out.println("Total Options In Drop Down : "+dropDownSize);
//		findEle(d.getSendValue(), "UFT/QTP");
		WebElement drp = driver.findElement(By.xpath("(//div[@class='example'])[5]"));
//		drp.sendKeys("Appium");
		String text = drp.getText();
		System.out.println(text);
		drp.sendKeys("Appium");
		
	}

}
