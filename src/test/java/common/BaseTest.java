package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    public static void createDriver() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        System.out.println("Driver created successfully.");
    }

    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit successfully.");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        Thread.sleep(1000);
        quitDriver();
    }
}
