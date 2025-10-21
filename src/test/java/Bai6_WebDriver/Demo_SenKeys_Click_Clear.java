package Bai6_WebDriver;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_SenKeys_Click_Clear {

    static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.inputEmail));
        driver.findElement(By.xpath(LocatorsCRM.inputPassword));


    }
}
