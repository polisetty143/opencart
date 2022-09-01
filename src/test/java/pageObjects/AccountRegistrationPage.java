package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-firstname")
	WebElement txtFirstname;
	
	
	@FindBy(id="input-lastname")
	WebElement txtLasttname;
	
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(id="input-telephone")
	WebElement txtTelephone;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(id="input-confirm")
	WebElement txtPasswordConfirm;
	
	@FindBy(name="agree")
	WebElement chkdpolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(css="div[id='content'] h1")
	WebElement msgConfirmation;
	
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLasttname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	public void setPassword(String pwd)
	{
		txtFirstname.sendKeys(pwd);
	}
	public void setPasswordConfirm(String cnfpwd)
	{
		txtFirstname.sendKeys(cnfpwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkdpolicy.click();;
	}
	
	public void ClickContinue()
	{
		btnContinue.click();
	}
	
	public String getConfirmationmsg()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch (Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
}
	
	
	


