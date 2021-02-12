package testNG_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verifications 
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
		System.out.println(driver.getTitle());
		String ActualTitle=driver.getTitle();
		
		//Assert.assertEquals(ActualTitle, expectedTitle);
		Assert.assertNotEquals(ActualTitle, expectedTitle);
		System.out.println("tushar");
	}
	@Test
	public void aman()
	{
		System.out.println("Amit");
	}
	@Test
	public void zakirkhan()
	{
		System.out.println("Zakirkhan");
	}
}
