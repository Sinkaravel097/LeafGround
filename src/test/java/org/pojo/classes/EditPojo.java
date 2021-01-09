package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPojo extends Base{

	public EditPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//h5[text()='Edit']")
	private WebElement edit;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//input[@value='Append ']")
	private WebElement append;
	
	@FindBy(xpath="(//input[@name='username'])[1]")
	private WebElement getDefault;
	
	@FindBy(xpath="(//input[@name='username'])[2]")
	private WebElement clearText;
	
	@FindBy(xpath="//input[@disabled='true']")
	private WebElement editField;
	
	
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getAppend() {
		return append;
	}

	public WebElement getGetDefault() {
		return getDefault;
	}

	public WebElement getEditField() {
		return editField;
	}

	public WebElement getClearText() {
		return clearText;
	}

	public WebElement getEdit() {
		return edit;
	}
}
