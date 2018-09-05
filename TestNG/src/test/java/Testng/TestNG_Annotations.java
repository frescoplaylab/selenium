package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations {

	
	// Pre-Condition starts with @Before
	
	@BeforeSuite  // This will execute 1
	public void beforeSuite() {
		System.out.println("Before Suite has been executed as no.1");
	}

	@BeforeTest  // This will execute 2
	public void beforeTest() {
		System.out.println("Before Test has been executed as no.2");
	}
	
	@BeforeClass  // This will execute 3
	public void beforeClass() {
		System.out.println("Before Class has been executed as no.3");
	}

	

	@BeforeMethod // This will execute 4
	public void beforeMethod() {
		System.out.println("Before Method has been executed as no.4");
	}

	
	// Test Cases starts with @Test
	
	@Test // This will execute 5
	public void GetpageTitle() {
		System.out.println("Test has been executed as no.5");
	}

	
	//  Post-Condition  starts with @After
	
	@AfterMethod // This will execute 6
	public void afterMethod() {
		System.out.println("After Method has been executed as no.6");
	}

	
	@AfterClass // This will execute 7
	public void afterClass() {
		System.out.println("After Class has been executed as no.7");
	}

	@AfterTest // This will execute 8
	public void afterTest() {
		System.out.println("After Test has been executed as no.8");
	}

	@AfterSuite // This will execute 9
	public void afterSuite() {
		System.out.println("After Suite has been executed as no.9");
	}

}
