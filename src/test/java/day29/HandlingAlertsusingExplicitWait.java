package day29;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlertsusingExplicitWait {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
/*		using explicit wait we can handle alerts without using Switch.To
 * WebDriverWait wait = new WebDriverWait(driver, duration.ofseconds(10));
 * alert alert = wait.until(ExpectedConditions.alertIsPresent());
 * system.out.println(alert.getText());
 * alert.accept();
 * 
 * https://www.hyrtutorials.com/#google_vignette
 * 
 * 
 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String Parentwindow = driver.getWindowHandle();
//		driver.findElement(By.id("newWindowBtn")).click();
		WebElement newtab = driver.findElement(By.id("newTabsBtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, 300)");
		js.executeScript("arguments[0].click();", newtab);
		Set<String> handles = driver.getWindowHandles();
		for(String childwd:handles) {
			String title = driver.switchTo().window(childwd).getTitle();
			if(title.contains("Basic Controls")) {
				driver.switchTo().window(childwd);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sumathi");
				System.out.println("Success");
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("purimitla");
				System.out.println("Success");
			}
		//Using iterator
/*		Iterator<String> itr = handles.iterator();  
		while(itr.hasNext()) {
			String Childwindow = itr.next();	
			if(!Childwindow.equalsIgnoreCase(Parentwindow)) {
				driver.switchTo().window(Childwindow);
				System.out.println(driver.getTitle());
			}
						
		} 		
		
		for(String childwd:handles) {
			if(childwd.contains("AlertsDemo")) {
				driver.switchTo().window(childwd);
				System.out.println(driver.getTitle());
				js.executeScript("window.scrollTo(0, 300)");
				driver.findElement(By.id("alertBox")).click();
				driver.switchTo().alert().accept();
			}
			for(String childwd:handles) {
				if(!childwd.equals(Parentwindow)) {
				driver.switchTo().window(childwd);
				System.out.println(driver.getTitle());
				Thread.sleep(5);
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sumathi");
				System.out.println("Success");
				driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("purimitla");
				System.out.println("Success");
				driver.findElement(By.xpath("//input[@id='femalerb']")).click();
				System.out.println("Success");
//				driver.close();
				
			}*/
		} 
		
		
		
	}	
		
		
	}	
		
		

	


