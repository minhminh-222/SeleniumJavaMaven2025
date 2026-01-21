package Bai8_Checkbox_Radio_Dropdown;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleRadio {
    public static void HandleRadio1() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://demoqa.com/radio-button");

        //Chon checkbox
        boolean selectedradio = driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
        System.out.println("Radio button is selected: " + selectedradio);
        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        boolean selectedradio2 = driver.findElement(By.xpath("//input[@id='yesRadio']")).isSelected();
        System.out.println("Radio button is selected: " + selectedradio2);
        Thread.sleep(2000);
        driver.quit();
    }

    public static void Handlelistradio() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[@class='menu-item-sales']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Proposals']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Proposal']")).click();

        List<WebElement> listradio = driver.findElements(By.xpath("//span[normalize-space()='Show quantity as:']/following-sibling::div/input"));
        System.out.println("Total radio found: " + listradio.size());
        for (int i = 0; i < listradio.size(); i++) {
            if (listradio.get(i).isSelected()) {
                System.out.println("Radio " + (i + 1) + " is already selected.");
            } else {
                System.out.println("Radio " + (i + 1) + " is not selected.");
            }
        }

       int selected1 = 0;
        int selected2 = 0;
        for (int i=0; i<listradio.size(); i++) {
            if (listradio.get(i).isSelected()) {
                System.out.println("Radio " + (i + 1) + " is already selected.");
                selected1++;
            }
            else {
                System.out.println("Radio " + (i + 1) + " is not selected.");
                selected2++;

            }
        }
        System.out.println("Total selected radio: " + selected1);
        System.out.println("Total unselected radio: " + selected2);




        driver.quit();

    }

    static void main(String[] args) throws InterruptedException {
        //HandleRadio1();
        Handlelistradio();
    }
}
