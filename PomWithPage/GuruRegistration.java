package PomWithPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class GuruRegistration {
	
	//declaration
	
	@FindBy(xpath="//a[@href='register.php']")private WebElement reglink;
	@FindBy(xpath="//input[@id='user_firstname']")private WebElement firstnm;
	@FindBy(xpath="//input[@id='user_surname']")private WebElement userSurnm;
	@FindBy(xpath="//input[@id='user_phone']")private WebElement userPhone;
	@FindBy(xpath="//input[@name='street']")private WebElement userStreet;
	@FindBy(xpath="//input[@name='city']")private WebElement userCity;
	@FindBy(xpath="//input[@name='county']")private WebElement userCountry;
	@FindBy(xpath="//input[@name='post_code']")private WebElement userPCode;
	@FindBy(xpath="//input[@name='email']")private WebElement userEmail;
	@FindBy(xpath="//input[@name='password']")private WebElement userPassword;
	@FindBy(xpath="//input[@name='c_password']")private WebElement userCPassword;
	@FindBy(xpath="//input[@id='resetform']")private WebElement restBtn;
	@FindBy(xpath="//input[@name='submit']")private WebElement createBtn;
	@FindBy(xpath="//select[@id='user_title']")private WebElement userTitle;
	@FindBy(xpath="//select[@name='year']")private WebElement birthyear;
	@FindBy(xpath="//select[@name='month']")private WebElement birthmonth;
	@FindBy(xpath="//select[@name='date']")private WebElement birthday;
	@FindBy(xpath="//select[@name='licenceperiod']")private WebElement period;
	@FindBy(xpath="//input[@id='licencetype_t']")private WebElement fullRadiobtn;
	@FindBy(xpath="//input[@id='licencetype_f']")private WebElement provisBtn;
	@FindBy(xpath="//select[@id='user_occupation_id']")private WebElement occupation;
	
	//initialization
	
	public GuruRegistration(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	
	public void clickRegisterLink() {
		reglink.click();
	}
	
	
	public void setFirstname() {
		Assert.assertTrue(firstnm.isDisplayed(),"firstname is not displayed");
		firstnm.sendKeys("paresh");
		Reporter.log("setFirstname",true);
	}
	
	public void setSurname() {
		Assert.assertTrue(userSurnm.isDisplayed(),"surname is not displayed");
		userSurnm.sendKeys("chaudhari");
		Reporter.log("setSurname",true);
	}
	
	public void setPhone() {
		Assert.assertTrue(userPhone.isDisplayed(),"phone number is not  displayed");
		Assert.assertTrue(userPhone.isEnabled(),"phone number is not enabled");
		userPhone.sendKeys("7498758605");
		Reporter.log("setPhone",true);
	}
	
	public void setAddress() {
		Assert.assertTrue(userStreet.isDisplayed(),"adress is not displayed");
		userStreet.sendKeys("AKOLA");
		Reporter.log("setAddress",true);
	}
	
	public void setCity() {
		Assert.assertTrue(userCity.isDisplayed(),"city is not displayed");
		userCity.sendKeys("AKOLACity");
		Reporter.log("setCity",true);
	}
	
	public void setCountry() {
		Assert.assertTrue(userCountry.isDisplayed(),"country is not displayed");
		userCountry.sendKeys("INDIA");
		Reporter.log("setCountry",true);
	}
	
	public void setPostalCode() {
		Assert.assertTrue(userPCode.isDisplayed(),"postal code is not displayed");
		userPCode.sendKeys("444001");
		Reporter.log("setPostalCode",true);
	}
	
	
	public void setEmailid() {
		Assert.assertTrue(userEmail.isDisplayed(),"emailid is not displayed");
		userEmail.sendKeys("nano123@gmail.com");
		Reporter.log("setEmailid",true);
	}
	
	public void setPassword() {
		Assert.assertTrue(userPassword.isDisplayed(),"password is not displayed");
		userPassword.sendKeys("nano123@gmail.com");
		Reporter.log("setPassword",true);
	}

	public void setConfirmPassword() {
		Assert.assertTrue(userCPassword.isDisplayed(),"confirm password is not displayed");
		userCPassword.sendKeys("nano123@gmail.com");
		Reporter.log("setConfirmPassword",true);
	}
	
	public void clickRestbtn() {
		Assert.assertTrue(restBtn.isEnabled(),"reset button is enabled");
		restBtn.click();
		Reporter.log("clickRestbtn",true);
	}

	public void clickCreateBtn() {
		Assert.assertTrue(createBtn.isEnabled(),"createt button is enabled");
		createBtn.click();
		Reporter.log("clickCreateBtn",true);
	}
	
	public void setRegistrationPageBirthDay() {
		Select bday=new Select(birthday);
		
		Assert.assertTrue(birthday.isDisplayed(),"the birthday option is not displayed on registration page");
		Assert.assertFalse(birthday.isSelected());
		bday.selectByVisibleText("6");
	}
	
	public void setRegistrationPageBirthMonth() {
		Select bmonth=new Select(birthmonth);
		
		Assert.assertTrue(birthmonth.isDisplayed(),"the birthmonth option is not displayed on registration page");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("March");
	}
	
	public void setRegistrationPageBirthYear() {
		Select byear=new Select(birthyear);
		
		Assert.assertTrue(birthyear.isDisplayed(),"the birthyear option is not displayed on registration page");
		Assert.assertFalse(birthyear.isSelected());
		byear.selectByVisibleText("1955");
	}
	public void setuserTitle() {
		Select utitle=new Select(userTitle);
		Assert.assertTrue(userTitle.isDisplayed(),"title is dispalyed");
		utitle.selectByVisibleText("Sir");
	    Reporter.log("setuserTitle",true);
	}
	
	public void setPeriod() {
		Select speriod=new Select(period);
		Assert.assertTrue(period.isDisplayed(),"period is dispalyed");
	//	Assert.assertTrue(period.isSelected());
		speriod.selectByVisibleText("10");
		Reporter.log("setPeriod",true);
	}
	
	public void setOccupation() {
		Select accocup=new Select(occupation);
		Assert.assertTrue(occupation.isDisplayed(),"occupation is dispalyed");
	//	Assert.assertTrue(occupation.isSelected());
		accocup.selectByVisibleText("Teacher");
		Reporter.log("setOccupation",true);
	}
	
	public void setProtype(String type) {
		if(type.equals("Full")) {
			fullRadiobtn.click();
		}else if(type.equals("Provisional")){
			provisBtn.click();
		}else {
			System.out.println("wrong input");
		}
	}
	
	
	}
		
	
	

