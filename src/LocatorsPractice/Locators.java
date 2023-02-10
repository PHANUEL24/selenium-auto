package LocatorsPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "John";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// Sync for duration waiting
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		// opening URL
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// getting elements and inserting data
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();

		// for error
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0785185533");
		driver.findElement(By.xpath("//button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		driver.findElement(By.cssSelector(".logout-btn")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String [] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
		
	}
}
