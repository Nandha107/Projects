package seleniumClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\SeleniumDemo\\ChromeDriver\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		String currentURL=Driver.getCurrentUrl();
		System.out.println("Current URL is "+currentURL);
		String currentTitle=Driver.getTitle();
		System.out.println("Current Title is "+currentTitle);
		Driver.findElement(By.id("email")).sendKeys("9027373221");
		Driver.findElement(By.name("pass")).sendKeys("********");
		Driver.findElement(By.name("login")).click();
		String currentURL2=Driver.getCurrentUrl();
		System.out.println("Curren URL 2 is "+currentURL2);
		
		if(!currentURL.equals(currentURL2)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAIL");
		}
	}

}
