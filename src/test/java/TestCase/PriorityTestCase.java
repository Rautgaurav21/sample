package TestCase;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTestCase {
	@BeforeMethod
	public void setup()
	{
		System.out.println("Before Method");
	}
	@Test(priority = 0)
	public void test1()
	{
		System.out.println("Method 1");
	}
	@Test(priority = 2)
		public void test2()
		{
			System.out.println("Method 2");
		}
	@Test(priority = -1)
	public void test5()
	{
		System.out.println("Method 5");
	}
	@Test(priority = -100)
	public void test4()
	{
		System.out.println("Method 4");
	}
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("Method3");
	}
	@AfterMethod
	public void exit()
	{
		System.out.println("After Method");
	}

}
