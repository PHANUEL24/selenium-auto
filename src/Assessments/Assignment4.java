package Assessments;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {

        System.setProperty("webdiver.chrome.driver",
                "C:\\Users\\Phanuel.Mathonsi\\Documents\\drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Multiple Windows")).click();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();

        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);

        //System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
        System.out.println(driver.findElement(By.cssSelector(".example")).getText());
        
        driver.switchTo().window(parentId);

        //System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
