import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseChallenge {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption2")).click();

        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getText();
    }
}
