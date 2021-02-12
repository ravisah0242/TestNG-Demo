package testNG_Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	/*@Test(priority=4)
	public void rich()
	{
		System.out.println("Richa");
	}
	@Test(priority=1)
	public void shaniya()
	{
		System.out.println("Shaniya");
	}
	@Test(priority=3)
	public void lakshmi()
	{
		System.out.println("lakshmi");
	}
	@Test(priority=2)
	public void neha()
	{
		System.out.println("Neha");
	}*/
	
	/*@Test(priority=4)
	public void rich()
	{
		System.out.println("Richa");
	}
	@Test(priority=1)
	public void shaniya()
	{
		System.out.println("Shaniya");
	}
	@Test(priority=0)yuf
	public void lakshmi()
	{
		System.out.println("lakshmi");
	}
	@Test
	public void neha()
	{
		System.out.println("Neha");
	}*/
	
	@Test(priority=-40)
	public void rich()
	{
		System.out.println("Richa");
	}
	//@Test(priority=s)
	//@Test(priority=1.8)
	@Test(priority=12)
	public void purva()
	{
		System.out.println("Purva");
	}
	
	@Test(priority=-45)
	public void shaniya()
	{
		System.out.println("Shaniya");
	}
	@Test(priority=10)
	public void lakshmi()
	{
		System.out.println("lakshmi");
	}
	@Test
	public void neha()
	{
		System.out.println("Neha");
		
	}
	
}
