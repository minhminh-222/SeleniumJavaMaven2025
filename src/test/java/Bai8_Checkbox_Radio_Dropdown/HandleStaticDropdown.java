package Bai8_Checkbox_Radio_Dropdown;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HandleStaticDropdown extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        // Goi ham tao driver tu lop BaseTest
        createDriver();
        //Mở trang web cần kiểm thử
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(1000);
        //Handle static dropdown
        Select staticdropdown = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
        //In ra so luong option trong dropdown
        System.out.println("Total options in dropdown: " + staticdropdown.getOptions().size());
        //Chon gia tri trong dropdown bang visible text
        staticdropdown.selectByVisibleText("Red");
        Thread.sleep(1000);
        System.out.println("Selected option by visibletext: " + staticdropdown.getFirstSelectedOption().getText());
        //Chon gia tri trong dropdown bang index
        staticdropdown.selectByIndex(4);
        Thread.sleep(1000);
        System.out.println("Selected option by index: " + staticdropdown.getFirstSelectedOption().getText());
        //Chon gia tri trong dropdown bang value
        staticdropdown.selectByValue("6");
        Thread.sleep(1000);
        System.out.println("Selected option by value: " + staticdropdown.getFirstSelectedOption().getText());
        //Goi ham thoat driver tu lop BaseTest
        quitDriver();





    }
}
