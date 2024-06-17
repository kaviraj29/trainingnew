package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
		
		WebElement tool = driver.findElement(By.cssSelector("button[data-toggle='tooltip']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(tool).build().perform();
		
		WebElement toolTip = driver.findElement(By.cssSelector("div[class='tooltip-inner']"));
		System.out.println(toolTip.getText());
		
	}

}
