package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check {

	public static void main(String[] args)  {


				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Datepicker.html");
				driver.manage().window().maximize();
				
				//WebElement click = driver.findElement(By.cssSelector(

						
	}
}