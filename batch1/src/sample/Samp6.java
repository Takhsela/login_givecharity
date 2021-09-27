package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp6 {
	
	@Test (groups="smoke") 
	public void testA() {
		
		Assert.assertEquals("Google", "google");		
	}

	@Test (dependsOnMethods="testA", alwaysRun=true) 
	public void testC() {		
		Assert.assertEquals("Gmail", "Gmail");		
	}
	
	@Test 
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}


}
