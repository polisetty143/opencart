package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@id='input-email']")
		WebElement txtEmailAddress;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement btnLogin;
		
		@FindBy(css="h2:nth-child(1)")
		WebElement msgHeading;
		
		
		public void setEmailAddress(String email)
		{
			txtEmailAddress.sendKeys(email);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void clickbtnLogin()
		{
			btnLogin.click();
		}
		public boolean isMyAccountPageExists()
		{
			try
			{
			   return(msgHeading.isDisplayed());
			}
			catch(Exception e)
			{
			    return(false);
		    
			}
			
			
				
				
		}

	}


