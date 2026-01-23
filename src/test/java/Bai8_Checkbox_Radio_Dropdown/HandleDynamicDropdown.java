package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;

public class HandleDynamicDropdown extends BaseTest {

    public static void main() throws InterruptedException {
      // Goi ham tao driver tu lop BaseTest
      createDriver();
      //Mở trang web cần kiểm thử
      driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
      Thread.sleep(2000);
      //Click dropdown field
       driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
       //Search từ khóa trong dropdown
       driver.findElement(By.xpath("//span[normalize-space()='Select a Category']//parent::a/following-sibling::div//input")).sendKeys("Fitness");
       Thread.sleep(2000);
       //In ra option được nhập
        System.out.println("Option entered: " + driver.findElement(By.xpath("//span[normalize-space()='Select a Category']//parent::a/following-sibling::div//input")).getAttribute("value"));
       //Chon gia tri trong dropdown
       driver.findElement(By.xpath("//li[@data-option-array-index='4']")).click();
       Thread.sleep(2000);
      //Goi ham thoat driver tu lop BaseTest
      quitDriver();

    }
}
