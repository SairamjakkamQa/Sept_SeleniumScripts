package task;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crm_UploadFile {


public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver a=new ChromeDriver();
a.get("http://empirehome.myprojectsonline.co.in/");	
a.manage().window().maximize();
a.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
a.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
a.findElement(By.name("pword")).sendKeys("ZPMHQHIA");
a.findElement(By.xpath("//button[text()='Login']")).click();
Thread.sleep(5000);
a.findElement(By.xpath("//i[@class=\"fa fa-houzz\"]")).click();
a.findElement(By.xpath("//a[text()=\"All Inventory\"]")).click();
Thread.sleep(3000);
a.findElement(By.xpath("//a[@class=\"btn btn-add\"]")).click();
WebElement store=a.findElement(By.xpath("//select[@id=\"catDD\"]"));
Select s=new Select(store);
s.selectByVisibleText("Balcony");
a.findElement(By.xpath("//input[@name=\"ModelNumber\"]")).sendKeys("6753");
a.findElement(By.xpath("//textarea[@name=\"Title\"]")).sendKeys("wood");
a.findElement(By.xpath("//textarea[@name=\"ItemDescription\"]")).sendKeys("takewood");
a.findElement(By.xpath("//input[@name=\"Brand\"]")).sendKeys("iphone");
a.findElement(By.xpath("//input[@name=\"Height\"]")).sendKeys("5.5cm");
a.findElement(By.xpath("//input[@placeholder=\"Enter Width\"]")).sendKeys("6cm");
a.findElement(By.xpath("//input[@name=\"Breadth\"]")).sendKeys("7cm");
a.findElement(By.xpath("//input[@name=\"ColorName\"]")).sendKeys("atmkur");
WebElement hide=a.findElement(By.xpath("//select[@id=\"InventoryStatusId\"]"));
Select m=new Select(hide);
m.selectByVisibleText("basha");
WebElement save=a.findElement(By.xpath("//select[@id=\"InventoryConditonId\"]"));
Select o=new Select(save);
o.selectByVisibleText("AVERAGE");
WebElement u=a.findElement(By.xpath("//select[@data-select2-id=\"InventoryLocationId\"]"));
Select r=new Select(u);
r.selectByVisibleText("Banglore");
a.findElement(By.xpath("//input[@name=\"RecievedDate\"]")).sendKeys("12-12-2023");
a.findElement(By.xpath("//input[@name=\"ActualPrice\"]")).sendKeys("5000");
WebElement y=a.findElement(By.xpath("//select[@name=\"MRPFactorId\"]"));
Select c=new Select(y);
c.selectByVisibleText("1.50");
a.findElement(By.xpath("//input[@name=\"HSNCode\"]")).sendKeys("rt54r");
a.findElement(By.xpath("//input[@name=\"RackName\"]")).sendKeys("hrm");
a.findElement(By.xpath("//input[@name=\"PODetails\"]")).sendKeys("empire");
a.findElement(By.xpath("//input[@name=\"InvoiceNumber\"]")).sendKeys("3456");
a.findElement(By.xpath("//input[@name=\"Qty\"]")).sendKeys("6");
a.findElement(By.xpath("//input[@id=\"gstName\"]")).sendKeys("5%");
//file up load
Thread.sleep(5000);


WebElement upload=a.findElement(By.name("ColorImageUploaded"));
JavascriptExecutor js=(JavascriptExecutor)a;

js.executeScript("arguments[0].click();",upload);

System.out.println("testC:\\Users\\ADMIN\\Downloads\\stock-vector-multi-layers-color-texture-d-papercut-layers-in-gradient-vector-banner-carving-art-cover-layout-2150378505.jpg"
		+ "");

//a.findElement(By.xpath("//input[@name='ColorImageUploaded']")).click();  //click for image upload
Robot rb= new Robot();
rb.delay(5000);
StringSelection mn= new StringSelection("C:\\Users\\ADMIN\\Downloads\\stock-vector-multi-layers-color-texture-d-papercut-layers-in-gradient-vector-banner-carving-art-cover-layout-2150378505.jpg");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(mn, null);
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);


	}

}


