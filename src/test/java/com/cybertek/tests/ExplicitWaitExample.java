package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitExample {
    //have to call everytime seperatly
    //need webdriver object when u use explicit wait
    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");
        //click on enable
        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//button")).click();
       //creating object
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        //waits certien things to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        Thread.sleep(1000);
        //enter the text
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("hello world");

    }
}
