package Framework.TestNGMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {

	// go to the app > shopping cart > check to see if "continue" btn is displayed
	// I want to login to the app in 4 different test cases,
	// 1 with correct user and pass
	// 2 with incorrect user and correct pass
	// 3 with correct user and incorrect pass
	// 4 with incorrect user and pass

	WebDriver driver;

	@BeforeMethod
	public void setEnviroment() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
	@Test
	public void testShoppingCart() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() ='Shopping Cart']")).click();
		boolean btn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).isDisplayed();
		Assert.assertTrue(btn);
	}
	
	@Test(invocationCount = 1,  priority = 1)
	public void testLogIn() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("zainabnoori3088@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Godthanks123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
String title = driver.getTitle();
Assert.assertEquals(title, "My Account", "The app did not log in");
}
	@Test(invocationCount = 1,  priority = 2)
	public void testLogIn2() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("zainabnoori30888@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Godthanks123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account", "The app did not log in");
	}
	@Test(invocationCount = 1,  priority = 3)
	public void testLogIn3() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("zainabnoori3088@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Godthanks12112");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account", "The app did not log in");
	}
	@Test(invocationCount = 1,  priority = 4)
	public void testLogIn4() {
		driver.get("https://www.tekschoolofamerica.com/test-environment/");
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("zainabnoori308843@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Godthanks12123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Account", "The app did not log in");
	}
	@AfterMethod
	public void closeTheEnviroment() {
		driver.close();
		driver.quit();
	}

}
