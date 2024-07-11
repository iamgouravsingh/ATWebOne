import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Documente {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://documente.envistudios.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("documente-plan-free")).click();
        driver.findElement(By.cssSelector("input[name='userFirstName']")).sendKeys("Gourav");
        driver.findElement(By.cssSelector("input[name='userLastName']")).sendKeys("Singh");
        driver.findElement(By.cssSelector("input[name='userEmail']")).sendKeys("gourav.singh12345678@yopmail.com");
        driver.findElement(By.cssSelector("input[name='userOrganization']")).sendKeys("GSS Tech");
        driver.findElement(By.cssSelector("button.btn.btn-primary.w-100")).click();
        Thread.sleep(10);
        driver.findElement(By.cssSelector("div.SubmitButton-IconContainer")).click();
        Thread.sleep(10);
        WebElement textElement = driver.findElement(By.xpath("//h4[contains(text(),'Awesome! Your subscription is confirmed!')]"));
        String actualText = textElement.getText();
        String expectedText = "Awesome! Your subscription is confirmed!";
        Assert.assertEquals(actualText,expectedText);









    }
}
