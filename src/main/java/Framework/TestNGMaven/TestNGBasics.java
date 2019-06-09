package Framework.TestNGMaven;

import org.testng.annotations.*;

public class TestNGBasics {
	
	@BeforeSuite
	public void testsuite() {
	System.out.println("1. BeforeSuit ");	
	}
	@BeforeTest
	public void beforesuite() {
		System.out.println("2. BeforeTest ");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("3. BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("4. BeforeMethod");
	}
	
	@Test
	public void testCase() {
		System.out.println("5. Test");
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("4. AfterMethod");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("3. AfterClass");
		
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("2. AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("1. AfterSuite");
	}
}
