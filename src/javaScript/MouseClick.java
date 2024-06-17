package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement login= driver.findElement(By.cssSelector("button[value='LogIn']"));
		
		
		//WebElement click = driver.findElement(By.cssSelector("a[href='http://www.seleniumone-by-arun.blogspot.com']"));
		WebElement click= driver.findElement(By.cssSelector("span#blogsmenu"));
		
		Actions act= new Actions(driver);
		act.clickAndHold(click).build().perform();
		WebElement click2=driver.findElement(By.cssSelector("a[href='http://www.seleniumone-by-arun.blogspot.com']"));
		act.click(click2).build().perform();
		//act.release(click).build().perform();
		
		//Move Click the WebElement
		//act.click(login).build().perform();
		
		//Scroll to particular element
		//act.scrollToElement(login).build().perform();
		
		//Click and Hold the Blog on header
		//act.clickAndHold(login).build().perform();
		
		//Move to the element
		//act.moveToElement(login).build().perform();
		
		//Move by scroll bar for particulat height
		//act.moveByOffset(400,5000).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
