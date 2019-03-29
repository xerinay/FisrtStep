package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class MixedAnnotations {
    WebDriver driver;
    @BeforeClass//first thing , before everyting starts
    public void beforeClass(){
        System.out.println("Setting up the drivers here");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod //before first method that we write
    public void setUpTMethod(){
        System.out.println("Opening a browser");
       driver=new ChromeDriver();
        System.out.println("go to website and login");
        driver.get("https://google.com");
    }

    @Test //method
    public void testOne(){
        System.out.println("Testing testing testing: account info");
    }

    @AfterMethod
    public void afterMethod(){//after each method
        System.out.println("logout");
        System.out.println("closing browser");
    }

    @AfterClass
    public void afterClass(){ //after whole class
        System.out.println("report everything");
    }


    @Test //second method
    public void testTwo(){
        System.out.println("Testing testing testing: payment");
    }
}