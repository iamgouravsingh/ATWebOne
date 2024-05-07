import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class CountsOfLinks {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.systango.com/");

        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerDriver = driver.findElement(By.xpath("//body/div[2]/footer[1]/div[1]"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        WebElement footerDriverAbout = driver.findElement(By.xpath("//footer/div/div[2]/div[2]/ul"));

        for (int i = 1; i < footerDriverAbout.findElements(By.tagName("a")).size(); i++)
        {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footerDriverAbout.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
            Thread.sleep(5000);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

            /*String parentId = it.next();
            String childId = it.next();

            driver.switchTo().window(childId);
            System.out.println(driver.getTitle());*/

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }
}

