package Assessments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

//	        int numberOfFrames = driver.findElements(By.tagName("frame")).size();

		driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset//frame[1]")));

//	        System.out.println("no. of iframes are " + numberOfFrames);

		driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset//frame[2]")));

//	        driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[2]]")));
//	        System.out.println("no. of iframes are " + numberOfFrames);

//	        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
//	        driver.switchTo().frame(driver.findElement(By.xpath("//html/frameset/frame[1]")));
//	        
//	        
//	        System.out.println(driver.switchTo().frame(driver.findElement(By.xpath("//div")))); 
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
