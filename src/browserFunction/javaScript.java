package browserFunction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

	driver.get("https://demo.automationtesting.in/Register.html");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript(null, args)
		
		
		
	}

}
