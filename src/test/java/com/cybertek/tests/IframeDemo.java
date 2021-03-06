package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframeDemo {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/tinymce");

        // locate the iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        // switch to iframe
        driver.switchTo().frame(iframe);



        driver.findElement(By.tagName("body")).
                sendKeys("Congratulation!!! you just Won 1 Million dollars. For more information please click here.");

        driver.switchTo().parentFrame();
        driver.findElement(By.linkText("Elemental Selenium")).click();



    }
}
