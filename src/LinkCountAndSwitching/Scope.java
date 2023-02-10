package LinkCountAndSwitching;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) {
        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // 1. counting the number of links on the page.
        int f = driver.findElements(By.tagName("a")).size();
        System.out.println(f);

        // 2.get the links only on the footer. limit the driver first
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        int f1 = footerDriver.findElements(By.tagName("a")).size();
        System.out.println(f1);

        // 3.count number of links on the column
        WebElement colomndriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        int f2 = colomndriver.findElements(By.tagName("a")).size();
        System.out.println(f2);

        // 4.click each element in the colomn then check if they are opening
        for (int i = 1; i < colomndriver.findElements(By.tagName("a")).size(); i++) {

            String linkOnNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

            colomndriver.findElements(By.tagName("a")).get(i).sendKeys(linkOnNewTab);
            ;

        }
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
