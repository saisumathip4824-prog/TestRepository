package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='']")).click();
		
		
/*		//in hidden drop down, elements are like when ever we try to inspect, after pressing right click it will
 * 		 disappear. so, in this situations we won't be able to inspect all dropdown elements properly. 
 *       so, will take the help of DEBUGGER in SelectorsHub. 

		In selectors hub first we have to click on debugger , then immediately will click on the drop down arrow. after clicking with in 5 seconds it will freeze the page, then again we have to inspect the dropdown elements , what ever we want to select.

		
		
*/	}

}
