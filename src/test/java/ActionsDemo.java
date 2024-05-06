import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Actions a = new Actions(driver);

        WebElement move = driver.findElement(By.id("nav-link-accountList"));

        WebElement sendCapital = driver.findElement(By.id("twotabsearchtextbox"));

        a.moveToElement(sendCapital).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();

        a.moveToElement(move).contextClick().build().perform();
    }
}
