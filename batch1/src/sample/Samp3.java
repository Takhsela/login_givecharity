package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp3 {

	@Test (groups="smoke")
	public void testA() {
		
		Assert.assertEquals("Google", "Google");		
	}

	@Test (priority=1, enabled=false)
	public void testC() {		
		Assert.assertEquals("Gmail", "Gmail");		
	}
		
	@Test (groups="sanity")
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}

}
