package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(dropdown);
//		select.selectByVisibleText("France");
//		select.selectByValue("uk");
//		select.selectByIndex(9);
		
		//Capture the options from dropdown
		List<WebElement>options = select.getOptions();
		System.out.println(options.size());
		
/*		//Printing the options
		for(int i=0;i<options.size();i++) {
			String optname = options.get(i).getText();
			System.out.println(optname);			
		}
		*/
		
		
		// USing Enhanced for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		

	}

}
