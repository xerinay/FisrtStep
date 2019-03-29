package com.cybertek.tests;

import com.github.javafaker.Faker;

public class Anything {
    public static void main(String[] args) {
       // System.out.println("hahahhahahhah");
        Faker faker=new Faker();
        System.out.println(faker.funnyName().name());
        System.out.println(faker.book().title());
        System.out.println(faker.business().creditCardExpiry());
        System.out.println(faker.avatar().image());
    }


}
