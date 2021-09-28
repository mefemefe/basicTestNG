package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAnnotations {
	
	@Test(priority= 1)
	public void setUp() {
		
	}
	
	@Test
	public void testVerification() {
		Assert.assertEquals(true, true, "Incorrect");
	}
	
	@Test
	public void testBoolean() {
		Assert.assertTrue(true);
		Assert.assertFalse(false);
	}
	
	@Test
	public void hardAssert() {
		Assert.assertTrue(false);
		// hard assert stops after fail
		Assert.assertFalse(false);
	}
	
	@Test
	public void softAssert() {
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false, false);
		softassert.assertFalse(false);
		softassert.assertTrue(false); // passes even though this is a failure.
	}
	
	@Test
	public void assertAll() {
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(false, false);
		softassert.assertFalse(true);
		softassert.assertAll();
	}

}
