package testNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiple_Dependencies 
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
	@Test(dependsOnMethods= {"loginMethod","createMethod"})
	public void deleteMethod()
	{
		System.out.println("Delete Method");
	}

}
