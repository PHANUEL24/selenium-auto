package Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Phanuel";
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(name);

		driver.findElement(By.id("alertbtn")).click();

		// printing string from the alert window
		System.out.println(driver.switchTo().alert().getText());

		// switching to alert window
		driver.switchTo().alert().accept();

		// when the popup have two values like yes or no
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
