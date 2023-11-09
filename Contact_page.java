package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_page {

	@FindBy(name="firstname")
	private WebElement firstnm;
	
	@FindBy(name="lastname")
	private WebElement lastnm;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement aasigntoBTN;
	
	@FindBy(name="assigned_group_id")
	private WebElement assigntoDRop;
	
	@FindBy(xpath="(//input[@name='button'])[1]")
	private WebElement Savebtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement imgbtn;

	public WebElement getFirstnm() {
		return firstnm;
	}

	public WebElement getLastnm() {
		return lastnm;
	}

	public WebElement getAasigntoBTN() {
		return aasigntoBTN;
	}

	public WebElement getAssigntoDRop() {
		return assigntoDRop;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}

	public WebElement getImgbtn() {
		return imgbtn;
	
	
	
}
}
