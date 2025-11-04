package Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicMethod {

    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        driver.manage().window().setPosition(new Point(100,100));
//        driver.manage().window().setSize(new Dimension(1000,800));

        driver.manage().window().maximize();
        driver.navigate().to("https://anhtester.com");
        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);


//        System.out.println("URL of page: " + driver.getCurrentUrl());
//        System.out.println("Title of page: " + driver.getTitle());
//        System.out.println("Page source: ");
//
//        System.out.println(driver.getPageSource());



        driver.quit();



    }
}
