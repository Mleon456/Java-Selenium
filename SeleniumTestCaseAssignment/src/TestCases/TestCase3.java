package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\migle\\OneDrive\\Documents\\Selenium Browser Drivers\\chromedriver.exe");

		// Initiate webdriver
		WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("http://zero.webappsecurity.com/index.html");
		
		// Click on feedback
		driver.findElement(By.id("feedback")).click();
		Thread.sleep(3000);
		
		// Enter name 
		driver.findElement(By.xpath("//input[@placeholder='Your Name']")).sendKeys("Miguel Leon");
		Thread.sleep(1000);
		
		// Enter email 
		driver.findElement(By.xpath("//input[@placeholder='Your email address']")).sendKeys("starKNIGHT@hotmail.com");
		Thread.sleep(1000);
		
		// Enter subject information
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Test");
		Thread.sleep(1000);
		
		// Type in feeback information 
		driver.findElement(By.id("comment")).sendKeys("This is a test of the Zero Bank Feedback System.");
		Thread.sleep(2000);
		
		// Enter feedback
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	
		driver.close();
		driver.quit();


	}

}
