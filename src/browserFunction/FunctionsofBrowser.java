package browserFunction;

import org.bouncycastle.est.ESTSourceConnectionListener;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionsofBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//To Enter URL
		driver.get("https://www.capgemini.com/");
		System.out.println("Opeining the Capgemeni");
		
		//To navigate
		driver.navigate().to("https://www.honeywell.com/us/en");
		System.out.println("Navigate to the Honeywell");
		//To go back
		driver.navigate().back();
		System.out.println("Coming back to capgemeni");
		Thread.sleep(3000);

		
		//To go Forward
		driver.navigate().forward();
		System.out.println("goiung to honeywell");
		
		//To refresh
		driver.navigate().refresh();
		
		//To Minimize
		driver.manage().window().minimize();
		Thread.sleep(4000);
		
		//To Maximize
		driver.manage().window().maximize();
		Thread.sleep(4000);

		//Set browser custom size
		Dimension d= new Dimension(500, 800);
		driver.manage().window().setSize(d);
		
		
		
		
		
		
		
	}

}
