package day29;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String Parentwindow = driver.getWindowHandle();
		WebElement newtab = driver.findElement(By.id("newTabsBtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", newtab);
		Set<String> handles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(handles);
		String exptitle= "Basic Controls - H Y R Tutorials";
		for(String ids : li) {
			//driver.switchTo().window(ids).getTitle();
//		System.out.println(ids);
			String title= driver.switchTo().window(ids).getTitle();
			
			if(title.contains(exptitle)) {
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sumathi");
				System.out.println("Success");
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("purimitla");
				System.out.println("Success");
				driver.findElement(By.xpath("//input[@id='femalerb']")).click();
				System.out.println("Success");
				Thread.sleep(3);
				driver.close();
			}
		}
			
		
/*    	for (String childwd : handles) {
			if (!childwd.equals(Parentwindow)) {
				System.out.println("Successfully");
				if (childwd.contains("Basic Controls")) {
					System.out.println("Success it came to Basic controls page");
					driver.switchTo().window(childwd);
					System.out.println(driver.getTitle());
					driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sumathi");
					System.out.println("Success");
					driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("purimitla");
					System.out.println("Success");
					driver.findElement(By.xpath("//input[@id='femalerb']")).click();
				}

			}
		
		}*/

	}

}
