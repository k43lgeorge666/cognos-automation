package org.example;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main
{
    public static void main(String[] args) throws InterruptedException {
        {
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.selenium.dev/");
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.quit();
        }
    }

}