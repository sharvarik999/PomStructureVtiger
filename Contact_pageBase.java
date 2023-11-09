package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.ExcelUtils;
import CommonUtils.PropertyFileUtils;
import CommonUtils.WebDriverUtils;

public class Contact_pageBase {

	
		
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
	         
			final WebDriver driver;
			
			   PropertyFileUtils futils = new PropertyFileUtils();
			   WebDriverUtils wutils = new WebDriverUtils();
			   ExcelUtils eutils = new ExcelUtils();
			
			 
			    //to read data from property file
				String BROWSER = futils.getDataFromPropertyFile("Browser");
				String Url = futils.getDataFromPropertyFile("url");
				String USERNAME =futils.getDataFromPropertyFile("Username");
				String PASSWORD = futils.getDataFromPropertyFile("Password");
				
				//to read data from excel file
				String FIRSTNAME = eutils.getDataFromExcelFile("Sheet1", 1, 3);
				String LASTNAME = eutils.getDataFromExcelFile("Sheet1", 1, 0);
				String DROP = eutils.getDataFromExcelFile("Sheet1", 1, 2);
				
				if(BROWSER.equalsIgnoreCase("Chrome")) 
				{
				driver=new ChromeDriver();
				
				}
				else if (BROWSER.equalsIgnoreCase("Edge"))
				{
					driver=new EdgeDriver();
				}
				else 
				{
					driver=new FirefoxDriver();
				}
		       
				wutils.maximize(driver);
				wutils.implicitwait(driver);
			
				driver.get(Url);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
			
				Login_page lp = new Login_page();
				PageFactory.initElements(driver, lp);
				lp.getUsername().sendKeys(USERNAME);
				lp.getPassword().sendKeys(PASSWORD);
				lp.getLogin().click(); 
				
				Home_conPage hp = new Home_conPage();
				PageFactory.initElements(driver, hp);
				hp.getClickCON().click();
				hp.getClickImg().click();
				
				Contact_page cp = new Contact_page();
				PageFactory.initElements(driver, cp);
				cp.getFirstnm().sendKeys(FIRSTNAME);
				cp.getLastnm().sendKeys(LASTNAME);
				cp.getAasigntoBTN().click();
				
				wutils.handledropdown(cp.getAssigntoDRop(), DROP);
				cp.getSavebtn().click();
				
				wutils.mousehover(driver, cp.getImgbtn());
		}

	}
	
