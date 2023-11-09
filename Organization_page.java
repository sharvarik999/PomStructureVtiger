package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Organization_page {
	
	
		@FindBy(name="accountname")
		private WebElement orgTF;

		public WebElement getOrgTF() {
			return orgTF;
		}
		
		@FindBy(xpath="(//input[@name='assigntype'])[2]")
		private WebElement Asssigntobtn;

		public WebElement getAsssigntobtn() {
			return Asssigntobtn;
		}
		
		@FindBy(name="assigned_group_id")
		private WebElement Assingtodrop;

		public WebElement getAssingtodrop() {
			return Assingtodrop;
		}
	     
		@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
		private WebElement saveBTN;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement imagebtn;

		public WebElement getSaveBTN() {
			return saveBTN;
		}

		public WebElement getImagebtn() {
			return imagebtn;
		}
	}


