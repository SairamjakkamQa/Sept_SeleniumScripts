package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleExceptions {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	
	WebElement frames=driver.findElement(By.xpath("//iframe[@src='https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html']"));
	
	driver.switchTo().frame(frames);
	
	WebElement dropdown=driver.findElement(By.id("selectnav1"));
	
	Select sel=new Select(dropdown);
	sel.selectByVisibleText("- Dot Net");
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("name")).sendKeys("iam back");
	
}
}
