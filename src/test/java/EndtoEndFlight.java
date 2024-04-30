import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class EndtoEndFlight {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BHO']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        //driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("Is disabled");
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        for (int i = 1; i <= 2; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }
}
