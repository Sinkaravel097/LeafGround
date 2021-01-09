package org.leafground;

import org.base.Base;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.classes.ButtonPojo;

public class ButtonTask extends Base{
	
	@BeforeClass
	public static void launchBrowser() {
		chrome();
		launchUrl("http://www.leafground.com/");
		maxWindow();

	}

	@Test
	public void tc1() {
		ButtonPojo b = new ButtonPojo();
		clickAny(b.getBtn());
	}

}
