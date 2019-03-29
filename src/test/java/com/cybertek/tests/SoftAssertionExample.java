package com.cybertek.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
    @Test
    public void test1() {
        System.out.println("starting");
        Assert.assertTrue(true);
        System.out.println("done ");

    }
    @Test
    public void test2(){
        SoftAssert softAssert=new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(true);//if its false it will be failure
        softAssert.assertEquals("goodle","etsy");
        System.out.println("done");
        softAssert.assertAll();

    }
@Test
    public void test3(){
        SoftAssert softAssert=new SoftAssert();
    System.out.println("starting");
    softAssert.assertTrue(false);
    softAssert.assertTrue(false);

    System.out.println("done");
    softAssert.assertAll();

}
}