package com.cybertek.tests;

public class ExceptionDemo {
    public static void main(String[] args) {
        // I teach on Tuesday   --> normal flow
        // If I get sick,       -->  problem, issue
        // some will replace me   --> alternative flow
        try {
            System.out.println("Maruf is teaching on Tuesday");
        }catch (Exception e){
            System.out.println("Akbar will take over");
        }
    }
}