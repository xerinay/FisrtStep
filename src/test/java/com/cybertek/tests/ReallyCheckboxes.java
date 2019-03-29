package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ReallyCheckboxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
WebElement monday=driver.findElement(By.id("gwt-debug-cwCheckBox-Monday-input"));
        System.out.println(monday.isSelected());
monday.click();
        System.out.println(monday.isSelected());
        if(!monday.isSelected()){
            monday.click();
        }
        System.out.println(monday.isSelected());
    }
}