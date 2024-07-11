import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GBTC {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dshycmreoihf0.cloudfront.net/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //WebElement element = driver.findElement(By.xpath("//p[@class='mb-2']"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        //js.executeScript(“arguments[0].scrollIntoView();”, element);
        //driver.close();

        driver.findElement(By.xpath("//ul[@class='md:flex align-items-center justify-content-start list-none menu hidden']//button[@type='button'][normalize-space()='Connect wallet']")).click();

        driver.findElement(By.xpath("//p-button[@class='p-element block w-full mb-3 text-center ng-star-inserted']//button[@type='button']")).click();


    }
}
