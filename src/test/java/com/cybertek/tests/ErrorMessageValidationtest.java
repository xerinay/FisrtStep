package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.ListingPage;
import com.cybertek.pages.PrestashopHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidationtest extends TestBase {

    HomePage homePage=new HomePage();


    @Test
    public void wrongEmailTest(){
        driver.get(ConfigurationReader.getProperty("url"));

       // driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("admin");
        homePage.username.sendKeys("admin");

       // driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        homePage.password.sendKeys("test");

      //  driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        homePage.loginButton.click();

        String error = "Invalid Login or Password.";
      //  String actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String actualError=homePage.errorMessage.getText();

        Assert.assertEquals(actualError,error);
    }

    @Test
    public void wrongPasswordTest(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("wrongpassword");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        homePage.username.sendKeys("Tester");
        homePage.password.sendKeys("wrong password");
        homePage.loginButton.click();

        String expectedError = "Invalid Login or Password.";
      //  String actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String actualError=homePage.errorMessage.getText();
        Assert.assertEquals(actualError,expectedError);

    }
    @Test
    public void noUserNameTest(){
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        homePage.username.sendKeys("");
        homePage.password.sendKeys("test");
        homePage.loginButton.click();

        String expectedError = "Invalid Login or Password.";
        String actualError = driver.findElement(By.id("ctl00_MainContent_status")).getText();
        Assert.assertEquals(actualError,expectedError);
    }
    @Test
    public void blankUsername(){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        homePage.login("","test");
        String expectedError="invalid login or password";
        String actualError=homePage.errorMessage.getText();
                Assert.assertEquals(actualError,expectedError);
    }
    //this is a method that does not do anything
    @Test
    public void test(){
        ListingPage nilesLane = new ListingPage();
        ListingPage palmetLane = new ListingPage();

        PrestashopHomePage prestaShopHomePage = new PrestashopHomePage();

        WebElement tshirt = prestaShopHomePage.product("tshirt");
        WebElement dress = prestaShopHomePage.product("dress");

    }
}




