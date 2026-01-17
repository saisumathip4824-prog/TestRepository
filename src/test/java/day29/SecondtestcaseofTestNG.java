package day29;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondtestcaseofTestNG {
	@Test
	void test1() {
		System.out.println("1st Test method");
	}
	@Test
	void test2() {
		System.out.println("2nd Test method");
	}
	
	@BeforeClass
	void beforclass() {
		System.out.println("Running BeforeClass method");
	}
	
	@AfterClass
	void afterclass() {
		System.out.println("Running AfterClass method");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Running BeforeTest method");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("Running AfterTest method");
	}

	@BeforeMethod
	void befmethd() {
		System.out.println("Running BeforeMethod");
	}
	
	@AfterMethod
	void aftmethd() {
		System.out.println("Running AfterMethod");
	}
	
	@BeforeGroups
	void test() {
		System.out.println("Running BeforeGroupsMethod");
	}
	
	@AfterGroups
	void afttest1() {
		System.out.println("Running AfterGroupsMethod");
	}
}





