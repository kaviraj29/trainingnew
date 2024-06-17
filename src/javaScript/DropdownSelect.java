package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {

		
		
		//Text of a Link
		/*
		 * List<WebElement>links=driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement el : links) {
		 * 
		 * System.out.println(el.getText());
		 * 
		 * }
		 */
		
		/*
		 * List<WebElement>links=driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement el : links) {
		 * 
		 * System.out.println(el.getText());
		 * System.out.println(el.getAttribute("href"));
		 * System.out.println(el.getSize());
		 * 
		 * }
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.getTitle();
		
		
		  WebElement drp = driver.findElement(By.cssSelector("select#multiselect1"));
		  Thread.sleep(5000);
		  
		  
		  Select Sel = new Select(drp); Thread.sleep(5000); Sel.selectByIndex(2);
		 Sel.selectByVisibleText("Swift"); Sel.selectByValue("volvox");
		 
		
			List<WebElement>Selcar = Sel.getAllSelectedOptions();
		
		for (WebElement el : Selcar) {
			
			System.out.println(el.getText());
			
		}
		
		WebElement mdrp = driver.findElement(By.cssSelector("select#drop1"));
		mdrp.click();
		
		Select muldrp = new Select(mdrp);
		
		List<WebElement>alloptions = muldrp.getOptions();
		
		for (WebElement all : alloptions) {
			
			System.out.println(all.getText());
			
		}
		
		System.out.println("=========XXXXXXXXX=======");
		
		muldrp.selectByIndex(2);
		muldrp.selectByVisibleText("doc 3");
		
		List<WebElement>SelOption = muldrp.getAllSelectedOptions();
		
		for (WebElement el : SelOption) {
			
			System.out.println(el.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
