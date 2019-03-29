package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prictice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/shernaysawut/Downloads/chromedriver");
        //open browser
        WebDriver driver = new ChromeDriver();
        //open application
        driver.get("https://www.amazon.com");
        //locate the element by using ID locator
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7 plus case");
    driver.findElement(By.className("nav-input")).click();
 driver.findElement(By.linkText("Marble Phone Case Compatible with iPhone 8 Plus iPhone 7 Plus Floral Pattern IMD Hybrid Hard TPU Cover Shockproof Protective Cute Apple Phone Cases for Women Girls Men Boys-Pink Blue White[5.5\"]")).click();

driver.findElement(By.id("add-to-cart-button")).click();
driver.findElement(By.id("hlb-ptc-btn-native")).click();
//Tag Name : Tag Name locator is used to find the elements matching the specified Tag Name.
// It is very helpful when we want to extract the content within a Tag. Ex :heading1 = driver.find_element_by_tag_name('h1')



    }
}
