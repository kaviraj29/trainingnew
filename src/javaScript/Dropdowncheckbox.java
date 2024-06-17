package javaScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowncheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		
		driver.get("https://jquery-az.com/jquery/demo.php?ex=152.0_1");
		//driver.manage().window().maximize();
		
		WebElement drpclick =driver.findElement(By.cssSelector("button#btndropdown"));
		drpclick.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[value='Clear']")).click();
		drpclick.click();
		
		//List<WebElement>all=driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
		List<WebElement>all=driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement els : all) {

			if(!els.isSelected()) {
				els.click();
				
			}
			
		}

	}

}
