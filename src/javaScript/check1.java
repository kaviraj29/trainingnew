package javaScript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();

		WebElement year = driver.findElement(By.cssSelector("select[placeholder='Year']"));
		year.click();
		
		Select yr = new Select(year);
		yr.selectByVisibleText("1992");
		
		WebElement mon = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		mon.click();
		Select sel = new Select(mon);
		List<WebElement>month = sel.getOptions();
		for (WebElement el : month) {
			
			System.out.println(el.getText());
			if(el.getText().equals("November"))
			{
				Thread.sleep(3000);
				el.click();
			}
			
		}
		
		WebElement day = driver.findElement(By.cssSelector("select[placeholder='Day']"));
		day.click();
		Select sel1 = new Select(day);
		List<WebElement>day1 = sel1.getOptions();
		for (WebElement el1 : day1) {
			
			System.out.println(el1.getText());
			if(el1.getText().equals("29"))
			{
				Thread.sleep(3000);
				el1.click();
			}
			
		}
		
		driver.findElement(By.cssSelector("input#firstpassword")).sendKeys("Hello");
		
		
		
		
		
		
	}

}
