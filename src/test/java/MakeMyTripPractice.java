import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MakeMyTripPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("fromCity")).click();
        driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Indore");
        Thread.sleep(2000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
        driver.findElement(By.id("toCity")).click();
        driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Mumbai");
        Thread.sleep(2000);
        driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();

    }
}
