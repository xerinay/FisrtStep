package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {
        WebDriver driver;
        public void starts(){
            System.out.println("=======browser session started=====");
              driver =new ChromeDriver();
              driver.manage().window().maximize();
            System.out.println("application started");
        }

    public void endtest() {
        driver.quit();
        System.out.println("=====broswser session end ======");

    }

    {

    }
    }
