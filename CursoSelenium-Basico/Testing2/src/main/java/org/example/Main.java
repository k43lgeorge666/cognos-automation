package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws  InterruptedException {

        {
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com/");
            driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys("cantidad de paises");
            driver.findElement(By.xpath("//*[@title='Buscar']")).sendKeys(Keys.ENTER);

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.quit();
        }
    }
}