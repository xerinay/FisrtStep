package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chechBox {
    public static void main(String[] args) {
        /*
go to https://the-internet.herokuapp.com/forgot_password
verify enter email and submit
verify email sent message on the next page
"Your e-mail's been sent!"
 */
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        //setting driver path for chrome using the webdriver manage
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        WebElement input = driver.findElement((By.id("email")));
        // input.sendKeys("someemail@someemail.com"+ Keys.ENTER);//u cant use it out side
        input.sendKeys("somemeail@somemail.com");
        input.submit();//u can use it seperatly

        String expected ="Your e-mail's been sent!";
        String actual = driver.findElement(By.id("content")).getText();
        if (actual.equals(expected)) {
            System.out.println("pass");
        } else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }


    }
}