package Assessments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Phanuel");
		driver.findElement(By.name("email")).sendKeys("student@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(staticDropdown);
		gender.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("1998/03/11");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
		
	}

}
