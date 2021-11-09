package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase4 {

	public static void main(String[] args)  throws InterruptedException {
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

		// enter password
		driver.findElement(By.id("user_password")).sendKeys("password");

		// click on login button
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.id("primary-button")).click();
		
		// Click on online banking
		driver.findElement(By.id("onlineBankingMenu")).click();
		
		// Click on pay bills 
		driver.findElement(By.id("pay_bills_link")).click();
		
		// Select the payee
		WebElement payeeLocator = driver.findElement(By.id("sp_payee"));
		Select payee = new Select(payeeLocator);
		payee.selectByVisibleText("Bank of America");
		Thread.sleep(1000);
		
		// Select the payment account
		WebElement accountLocator = driver.findElement(By.id("sp_account"));
		Select account = new Select(accountLocator);
		account.selectByVisibleText("Credit Card");
		Thread.sleep(1000);
		
		// Enter the amount
		driver.findElement(By.id("sp_amount")).sendKeys("800");
		Thread.sleep(1000);
		
		// Enter the date
		driver.findElement(By.id("sp_date")).sendKeys("11-20-2021");
		Thread.sleep(1000);
		
		// Enter a description of the payment
		driver.findElement(By.id("sp_description")).sendKeys("Food payment");
		Thread.sleep(1000);
		
		// Submit payment
		driver.findElement(By.id("pay_saved_payees")).click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}
