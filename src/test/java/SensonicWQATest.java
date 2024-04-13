import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SensonicWQATest {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://qa.digivaletliving.com/");
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='text'][1]")).click();
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("winthrop.qa@digivaletusers.com");
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Winthropq@2024");
        driver.findElement(By.xpath("//button")).click();

    }
}
