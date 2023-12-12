package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String title=driver.getTitle();
		
		System.out.println("Title of the WebPage "+title);
		
		String URL=driver.getCurrentUrl();
		System.out.println("URl of application is "+URL);
		
		//Set<String> ids=driver.getWindowHandles();
		
		//System.out.println(ids);
		
		WebElement technews=driver.findElement(By.xpath("//a[text()='Tech News']"));
		technews.click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		//driver.close();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)");
//		
//		
//		driver.findElement(By.id("newTabBtn")).click();
//		
//		Thread.sleep(5000);
//		
//		driver.close();
//		

	}

}
