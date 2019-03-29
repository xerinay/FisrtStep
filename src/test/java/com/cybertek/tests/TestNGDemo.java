package com.cybertek.tests;

import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void testOne(){
        System.out.println("hello world!");
        String expected="a";
        String actual ="b";
        if(expected.equals(actual)) {

        }else {
            System.out.println("fail");
        }

        //this is how u test in TestNG
    }

}
