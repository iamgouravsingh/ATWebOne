import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GeicoChallenge {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.geico.com/");
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//input[@placeholder='5-Digit ZIP Code'][1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='5-Digit ZIP Code'][1]")).sendKeys("12345");

    }
}
