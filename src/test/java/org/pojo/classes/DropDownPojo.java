package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPojo extends Base {
	
	public DropDownPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//h5[text()='Drop down']")
	private WebElement dropDown;
	
	@FindBy(id="dropdown1")
	private WebElement dropDownIndex;
	
	@FindBy(name="dropdown2")
	private WebElement dropDownTxt;
	
	@FindBy(id="dropdown3")
	private WebElement dropDownValue;
	
	@FindBy(xpath="//select[@class='dropdown']")
	private WebElement valuesSize;
	
	@FindBy(tagName="(//select)[5]")
	private WebElement sendValue;
	

	
	public WebElement getSendValue() {
		return sendValue;
	}

	public WebElement getValuesSize() {
		return valuesSize;
	}

	public WebElement getDropDownValue() {
		return dropDownValue;
	}

	public WebElement getDropDownTxt() {
		return dropDownTxt;
	}

	public WebElement getDropDownIndex() {
		return dropDownIndex;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

}
