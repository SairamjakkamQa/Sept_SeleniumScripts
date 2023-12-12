package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  // step 1 : setup the driver 
		
		WebDriver driver=new ChromeDriver();      //step 2 : to launch the browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");   // step 3 : navigating to url
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		WebElement login=driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
				
		Actions ac=new Actions(driver);
		ac.moveToElement(login).perform();
		
		
		
		
	}
	
	
	
}
