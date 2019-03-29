package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo extends TestBase {
    //open chrome
    //go to google
    //enter search for selinum cookbook
    //verify title contains the search
    @Test
    public void titleTest(){
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("selinum cookbook"+ Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("selenium cookbook"));

    }
}
