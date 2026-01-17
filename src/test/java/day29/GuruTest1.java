package day29;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuruTest1 {	
	WebDriver driver;
	String Baseurl = "http://live.techpanda.org/";
	@Test
	public void testcase1() throws IOException {
		driver = new ChromeDriver();
		driver.get(Baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertEquals(driver.getTitle(), "Home page");
		driver.findElement(By.linkText("MOBILE")).click();
		Assert.assertEquals(driver.getTitle(), "Mobile");
		WebElement dropdown = driver.findElement(By.xpath("(//select[@title='Sort By'])[1]"));
		Select sel =new Select(dropdown);
		sel.selectByVisibleText("Name");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File Targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\OrderView.png");
//		FileUtils.copyFile(Sourcefile, Targetfile);
		Sourcefile.renameTo(Targetfile);
		System.out.println("Success");
	}
	

	

}
