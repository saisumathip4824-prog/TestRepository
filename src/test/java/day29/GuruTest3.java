package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruTest3 {	
	WebDriver driver;
	String Baseurl = "http://live.techpanda.org/";	
	@Test
	 void testcase3() {
		 	driver = new ChromeDriver();
			driver.get(Baseurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertEquals(driver.getTitle(), "Home page");
			driver.findElement(By.linkText("MOBILE")).click();
			Assert.assertEquals(driver.getTitle(), "Mobile");
			driver.findElement(By.xpath("(//span[normalize-space()='Add to Cart'])[1]")).click();
			driver.findElement(By.xpath("//input[@title='Qty']")).clear();
			driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
			driver.findElement(By.xpath("(//span[normalize-space()='Update'])[1]")).click();
			String errorMsg = driver.findElement(By.xpath("//p[@class='item-msg error']")).getText();
			System.out.println(errorMsg);
			if(errorMsg.contains("The maximum quantity allowed for purchase is 500")) {
				System.out.println("Success");
			}
//			Assert.assertEquals(errorMsg, " The maximum quantity allowed for purchase is 500.");
			driver.findElement(By.xpath("(//span[normalize-space()='Empty Cart'])[1]")).click();
			String EmptyCartMsg = driver.findElement(By.xpath("//h1[normalize-space()='Shopping Cart is Empty']")).getText();
			Assert.assertEquals(EmptyCartMsg, "Shopping Cart is Empty");
			System.out.println("Success");
			
	}
	

}
