import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("Gourav");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("12345");//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("12345");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9993808086");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Gourav");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input[type='checkbox']:nth-child(1)")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        //driver.close();
    }
}

