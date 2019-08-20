
package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {
	@Test
	public void testSoft() {
		SoftAssert assertion = new SoftAssert();
		System.out.println("start assertsoft");
		assertion.assertTrue(true);
		assertion.assertEquals(14, 14);
		System.out.println("completed assertsoft");
		assertion.assertAll();
	}

	@Test
	public void testHard() {
		System.out.println("start asserthard");
		Assert.assertTrue(true);
		Assert.assertEquals(14, 14);
		System.out.println("completed asserthard");
	}
}
