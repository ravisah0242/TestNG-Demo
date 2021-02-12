package testNG_Demo;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	@Test
	public void reena()
	{
		Reporter.log("Reena",true);
	}
	@Test
	public void richa()
	{
		Reporter.log("Richa",true);
	}
	@Test
	public void purva()
	{
		Reporter.log("Purva",true);
	}
	@BeforeMethod
	public void gaziabad()
	{
		Reporter.log("Gaziabad"+":-@BeforeMethod",true);
	}
	@BeforeMethod
	public void noida()
	{
		Reporter.log("noida"+":-@BeforeMethod",true);
	}
	@BeforeClass
	public void faridabad()
	{
		Reporter.log("Faridabad"+" :- @BeforeClass",true);
	}
	@BeforeSuite 
	public void agra()
	{
		Reporter.log("Agra"+" :- @BeforeSuite",true);
	}
	@BeforeTest
	public void alipur()
	{
		Reporter.log("Alipur"+" :- @BeforeTest",true);
	}
	@AfterMethod
	public void sandiego()
	{
		Reporter.log("sandiego"+" :- @AfterMethod",true);
	}
	@AfterClass
	public void sanfransisco()
	{
		Reporter.log("sanfransisco"+" :- @AfterClass",true);
	}
	@AfterSuite
	public void boston()
	{
		Reporter.log("boston"+" :- @AfterSuite",true);
	}
	@AfterTest
	public void losangles()
	{
		Reporter.log("losangles"+" :- @AfterTest",true);
	}
}
