package seleniumClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://oraniumtech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Training'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys("Nandhakumar M");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("9524373224");
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Email Id\"]")).sendKeys("nandha10799@gmail.com");
		Select batch=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control\"])[1]")));
		batch.selectByVisibleText("Class Room Traing");
		Select time=new Select(driver.findElement(By.xpath("(//select[@class=\"form-control\"])[2]")));
		time.selectByIndex(1);
		driver.findElement(By.xpath("//button[@class=\"btn ben-primary\"]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
