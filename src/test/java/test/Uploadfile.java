package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class Uploadfile {
public static void main(String[] args) throws Throwable {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/pdf_to_jpg");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElement(By.id("pickfiles")).click();
	
	Robot rb=new Robot();

	rb.delay(3000);
	
	StringSelection ss=new StringSelection("C:\\Users\\Jakkam Sairam\\Downloads\\Admin Bussiness settings Equarz.pdf");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
}
}
