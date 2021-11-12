package seleniumClassDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//span[text() = 'Samsung Galaxy M32 5G (Slate Black, 6GB RAM, 128GB Storage)'])[1]")).click();
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext()) {
			String NewWindow=iterator.next();
			if(!windowHandle.endsWith(NewWindow)) {
				System.out.println(driver.switchTo().window(NewWindow).getCurrentUrl());
			}
		}
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[6]")).click();
	
	}

}
