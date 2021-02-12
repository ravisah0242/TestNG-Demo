package test_Assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import assignment.ActitimeLoginPage;
import assignment.Delete_Work;
import assignment.TypeofWork;

public class ACTITIME1 
{
	public WebDriver driver;
	
	//@Test(groups="Smoke", priority=1)
	
	
	@Test(groups="DependMethod",priority=1)
		
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		//Assert.fail();
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
		//Assert.fail();
	}
	
	//@Test(groups="Smoke",priority=2,invocationCount=2)
	//@Test(groups="DependMethod",dependsOnMethods="login")
	//@Test(groups="DependMethod",dependsOnMethods="createWork")    //TestNGException:
	@Test(groups="DependMethod",priority=2,dependsOnMethods="login")
	public void createWork() throws InterruptedException
	{
		TypeofWork work=new TypeofWork(driver);
		work.popupmenuMethod();
		work.typeofworkMethod();
		work.createtypeofworkMethod();
		work.namecreatetypeofworkMethod();
		work.submitMethod();
	}
	//@Test(groups="DependMethod",dependsOnMethods="createWork")
	//@Test(groups="DependMethod",dependsOnMethods= {"login","createWork"})
	//@Test(groups="DependMethod",dependsOnMethods="createWork") 	//TestNGException:
	@Test(groups="DependMethod",priority=3,dependsOnMethods="createWork")
	public void deleteWork() throws InterruptedException
	{
		Delete_Work delete=new Delete_Work(driver);
		delete.deleteHRManagerMethod();
	}
}