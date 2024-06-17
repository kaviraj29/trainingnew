package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaSciptExe {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://omayo.blogspot.com/");
		driver.get("https://omayo.blogspot.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#alert1")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		/*
		 * jse.executeScript(
		 * "document.getElementById('user-name').value='standard_user'");
		 * jse.executeScript("document.getElementById('password').value='secret_sauce'")
		 * ; Thread.sleep(3000);
		 */
		
		//WebElement sign=driver.findElement(By.cssSelector("button[type='submit']"));
		////jse.executeScript("arguments[0].click()", sign);
		  
		
		//ScrollToWebElement
		//WebElement login= driver.findElement(By.cssSelector("button[value='LogIn']"));
		//jse.executeScript("arguments[0].scrollIntoView(true)", login);
		
		//Scroll To End
		//jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", login);
		
		//Navigate
		//jse.executeScript("window.location='https://www.google.co.in/'");
		
		//Scroll to Particular Height
		//jse.executeScript("window.scrollBy(450, 500)");
		
		
		WebElement click2=driver.findElement(By.cssSelector("a[href='http://www.seleniumtwo-by-arun.blogspot.com']"));
		jse.executeScript("arguments[0].click()", click2);
		
		
		/*
		 * jse.executeScript("document.getElementsByName('username').value='Admin'");
		 * jse.executeScript("document.getElementsByName('password').value='admin123'");
		 * 
		*/
		
		
		
		  
		 
		 
		
		
		
		
		  
		
		
		
		
		
		
		
		
		
		

	}

}
