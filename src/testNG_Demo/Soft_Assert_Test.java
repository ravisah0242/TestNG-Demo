package testNG_Demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Test 
{
	public WebDriver driver;
	
	@Test
	public void verifyloginpage()
	{		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String expectedTitle="Saniya";
		String ActualTitle=driver.getTitle();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(ActualTitle, expectedTitle);
		
		System.out.println("tushar");
		//s.assertAll();
		System.out.println("Shaniya");
		s.assertAll();
	}
	@Test
	public void zakirkhan()
	{
		System.out.println("Zakirkhan");
	}
}
