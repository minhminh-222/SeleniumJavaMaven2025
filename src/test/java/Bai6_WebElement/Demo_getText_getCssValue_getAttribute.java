package Bai6_WebElement;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_getText_getCssValue_getAttribute {

    static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");

        //Get Attribute Email
        String AttributeEmail = driver.findElement(By.xpath(LocatorsCRM.inputEmail)).getAttribute("value");
        System.out.println("Attribute Email: " + AttributeEmail);

        //Get Attribute password
        String AttributePassword = driver.findElement(By.xpath(LocatorsCRM.inputPassword)).getAttribute("value");
        System.out.println("Attribute Password: " + AttributePassword);

        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        //driver.findElement(By.xpath(LocatorsCRM.inputPassword)).submit();

        Thread.sleep(2000);

        //Get text
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        System.out.println("Header Customers page: " + driver.findElement(By.xpath(LocatorsCRM.headerCustomerspage)).getText());
        Thread.sleep(2000);

        System.out.println("Total Customers: " + driver.findElement(By.xpath("//span[normalize-space()='Total Customers']/preceding-sibling::span")).getText());

        //Get Css value
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Total Customers']/preceding-sibling::span")).getCssValue("color"));
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Total Customers']/preceding-sibling::span")).getCssValue("font-family"));
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Total Customers']/preceding-sibling::span")).getCssValue("font-size"));
        Thread.sleep(2000);

        driver.quit();




    }
}
