package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // step 1 : setup the driver

		WebDriver driver = new ChromeDriver(); // step 2 : to launch the browser

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/"); // step 3 : navigating to url

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement doubleclicks = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		Actions ac = new Actions(driver);

		ac.doubleClick(doubleclicks).perform();

		WebElement rightclick = driver.findElement(By.xpath("//button[text()='New Browser Window']"));

		ac.contextClick(rightclick).perform();

		WebElement item = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));

		WebElement destination = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(item, destination).perform();
		

	}
}
