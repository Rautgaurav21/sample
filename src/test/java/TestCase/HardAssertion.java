package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
		@Test
		public void method5()
		{
			System.out.println("Method 5");
			Assert.assertEquals("Java","Java","If fail Than Fail");
			System.out.println("Is Method5 Printing after Password");
		}
		@Test
		public void method3()
		{
			System.out.println("Method 3");
			Assert.assertEquals("200","200","If fail Than Fail");
			System.out.println("Is Method3 Printing after Password");
		}
		@Test
		public void method1() 
		{
			System.out.println("Method 1");
			Assert.assertTrue(true);
		}
		@Test
		public void method4()
		{
			System.out.println("Method 4");
			Assert.assertTrue(false, "If fail Than Fail");
		}
		@Test
		public void method2()
		{
			System.out.println("Method 2");
			Assert.assertFalse(true, "If Pass Than Pass");
		}
}
