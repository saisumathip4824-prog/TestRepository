package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("Success");
		List<WebElement> checkboxele = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*		for(WebElement checkbox:checkboxele) {
			checkbox.click();
			} */
		
		// select last 3 checkboxes
/*		for(int i=checkboxele.size()-1;i<=checkboxele.size();i--) {
			checkboxele.get(i).click();
			if(i==4) {
				break;
			}
		}
		*/
		for(int i=0;i<3;i++) {
			checkboxele.get(i).click();
		}
		
		Thread.sleep(5000);
		
		 for(int i=0;i<checkboxele.size();i++) {
			 if(checkboxele.get(i).isSelected()) {
				 checkboxele.get(i).click();
			 }
		 }
		
			

	}

}



