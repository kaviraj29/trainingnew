package javaScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotInter {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		//Full Screen
		/*
		 * TakesScreenshot tss = (TakesScreenshot)driver; File source =
		 * tss.getScreenshotAs(OutputType.FILE); File target = new
		 * File(".\\screenshot\\Fullpage.png");
		 * 
		 * FileUtils.copyFile(source, target);
		 */
		
		
		WebElement deal = driver.findElement(By.xpath("(//span[@class='a-color-base'])[1]"));

		File source = deal.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File target = new File(".\\screenshot\\Fullpage1.png");
		
		//FileUtils.copyFile(source, target);
		
		FileHandler.copy(source, target);
		
		
		
		
	}

}
