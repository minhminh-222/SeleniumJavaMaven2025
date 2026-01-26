package BaitapS5_S8;

import Bai5_Locator.Baitap.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

public class HandleNewCustomer extends BaseTest {

    public static void OpenCustomerPage() throws InterruptedException {
        //Login first
        driver.get(LocatorsCRM.url);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();
        Thread.sleep(1000);

        //Navigate to Customers page
        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        Thread.sleep(1000);

        //Get total customers before adding new customer
        int totalCustomersbefore = Integer.parseInt("//span[normalize-space()='Total Customers']/preceding-sibling::span");
        System.out.println("Total customers before adding new: " + totalCustomersbefore);
    }

       public static void OpenNewCustomerPage() throws InterruptedException {

        //Navigate to New Customers page
        driver.findElement(By.xpath(LocatorsCRM.buttonNewCustomers)).click();
        Thread.sleep(1000);

    }

    public static void InputNewCustomerDate(String companyName) throws InterruptedException {

        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys(companyName);
        driver.findElement(By.xpath(LocatorsCRM.inputVatNumber)).sendKeys("123456789");
        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).sendKeys("01234567890");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://crm.anhtester.com/admin/clients/client");

        driver.findElement(By.xpath(LocatorsCRM.inputGroup)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.selectGroupVIP)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputGroup)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.inputCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys("USD", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.inputDefaultLanguage)).click();
        //driver.findElement(By.xpath(LocatorsCRM.selectDefaultLanguage)).click();
        //driver.findElement(By.xpath(String.format(LocatorsCRM.selectDefaultLanguage2, "Vietnamese"))).click();    //cách 2: truyền tham số vào biến
        driver.findElement(By.xpath(LocatorsCRM.xpathSelectLanguage("Vietnamese"))).click();  //cách 3: gọi hàm và truyền tham số vào
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Phong Quang");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Thanh pho Hue");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Thanh pho Hue");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("12345");

        driver.findElement(By.xpath(LocatorsCRM.inputCountry)).click();
        driver.findElement(By.xpath(LocatorsCRM.selectCountry)).sendKeys("Vietnam", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.buttonSaveCustomers)).click();
        Thread.sleep(2000);

    }

    public static void searchNewCustomer(String companyName) throws InterruptedException {

        driver.findElement(By.xpath(LocatorsCRM.menuCustomers)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomers)).sendKeys(companyName, Keys.ENTER);
        Thread.sleep(2000);

        String companyNameFound = driver.findElement(By.xpath("//table[@id='clients']//tbody/tr[1]/td[3]/a")).getText();
        System.out.println("Company name found: " + companyNameFound);
    }

    public static void main(String[] args) throws InterruptedException {
        createDriver();
        OpenCustomerPage();

        int totalCustomersbefore = Integer.parseInt(driver.findElement(By.xpath( "//span[normalize-space()='Total Customers']/preceding-sibling::span")).getText());
        System.out.println("Total customers before adding new: " + totalCustomersbefore);

        OpenNewCustomerPage();
        InputNewCustomerDate("Company 01" + LocatorsCRM.formatted);
        searchNewCustomer("Company 01 + LocatorsCRM.formatted");

        //Get total customers after adding new customer
        int totalCustomersafter = Integer.parseInt(driver.findElement (By.xpath("//span[normalize-space()='Total Customers']/preceding-sibling::span")).getText());
        System.out.println("Total customers after adding new: " + totalCustomersafter);

        if (totalCustomersafter == (totalCustomersbefore + 1)) {
            System.out.println("New customer added successfully.");
        } else {
            System.out.println("Failed to add new customer.");
        }


        quitDriver();
    }
}
