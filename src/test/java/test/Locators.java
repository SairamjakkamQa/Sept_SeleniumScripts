package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Jakkam
		// Sairam\\\\Downloads\\\\chromedriver-win64
		// (5)\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();  //browser launch

		driver.get("https://trytestingthis.netlify.app/"); //application opened 
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.id("fname"));
		firstname.sendKeys("Sairam");
		
		//System.out.println(firstname.isEnabled());
		
		driver.findElement(By.name("lname")).sendKeys("jakkam");
		
		WebElement radio=driver.findElement(By.id("male"));
	//	radio.click();
		//System.out.println(radio.isSelected());
		
		WebElement text=driver.findElement(By.xpath("//h2[text()='This is your layout two']"));
		
		System.out.println(text.isDisplayed());
		
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		//driver.close();
		
	}
}
