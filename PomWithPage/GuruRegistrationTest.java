package PomWithPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuruRegistrationTest {

	//setup
	
   WebDriver driver;
	
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\version\\\\chromedriver_win32\\\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/insurance/v1/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void RegistrationTest() throws InterruptedException {
		GuruRegistration gr=new GuruRegistration(driver);
		
		Thread.sleep(2000);
		gr.clickRegisterLink();
		Thread.sleep(2000);
		gr.setuserTitle();
		Thread.sleep(2000);
		gr.setFirstname();
		Thread.sleep(2000);
		gr.setSurname();
		Thread.sleep(2000);
		gr.setPhone();
		Thread.sleep(2000);
		gr.setRegistrationPageBirthYear();
		Thread.sleep(2000);
		gr.setRegistrationPageBirthMonth();
		Thread.sleep(2000);
		gr.setRegistrationPageBirthDay();
		Thread.sleep(2000);
		gr.setProtype("Full");
		Thread.sleep(2000);
		gr.setPeriod();
		Thread.sleep(2000);
		gr.setOccupation();
		Thread.sleep(2000);
		gr.setAddress();
		Thread.sleep(2000);
		gr.setCity();
		Thread.sleep(2000);
		gr.setCountry();
		Thread.sleep(2000);
		gr.setPostalCode();
		Thread.sleep(2000);
		gr.setEmailid();
		Thread.sleep(2000);
		gr.setPassword();
		Thread.sleep(2000);
		gr.setConfirmPassword();
		Thread.sleep(2000);
		gr.clickCreateBtn();
		
		
	}
	
	
}