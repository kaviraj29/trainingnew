package javaScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileIpload {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
		WebElement upload =driver.findElement(By.cssSelector("input#uploadfile"));
		
		Actions act= new Actions(driver);
		act.click(upload).build().perform();
		
		Runtime.getRuntime().exec("./src./Autoit/AutoIT.exe" + " "+ "C:\\Users\\KavirajRajendran\\OneDrive - SierraDigitalinc\\Pictures\\image-640x120.png");
		
		
		
		
		//StringSelection sel=new StringSelection("C:\\Users\\KavirajRajendran\\OneDrive - SierraDigitalinc\\Pictures\\image-640x120.png");
		//StringSelection sel=new StringSelection("./src/javaScript/image-640x120.png");
		/*
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		 * Thread.sleep(5000);
		 * 
		 * Robot rb= new Robot();
		 * 
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_V);
		 * 
		 * rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_V);
		 * Thread.sleep(5000);
		 * 
		 * 
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
