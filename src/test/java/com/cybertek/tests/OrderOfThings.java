package com.cybertek.tests;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class OrderOfThings {
    @Test
    public void test2() {
        System.out.println("executing #1");
    }

    @Test
    public void test1() {
        System.out.println("executing test2");
    }

    @Test(priority = 3)
    public void test4() {
        System.out.println("executing test3");
    }
    @Ignore //will ignore the method
    @Test(priority = 4-5)
    public void test3(){
        System.out.println("executing 3");
    }
}