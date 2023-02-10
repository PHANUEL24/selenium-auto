package Assessments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignemt5 {
	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset//frame[1]")));

		driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset//frame[2]")));

		System.out.println(driver.findElement(By.id("content")).getText());

	}
}
