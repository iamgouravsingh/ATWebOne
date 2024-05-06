import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class LoginPractiseChallenge {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");

        driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

        driver.switchTo().alert().accept();

        WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));

        Select dropdown = new Select(staticDropdown);

        dropdown.selectByIndex(0);

        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("Student");

        driver.findElement(By.xpath("//input[@name='terms']")).click();

        driver.findElement(By.id("signInBtn")).click();

    }
}
