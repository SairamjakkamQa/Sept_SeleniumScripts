package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	WebElement dropdown=driver.findElement(By.id("country"));
	
	Select sel=new Select(dropdown);
	
	//sel.selectByIndex(2);
	//sel.selectByVisibleText("India");
	//sel.selectByValue("france");
	
}
}
