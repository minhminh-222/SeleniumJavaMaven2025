package Bai6_WebDriver;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_isDisplayed_isEnabled_isSelected {

    static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        boolean checkHeaderLoginPage = driver.findElement(By.xpath(LocatorsCRM.headerLoginpage)).isDisplayed();
        System.out.println("Header Login page is displayed: " + checkHeaderLoginPage);

        boolean checkRememberMeisSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).isSelected();
        System.out.println("Checkbox Remember Me is selected: " + checkRememberMeisSelected);

        driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).click();
        Thread.sleep(1000);

        boolean checkRememberMeisSelectedAfterClick = driver.findElement(By.xpath(LocatorsCRM.checkboxRememberMe)).isSelected();
        System.out.println("Checkbox Remember Me is selected after click: " + checkRememberMeisSelectedAfterClick);

        Thread.sleep(3000);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(5000);

        boolean checkButtonSubmitisDisplayed = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isDisplayed();
        System.out.println("Button Submit is displayed: " + checkButtonSubmitisDisplayed);

        boolean checkButtonSubmitisEnabled = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Button Submit is enabled: " + checkButtonSubmitisEnabled);

        driver.quit();


    }
}
