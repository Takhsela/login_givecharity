package sample;

import org.testng.annotations.Test;

public class Samp4 {
	
	@Test
	public void signin() {
		System.out.println("Sign in successful");
	}
	
	@Test (groups="smoke")
	public void search() {
		System.out.println("Search successful");
	}
	
	@Test (dependsOnMethods="search")
	public void Advancesearch() {
		System.out.println("Advancesearch successful");
	}
	
	@Test (dependsOnMethods="Advancesearch")
	public void signout() {
		System.out.println("Signout successful");
	}


}
