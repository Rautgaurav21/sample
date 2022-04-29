package TestCase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	@Test
	public void method2()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Test1 Started");
		s.assertEquals("Automation","java","fail hotay ka");
		System.out.println("Soft Assert Works after failling ");
		s.assertEquals(200, 2001);
		System.out.println(("soft Assert Works After Failling"));
		
	}

}
