package seleniumClassDemo;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		driver.manage().window().maximize();
		List<WebElement> AllCars=driver.findElements(By.xpath("//select[@multiple=\"multiple\"]"));
		for(WebElement cars:AllCars) {
			System.out.println(cars.getText());
		}
		Select cars=new Select(driver.findElement(By.xpath("//select[@multiple=\"multiple\"]")));
		if(cars.isMultiple()) {
			System.out.println("Multiple Dropdown------YES");
		}
		System.out.println("**************************");
		cars.selectByIndex(3);
		cars.selectByValue("B");
		List<WebElement> AllSelectedOptions = cars.getAllSelectedOptions();
		Iterator<WebElement> Iterator = AllSelectedOptions.iterator();
		while(Iterator.hasNext()) {
			System.out.println("Selected Options is "+Iterator.next().getText());
		}
		System.out.println("================================");
		System.out.println("First Select Option is "+cars.getFirstSelectedOption().getText());
		System.out.println("-----------------------------------");
		cars.deselectByValue("T");
		cars.deselectByVisibleText("BMW");
		cars.selectByVisibleText("Honda");
		cars.selectByIndex(0);
		cars.deselectAll();
		List<WebElement> Options = cars.getOptions();
		for(WebElement AllOptions:Options) {
			System.out.println("All Options are "+AllOptions.getText());
		}
		
		}
	}
