package javaScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyEve {


	public static void main(String[] args) throws InterruptedException, AWTException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		/*
		 * Actions act = new Actions(driver); act.sendKeys(Keys.TAB).build().perform();
		 * Thread.sleep(3000); act.sendKeys(Keys.TAB).build().perform();
		 * 
		 * act.sendKeys(Keys.TAB).build().perform();
		 * 
		 * act.sendKeys(Keys.TAB).build().perform();
		 * 
		 * act.sendKeys(Keys.TAB).build().perform();
		 */
		Thread.sleep(3000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);

		
		


		
		

		
		
		
		
	}

}
