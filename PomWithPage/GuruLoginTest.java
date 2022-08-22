package PomWithPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GuruLoginTest {
	
   WebDriver driver;
	
	//setup
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
	public void registrationTest() {
		
		GuruLogin GL=new GuruLogin(driver);
		GL.verifyHeading();
		GL.setEmailid();
		GL.setPassword();
		GL.clickBtn();
	}
}
