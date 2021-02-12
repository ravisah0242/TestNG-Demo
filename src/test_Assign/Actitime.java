package test_Assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import assignment.ActitimeHomePage;
import assignment.ActitimeLoginPage;
import assignment.Delete_Work;
import assignment.TypeofWork;

public class Actitime 
{	
	public WebDriver driver;
	//@Test(groups="Smoke") 
	@Test(groups="Regration",priority=1,invocationCount=1) 
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	
	@Test(groups="Regration",priority=2,invocationCount=2)
	public void createWork() throws InterruptedException
	{
		TypeofWork work=new TypeofWork(driver);
		work.popupmenuMethod();
		work.typeofworkMethod();
		work.createtypeofworkMethod();
		work.namecreatetypeofworkMethod();
		work.submitMethod();
	}
	/*@Test(groups="Regration",priority=3)
	public void deleteWork() throws InterruptedException
	{
		Delete_Work delete=new Delete_Work(driver);
		delete.deleteHRManagerMethod();
	}*/
	
}
