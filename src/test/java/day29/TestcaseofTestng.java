package day29;

import org.testng.annotations.Test;

public class TestcaseofTestng {
	@Test(priority=1)
	void openapp() {
		System.out.println("Opening Application");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("Login to Application");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("Logout from Application");
	}

}
