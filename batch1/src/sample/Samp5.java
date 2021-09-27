package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp5 {
	
	@Test (dependsOnMethods="testB") 
	public void testA() {
		
		Assert.assertEquals("Google", "google");		
	}

	@Test (groups="sanity") 
	public void testC() {		
		Assert.assertEquals("Gmail", "Gmail");		
	}
	
	@Test (groups="smoke")
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}


}
