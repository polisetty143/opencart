package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {
	
	
	
	@Test(groups={"regression","master"})
	public void test_account_Registration()
	{
		
		logger.info("Starting TC_001_AccountRegistration ");
		try {
		
		driver.get(rb.getString("appURL"));
		logger.info("Home page is displayed");
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on my account");
		
		hp.clickRegister();
		logger.info("Clicked on Register");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstName("John");
		logger.info("Provided First Name");
		
		regpage.setLastName("Canedy");
		logger.info("Provided Last Name");
		
		regpage.setEmail(randomestring()+"@gmail.com");
		logger.info("Provided Email");
		
		
		regpage.setTelephone("84091805");
		logger.info("Provided Telephone");
		
		
		regpage.setPassword("testing123");
		logger.info("Provided password");
		
		
		regpage.setPasswordConfirm("testing123");
		logger.info("Provided password");
		
		regpage.setPrivacyPolicy();
		regpage.ClickContinue();
		logger.info("Clicked on continue");
		
		String confmsg=regpage.getConfirmationmsg();
		//System.out.println(confmsg);
		if(confmsg.equals("Register Account"))
		{
			Assert.assertTrue(true);
			logger.info("Account Registration Success");
		}
		else
		{
			logger.error("Account Registration is Failed");
			captureScreen(driver,"test_account_Registration");   //screenshot
			Assert.assertTrue(false);
		    
		}
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.error("Account Registration is Failed");
		}
		
		
		logger.info("Finished TC_001_AccountRegistration ");
		
	}
	
	
	

}
