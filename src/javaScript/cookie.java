package javaScript;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookie {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		Set<Cookie>cooky = driver.manage().getCookies();
		
		System.out.println(cooky);
		
		System.out.println(cooky.size());
		
		
		
		Cookie coo=new Cookie("Hello", "cookie");
		driver.manage().addCookie(coo);
		
		driver.manage().getCookies();
		System.out.println(cooky.size());
		
		System.out.println(driver.manage().getCookieNamed("Hello"));

		
		
		
		
		
		
		
		
		
		
	}

}
