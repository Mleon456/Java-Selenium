package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\migle\\OneDrive\\Documents\\Selenium Browser Drivers\\chromedriver.exe");

		// Initiate webdriver
		WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("http://zero.webappsecurity.com/index.html");
		
		// Click on signin button
		driver.findElement(By.id("signin_button")).click();

		// enter username
		driver.findElement(By.name("user_login")).sendKeys("username");
		Thread.sleep(1000);

		// enter invalid password
		driver.findElement(By.id("user_password")).sendKeys("stars");
		Thread.sleep(1000);
		
		// click on sign in button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
