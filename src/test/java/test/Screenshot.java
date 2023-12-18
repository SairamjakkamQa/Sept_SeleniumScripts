package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	static WebDriver driver;
	
	
	
	
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//WebElement logo=driver.findElement(By.xpath("//img[@class='rb_logo']"));
	CreateScreenshot();
		
		
	}
	
	public static void CreateScreenshot() throws Throwable {
		
		
		String path="./Screenshots/redbuslogo.png";
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File(path);
				
		FileUtils.copyFile(source, destination);
		
		
	}
	
	
	
	
	
	

}
