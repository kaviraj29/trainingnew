package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingCSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		
		/*//Tagname # ID(Value)
		driver.findElement(By.cssSelector("input#username")).sendKeys("Alexa");
		
		//TagName and ID
		driver.findElement(By.cssSelector("input#password")).sendKeys("Alexa");
		
		//TagName and ClassName
		driver.findElement(By.cssSelector("input.woocommerce-Input--checkbox")).click();
		
		//Using Tagname and Attribute
		driver.findElement(By.cssSelector("input[id='reg_email']")).sendKeys("Kavirajrvr@gmail.com");
		*/
		
		//Using Tagname, ID and Attribute
		driver.findElement(By.cssSelector("input#user-name[type='text']")).sendKeys("Kavirajrvr@gmail.com");
		Thread.sleep(5000);
		//Using Sub String Starts With
		driver.findElement(By.cssSelector("input[placeholder^='Us']")).clear();
		Thread.sleep(5000);

		//Using SubString String EndsWith
		driver.findElement(By.cssSelector("input[data-test$='name']")).sendKeys("standard_user");
		Thread.sleep(5000);

		//Using Contains
		driver.findElement(By.cssSelector("input[data-test*='password']")).sendKeys("secret_sauce");
		
		//Xpath = Using Class Name
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		
		//CSS Selector Using Class Name
		driver.findElement(By.cssSelector("div.bm-burger-button")).click();
		
		//Using Direct Child
		//driver.findElement(By.cssSelector("nav.bm-item-list>a")).click
		
		
		
		
	}

}
