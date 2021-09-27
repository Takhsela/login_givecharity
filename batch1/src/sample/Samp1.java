package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samp1 {
	
	@Test
	public void testA() {
		
		Assert.assertEquals("Google", "Google");		
	}

	@Test
	public void testC() {
		
		Assert.assertEquals("Gmail", "Gmail");
		
	}
	
	@Test
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}




}
