package HandlingWindow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		//for single window
		String pwID = driver.getWindowHandle();
		System.out.println("Single window"+pwID);
		
		WebElement Tab = driver.findElement(By.cssSelector("button#newTabBtn"));
		Tab.click();
		
		System.out.println(pwID);
		
		
		Set<String> mulwin = driver.getWindowHandles();
		
		for (String el : mulwin) {
			
			System.out.println(el);
			
			if(el.equals(pwID))
			{
				driver.close();
			}
			
			
		}
		
		
		
		
		
		/*
		 * //266DFFE6C7CB8F9B033FEF911EA53B80 //C0EA9BCD0A7D2B2862B66CB7FDDB4527
		 * 
		 * //Mulitple window
		 * 
		 * WebElement childWin1 =
		 * driver.findElement(By.cssSelector("button#newWindowBtn")); childWin1.click();
		 * 
		 * WebElement childWin2 =
		 * driver.findElement(By.cssSelector("button#newWindowBtn")); childWin2.click();
		 * 
		 * //Don't allow duplicate
		 * 
		 * Set<String> mulwin = driver.getWindowHandles();
		 * 
		 * //Iterator Iterator<String>it = mulwin.iterator();
		 * 
		 * String parentWin = it.next(); String childWin = it.next();
		 * 
		 * System.out.println("Single window"+parentWin);
		 * System.out.println("First Child win"+childWin);
		 * 
		 * //List -- Allow duplicate
		 * 
		 * List<String>winList = new ArrayList<String>(mulwin);
		 * 
		 * String parentID = winList.get(0); String childID = winList.get(2);
		 * 
		 * System.out.println("Single Window"+parentID);
		 * System.out.println("Second child win"+childID);
		 * 
		 * driver.switchTo().window(childID).close();
		 * driver.switchTo().window(childWin).close();
		 * 
		 * //For each
		 * 
		 * for (String el : mulwin) {
		 * 
		 * System.out.println(el); }
		 * 
		 * driver.quit();
		 */
		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().window(childWin).close();
		
		
		
		
		
		
	}

}
