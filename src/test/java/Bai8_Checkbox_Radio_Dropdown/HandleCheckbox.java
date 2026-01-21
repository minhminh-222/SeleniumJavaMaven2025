package Bai8_Checkbox_Radio_Dropdown;

import Bai5_Locator.Baitap.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox {
    public static void HandleCheckbox1() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://demoqa.com/checkbox");

        //Chon checkbox
        driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
        System.out.println("Home checkbox is selected");
        //kiểm tra checkbox đã chọn
        boolean isSelected = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Is Home checkbox selected: " + isSelected);
        Thread.sleep(2000);
        //bỏ chọn checkbox
        driver.findElement(By.xpath("//label[@for='tree-node-home']")).click();
        System.out.println("Home checkbox is selected");
        //kiểm tra checkbox đã bỏ chọn
        boolean isSelected2 = driver.findElement(By.xpath("//input[@id='tree-node-home']")).isSelected();
        System.out.println("Home checkbox is unselected: " + isSelected2);
        Thread.sleep(2000);
        driver.quit();
    }

    public static void HandleCheckbox2() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[normalize-space()='Dashboard Options']")).click();
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[contains(@id, 'dashboard')]//input[@type='checkbox']"));
        System.out.println("Total checkboxes found: " + checkboxes.size());
        boolean check = false;
        for (int i=0; i<checkboxes.size(); i++) {
            if (checkboxes.get(i).isSelected()) {
                System.out.println("Checkbox " + (i + 1) + " is already selected.");
                check = true;
            } else {
                System.out.println("Checkbox " + (i + 1) + " is not selected. Selecting it now.");
                check = false;
                break;
            }
        }


        driver.quit();

    }

    static void main(String[] args) throws InterruptedException {
        //HandleCheckbox1();
        HandleCheckbox2();
    }
}
