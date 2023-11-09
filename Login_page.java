package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page {

	@FindBy(xpath="//input[@type='text']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Login;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}
}
