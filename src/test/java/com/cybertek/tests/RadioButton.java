package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Implicit waits tell to the WebDriver to wait for a certain amount of time before it throws an exception. Once we set the time, WebDriver will wait for the element based on the time we set before it throws an exception. The default setting is 0 (zero).
        // We need to set some wait time to make WebDriver to wait for the required time.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //it throws an exception,if the element is not loaded withinn frame time
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwRadioButton ");
        // verify blue and red not checked
        WebElement blue=driver.findElement(By.id("gwt-debug-cwRadioButton-color-blue-input"));
        WebElement red=driver.findElement(By.id("gwt-debug-cwRadioButton-color-red-input"));
        System.out.println("DEFAULT");
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());
        // check blue
        System.out.println("Clicking on blue");
        blue.click();
        // verify blue checked, red not checked
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());
        // check red
        System.out.println("Clicking red");
        red.click();
        // verify blue not checked, red is checked
        System.out.println("blue: " + blue.isSelected());
        System.out.println("red: " + red.isSelected());
    }
}// What is the difference between driver.get() anddriver.navigate.to(“url”)?
        //driver.get(): To open an URL and it will wait till the whole page gets loaded
       // driver.navigate.to(): To navigate to an URL and It will not wait till the whole page gets loaded