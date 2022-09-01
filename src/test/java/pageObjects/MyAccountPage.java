package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="aside[id='column-right'] a:nth-child(1)")
	WebElement lnkLogout;
	
	public void clickLogout()
	{
		
		lnkLogout.click();
	}
	
	
	
	
	
	
	
	
	

}
