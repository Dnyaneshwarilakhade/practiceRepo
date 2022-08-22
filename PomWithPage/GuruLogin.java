package PomWithPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class GuruLogin {

	//declaration
	@FindBy(xpath="//h3[text()='Login']")private WebElement heading;
	@FindBy(xpath="//input[@id='email']")private WebElement emailid;
	@FindBy(xpath="//input[@id='password']")private WebElement passwrd;
	@FindBy(xpath="//input[@type='submit']")private WebElement submitbtn;
	
	//initialization
	
	public GuruLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	
	public void verifyHeading() {
		Assert.assertTrue(heading.isDisplayed(),"heading not displayed");
	}
	

	public void setEmailid() {
		Assert.assertTrue(emailid.isDisplayed(),"email not displayed");
		emailid.sendKeys("Paresh");
		Reporter.log("setEmailid",true);
	}
	
	public void setPassword() {
		Assert.assertTrue(passwrd.isDisplayed(),"passwrd not displayed");
		passwrd.sendKeys("paresh123");
		Reporter.log("setPassword",true);
	}
	public void clickBtn() {
		Assert.assertTrue(submitbtn.isDisplayed(),"clickbtn is displayed");
		Assert.assertTrue(submitbtn.isEnabled(),"Clickbtn is Enabled");
		submitbtn.click();
	}
	
}
