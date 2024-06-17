package javaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementValidation {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//Implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//E
		
		//Isenabled(), ISdisplayed(), isSelected()
		
		/*
		 * WebElement enabled = driver.findElement(By.cssSelector("button#but2"));
		 * 
		 * boolean en= enabled.isEnabled(); boolean en1= enabled.isDisplayed(); boolean
		 * en2=enabled.isSelected();
		 * 
		 * System.out.println(en); System.out.println(en1);
		 * 
		 * System.out.println(en2);
		 */
		WebElement selected1 = driver.findElement(By.cssSelector("input#checkbox2"));
		boolean sel1 = selected1.isSelected();
		System.out.println(sel1);
		
		driver.findElement(By.cssSelector("input#checkbox2")).click();
		
		
		WebElement selected = driver.findElement(By.cssSelector("input#checkbox2"));
		boolean sel = selected.isSelected();
		System.out.println(sel);
		
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#checkbox2")));
		
		
		
		
		
		
		

		
		/*
		 * WebElement enabled1 = driver.findElement(By.cssSelector("button#but1"));
		 * 
		 * Boolean en1 = enabled1.isEnabled(); System.out.println(en1);
		 */

		
		
		
		
	}

}
