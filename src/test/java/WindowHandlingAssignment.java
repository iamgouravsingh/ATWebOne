import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingAssignment {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);

        String childText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();

        System.out.println(childText);

        driver.switchTo().window(parentId);

        String parentText = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();

        System.out.println(parentText);


    }
}
