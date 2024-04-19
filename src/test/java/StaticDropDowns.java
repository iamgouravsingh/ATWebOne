import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StaticDropDowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);

        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
}
