package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("APjFqb")).sendKeys("cars");

		List<WebElement> option = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));

		System.out.println(option.size());

		for (WebElement autosuggestions : option) {

			String list = autosuggestions.getText();

			System.out.println(list);

			if (autosuggestions.getText().contains("for sale")) {
				autosuggestions.click();
				break;
			}

		}

	}

}
