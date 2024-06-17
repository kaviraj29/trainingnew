package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssChild {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Clicking the element
		//driver.findElement(By.cssSelector("div.nav-left>a")).click();
		Actions act= new Actions(driver);
		
		WebElement all =driver.findElement(By.cssSelector("div.nav-left>a"));
		act.click(all).build().perform();
		Thread.sleep(4000);
		
		//Using Direct Child
		/*
		 * WebElement tre =driver.findElement(By.cssSelector("ul.hmenu-visible>li"));
		 * System.out.println(tre); Thread.sleep(3000);
		 */

		//driver.findElement(By.cssSelector("ul.hmenu-visible>li")).click();
		
		//Using nth Element
		WebElement echo=driver.findElement(By.cssSelector("ul.hmenu-visible>li:nth-child(8)"));
		act.click(echo).build().perform();
		Thread.sleep(3000);
		
		
		//driver.findElement(By.cssSelector("ul.hmenu-visible>li:nth-child(7)")).click();
		
		//Using subChild
		WebElement alexa=driver.findElement(By.cssSelector("ul.hmenu-translateX>li:nth-child(3)"));
		act.click(alexa).build().perform();
		//driver.findElement(By.cssSelector("))
		
		
		
		
		
		
		
		
		
	}

}
