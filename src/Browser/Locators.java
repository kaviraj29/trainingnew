package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//Single Slash or Absolute Xpath - From the Root node
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("9597228990");
		
		//Double slash Xpath or Relative xpath
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Kavin");
		Thread.sleep(5000);
		
		//Single Attribute
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Saravanampatti");	
		
		//Multiple Attributes
		driver.findElement(By.xpath("//input[@type='email'][@ng-model='EmailAdress']")).sendKeys("Kaviraj");
		
		//AND Operator
		driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']")).sendKeys("95972288900");
		Thread.sleep(2000);
		//OR Operator
		driver.findElement(By.xpath("//input[@type='tel' or @ng-model='Phone']")).clear();
		
		//Using Contains
		driver.findElement(By.xpath("//input[contains(@id,'firstpassword')]")).sendKeys("Hi");
		
		//Using StartsWith
		driver.findElement(By.xpath("//input[starts-with(@ng-model,'CPass')]")).sendKeys("Hi");
		
		//Using Text
		//driver.findElement(By.xpath("//*[text()=' Submit ']")).click();
		
		Thread.sleep(4000);
		//Using last
		//driver.findElement(By.xpath("(//input[@type='password'])[last()]")).sendKeys("Kaviraj");
		//driver.findElement(By.xpath("(//input[@))
		
		
		//Using Position
		driver.findElement(By.xpath("(//input[@type='password'][1])")).sendKeys("KAviraj");
		
		//Using Index
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("kavirajrvr@gmail.com");
		Thread.sleep(5000);
		//Following Xpath
		driver.findElement(By.xpath("//input[@type='text']/following::input[@type='text']")).sendKeys("Kaviraj");
		
		//Preceding Xpath
		driver.findElement(By.xpath("//input[@type='text']/preceding::input[@type='text']")).sendKeys("Kaviraj");
		
	}

}
