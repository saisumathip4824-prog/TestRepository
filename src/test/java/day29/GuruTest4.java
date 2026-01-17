package day29;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruTest4 {
	WebDriver driver;
	String Baseurl = "http://live.techpanda.org/";	
	@Test
	public void testcase4() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(Baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), "Home page");
		driver.findElement(By.linkText("MOBILE")).click();
		Assert.assertEquals(driver.getTitle(), "Mobile");
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Compare'])[1]")).click();
		String FirstMobile = driver.findElement(By.xpath("//a[@title='Sony Xperia']")).getText();
		driver.findElement(By.xpath("(//a[normalize-space()='Add to Compare'])[2]")).click();
		String SecondMobile = driver.findElement(By.xpath("(//a[@title='IPhone'])[2]")).getText();
		System.out.println(FirstMobile+" "+SecondMobile);
		List<WebElement> CompareProducts = driver.findElements(By.xpath("//p[@class='product-name']"));
		for(WebElement MobileName:CompareProducts) {
			if((MobileName.getText().contains(FirstMobile))||(MobileName.getText().contains(SecondMobile))) {
				System.out.println(MobileName.getText());
			}
			System.out.println("true");
		}
		driver.findElement(By.xpath("(//span[normalize-space()='Compare'])[1]")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String handles:windows) {
			driver.switchTo().window(handles);
			System.out.println(driver.getTitle());
//			Thread.sleep(20);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			String PopupMobile1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sony Xperia']"))).getText();
			String PopupMobile2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='IPhone']"))).getText();
			Assert.assertEquals(PopupMobile1, FirstMobile);
			Assert.assertEquals(PopupMobile2, SecondMobile);
			System.out.println("Success");
//			driver.close();
		}		
	}

}
