package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingXpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//To open the URL
		driver.get("https://www.saucedemo.com/");
		
		//To Maximize
		driver.manage().window().maximize();
		
		//By ID
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//By Name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//By Name
		driver.findElement(By.name("login-button")).click();
		
		//By LinkText
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		//By PartialLinkText
		driver.findElement(By.partialLinkText("Backpack")).click();
		
		//By Xpath
		driver.findElement(By.xpath("//*[@data-test=\"add-to-cart\"]")).click();
		
		//By CSS Selector
		driver.findElement(By.cssSelector("span[class=shopping_cart_badge]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
