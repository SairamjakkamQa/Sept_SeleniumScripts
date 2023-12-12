package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mulipleoptions {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//label[@class='form-check-label']"));
		System.out.println(checkboxes.size());

		for (WebElement checks : checkboxes) {

			System.out.println(checks.getText());
			if(checks.getText().contains("Sunday")) {
				checks.click();
			}
			
		}

	}
}
