package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruTest2 {	
	WebDriver driver;
	String Baseurl = "http://live.techpanda.org/";
	
	@Test
	 void testcase2() {
		 driver = new ChromeDriver();
			driver.get(Baseurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Assert.assertEquals(driver.getTitle(), "Home page");
			driver.findElement(By.linkText("MOBILE")).click();
			Assert.assertEquals(driver.getTitle(), "Mobile");
//			System.out.println(driver.findElement(By.xpath("//span[@id='product-price-1']/parent::div/preceding-sibling::h2/a")).getText());
			String SonyXperiaListPrice = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
			driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
			String detailPrice = driver.findElement(By.xpath("//span[@class='price']")).getText();
			Assert.assertEquals(SonyXperiaListPrice, detailPrice);
			driver.quit();
	}
	
}
