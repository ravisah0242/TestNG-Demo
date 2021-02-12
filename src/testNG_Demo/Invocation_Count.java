package testNG_Demo;

import org.testng.annotations.Test;

public class Invocation_Count 
{
	/*@Test(invocationCount=2)
	public void rich()
	{
		System.out.println("Richa");
	}
	@Test(invocationCount=4)
	public void shaniya()
	{
		System.out.println("Shaniya");
	}
	@Test(invocationCount=3)
	public void lakshmi()
	{
		System.out.println("lakshmi");
	}
	@Test(invocationCount=5)
	public void neha()
	{
		System.out.println("Neha");
	}*/
	@Test(invocationCount=2)
	public void rich()
	{
		System.out.println("Richa");
	}
	@Test(invocationCount=0)  	//its not countable;
	public void dolly()
	{
		System.out.println("dolly");
	}
	@Test(invocationCount=-4)
	public void shaniya()
	{
		System.out.println("Shaniya");
	}
	@Test
	public void lakshmi()
	{
		System.out.println("lakshmi");
	}
	@Test(invocationCount=5)
	public void neha()
	{
		System.out.println("Neha");
	}
}
