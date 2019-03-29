package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class waintExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        //can be used to pause the execution of current thread for specified time in milliseconds
        Thread.sleep(3000);//only works one time so if u u wanna pause more u have to put more after the the step that u wanna pause

        //wait when u cannot find something ,it only applies to find element method
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
// username tutorial
// password tutorial
       driver.findElement(By.name("userName")).sendKeys("tutorial");
               driver.findElement(By.name("password")).sendKeys("tutorial");

    }
}