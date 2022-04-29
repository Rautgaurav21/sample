package TestCase;

import org.testng.annotations.Test;

public class GroupTest {
	@Test (groups = "Sanity")
	public void method1()
	{
		System.out.println("Method 1");
	}
	@Test(groups = "Regression")
	public void method2()
	{
		System.out.println("Method 2");
	}
	@Test(groups = {"Sanity","Regression"})
	public void method5()
	{
		System.out.println("Method 5");
	}
	@Test(groups = "Regression")
	public void method3()
	{
		System.out.println("Method 3");
	}
	@Test(groups = "Sanity")
	public void method4()
	{
		System.out.println("Method 4");
	}

}
