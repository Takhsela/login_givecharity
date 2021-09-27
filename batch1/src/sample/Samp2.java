package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp2 {

	@Test (priority=2) 
	public void testA() {
		
		Assert.assertEquals("Google", "google");		
	}

	@Test (groups="smoke")
	public void testC() {		
		Assert.assertEquals("Gmail", "Gmail");		
	}
	
	@Test (priority=3)
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}

}
