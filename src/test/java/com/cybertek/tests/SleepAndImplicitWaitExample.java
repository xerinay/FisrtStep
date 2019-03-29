package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SleepAndImplicitWaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();

    }

    @Test
    public void testSleep() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();
        //will pause the excution of the test
        Thread.sleep(9000);//make it stop for 9 second
        System.out.println("1 "+driver.findElement(By.id("finish")).getText());

    }

    @Test
    public void implicitWait() {
        //whenever u try to find a element u give sometime if it cant find in that specific time it will be colose deautomatically
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.tagName("button")).click();
        System.out.println("2"+driver.findElement(By.id("finish")).getText());

    }
    @Test
    public void implicyWait2(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //click the remove button
        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();
        //print the message
        System.out.println(driver.findElement(By.id("message")).getText());
        //clivk on add button
        driver.findElement(By.cssSelector("form#checkbox-example>button")).click();
        //verify checkbox is displayes
        System.out.println(driver.findElement(By.id("checkbox")).isDisplayed());


    }

}

