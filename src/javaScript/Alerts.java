package javaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[id='prompt']")).click();
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().sendKeys("Hello");
		//driver.switchTo().alert().dismiss();
		/*
		 * Thread.sleep(3000); Alert alert =driver.switchTo().alert(); alert.accept();
		 */
		
		WebElement confirm = driver.findElement(By.cssSelector("input[id='confirm']"));
		confirm.click();
		Alert alt =driver.switchTo().alert();
		System.out.println(alt.getText());
		
	
		
	}

public static void testing(){
system.out.println("checking");

}
