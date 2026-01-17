package day29;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingTestNG {

	@BeforeClass(alwaysRun=true)
	void beforclass() {
		System.out.println("Running BeforeClass method");
	}
	
	@Test(groups = {"Vegetables"})
	void carrot() {
		System.out.println("Carrot is a Vegetable");
	}
	
	@Test(groups= {"Vegetables"})
	void drumstics() {
		System.out.println("drumstics are Vegetables");
	}
	
	@Test(groups= {"Vegetables","Leafy"})
	void spinach() {
		System.out.println("spinach is leafy items");
	}
	
	@Test(groups= {"Vegetables","Leafy"})
	void methi() {
		System.out.println("methi is leafy items");
	}
	
	
	@AfterClass(alwaysRun=true)
	void afterclass() {
		System.out.println("Running AfterClass method");
	}
}
