package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebDriverWait waits=new WebDriverWait(driver, 15);
				
		driver.findElement(By.id("enable-button")).click();       //click 

		WebElement button = driver.findElement(By.id("disable"));   //xpath of button which i wnat to check
		
		waits.until(ExpectedConditions.alertIsPresent());  //wait 
		
		System.out.println(button.isEnabled()); // true              // verification
	}

}
