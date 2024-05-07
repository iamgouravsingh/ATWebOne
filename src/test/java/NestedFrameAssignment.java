import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();

        System.out.println(driver.findElements(By.tagName("frame")).size());

        //driver.switchTo().frame(1);
        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        //driver.findElement(By.name("frame-middle")).click();

        //driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
