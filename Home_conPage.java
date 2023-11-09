package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_conPage {
	
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement clickCON;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement clickImg;

	public WebElement getClickCON() {
		return clickCON;
	}

	public WebElement getClickImg() {
		return clickImg;
	}

}
