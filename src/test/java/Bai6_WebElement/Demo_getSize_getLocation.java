package Bai6_WebElement;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_getSize_getLocation {

    static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().height);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getSize().width);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().x);
        System.out.println(driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).getLocation().y);

        Thread.sleep(2000);

        driver.quit();




    }
}
