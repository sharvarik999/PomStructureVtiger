package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page {
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
   private  WebElement clickORG;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement imageORG;

	public WebElement getClickORG() {
		return clickORG;
	}

	public WebElement getImageORG() {
		return imageORG;
	}

	
	}


