package Assessments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();

		String word = driver.findElement(By.cssSelector("label[for='benz']")).getText();

		word.trim();

		System.out.println(word);

		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropdown);

		dropDown.selectByVisibleText(word);

		driver.findElement(By.id("name")).sendKeys(word);

		driver.findElement(By.id("alertbtn")).click();

		String verifying = driver.switchTo().alert().getText();

		if (verifying.contains(word)) {
			System.out.println("Bravo! The text is present");
		} else {
			System.out.println("Oops! Try again");
		}

		driver.switchTo().alert().accept();

	}
}
