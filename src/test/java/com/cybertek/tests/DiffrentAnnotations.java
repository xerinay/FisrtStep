package com.cybertek.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiffrentAnnotations {
    @Test
    public void testOne(){
        System.out.println("this is test one");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");//runs first then comes step by step so it runs twice in this case
    }
    @Test
    public void testTwo() {
        System.out.println("this is test two");
    }
}
