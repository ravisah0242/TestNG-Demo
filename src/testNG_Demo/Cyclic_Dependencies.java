package testNG_Demo;

import org.testng.annotations.Test;

public class Cyclic_Dependencies
{
	@Test(dependsOnMethods="father")
	public void mother()
	{
		System.out.println("Ask Your Father");
	}
	@Test(dependsOnMethods="mother")
	public void father()
	{
		System.out.println("Aks Your Mothae");
	}
	
}