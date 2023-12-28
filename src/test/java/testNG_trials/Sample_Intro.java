package testNG_trials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample_Intro {

	
	@BeforeSuite
	
	public void Beforesuite() {
		
		System.out.println("Before suite is executed ");
		
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Beofre test is executed");
		
	}
	
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("before class is executed");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	
	@Test
	
	public void test() {
		
		System.out.println("test is executed");
		
	}
	
	
	@AfterMethod
	
	public void aftermethod() {
		
		System.out.println("after method");
	}
	
	

	
	
@AfterClass

public void afterclass() {
	
	System.out.println("after class");
}
	
	
@AfterTest

public void aftertest() {
	
	System.out.println("after test");
}
	
	
	
	@AfterSuite
	
	public void aftersuite() {
		
		System.out.println("After suite");
	}
	
	
	
	
	
	
	
	
	
	
}
