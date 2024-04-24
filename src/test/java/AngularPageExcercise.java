import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class AngularPageExcercise {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.name("name")).sendKeys("Gourav Singh Sisodiya");
        driver.findElement(By.name("email")).sendKeys("sis.gourav17@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Abcd1234#");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));

        Select dropdown = new Select(staticDropdown);

        dropdown.selectByIndex(0);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("Male");

        driver.findElement(By.cssSelector("#inlineRadio1")).click();

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        System.out.println((driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText()));





    }
}
