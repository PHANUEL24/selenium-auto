package CalendarPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.path2usa.com/travel-companion/");

        WebElement element = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));

        Actions actions = new Actions(driver);
        
        actions.moveToElement(element).build().perform();
        
        element.click();

        // driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
    }
}
