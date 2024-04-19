import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();


    }
}
