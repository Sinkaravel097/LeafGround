package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPojo extends Base{
	
	public ButtonPojo() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h5[text()='Button']")
	private WebElement btn;
	
	@FindBy(xpath="//button[text()='Go to Home Page']")
	private WebElement goToHome;
	
	

	public WebElement getBtn() {
		return btn;
	}
	

}
