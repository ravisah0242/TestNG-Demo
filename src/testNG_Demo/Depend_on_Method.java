package testNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depend_on_Method 
{
	@Test
	public void loginMethod()
	{
		Assert.fail();
		System.out.println("login Method");
	}
	@Test(dependsOnMethods="loginMethod")
	public void createMethod()
	{
		System.out.println("Create Method");
	}
	@Test(dependsOnMethods="createMethod")
	public void deleteMethod()
	{
		System.out.println("Delete Method");
	}

}
