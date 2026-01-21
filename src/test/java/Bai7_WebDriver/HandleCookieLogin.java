package Bai7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleCookieLogin {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);

        driver.manage().addCookie(new Cookie("sp_session","0ie2ilqnu0ksdf3c8rshdqd74qfkvtkl"));
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.quit();

    }

}
