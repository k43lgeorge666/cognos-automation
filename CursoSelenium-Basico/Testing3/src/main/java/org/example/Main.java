package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.firefox.driver", "C:\\drivers\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");

        //Locating the web elements
        WebElement create_account_option = driver.findElement(By.xpath("//*[.=\"Create an Account\"]"));
        WebElement firstname = driver.findElement(By.id("firstname"));
        WebElement lastname = driver.findElement(By.id("lastname"));

        WebElement email = driver.findElement(By.id("email_address"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement pass_conf = driver.findElement(By.id("password-confirmation"));
        WebElement create_account_button = driver.findElement(By.xpath("//*[@title=\"Create an Account\"]"));

        //Performing actions with the web elements

        create_account_option.click();
        firstname.sendKeys("Juan");
        lastname.sendKeys("Lopez");
        email.sendKeys("JuanLopezperez@gmail.com");
        password.sendKeys("Admin@12345");
        pass_conf.sendKeys("Admin@12345");
        create_account_button.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }

}