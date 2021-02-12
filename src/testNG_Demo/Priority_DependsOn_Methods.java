package testNG_Demo;

import org.testng.annotations.Test;

public class Priority_DependsOn_Methods 
{
	@Test
	public void login()
	{
		System.out.println("login");
	}
	
	@Test(priority=3,dependsOnMethods="login")
	public void createCustomer()
	{
		System.out.println("Create Customer");
	}
	
	@Test(dependsOnMethods="createCustomer")
	public void deleteCustomer()
	{
		System.out.println("Delete Customer");
	}
}
