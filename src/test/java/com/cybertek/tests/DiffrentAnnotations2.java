package com.cybertek.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DiffrentAnnotations2 {
    @Test
    public void testOne(){
        System.out.println("this is test one");

    }
    @Test
    public void testTwo() {
        System.out.println("this is test two");
    }
    @AfterMethod
    public void afterMethod() {//runs everytime after each method
        System.out.println("this is after method");
    }
        @AfterClass
                public void afterClass(){
            System.out.println("after class");//runs at the last
        }
    }
