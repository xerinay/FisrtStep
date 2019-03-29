package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CraglistTest {
    //.idea -->it is a folder created by intellij in all types of project.it stored
    //project related information
    //which is only imported for intellij
    //SRC--> this is where all the code written. when we look for any code, we have to llok inside
    //the src package,when we write a new java class, we have to write a new
    //inside the src package
    //SRC/main->all the application code is written in this package
    //SRC/test->test code will go in this folder
    //all the compile files,reports and other maven related stuff will be created
    //in this folder

    //.IML file->this is a file created by intellij in all types of projects.
    // it stores project related ifformation which is only important for intellij. WE IGNORE THIS FOLDER

    //SCRATCHES AND CONSOLES --> Sometimes you may need to create temporary notes
    // or draft up some code outside of the project context. Instead of switching to a different application for this purpose, you can use scratch files and scratch buffers, IGNORE
//pom file --> manages the dependencies and other stuff.
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //opening browser
          WebDriver driver=new FirefoxDriver();
          //opening the website
          driver.get("https://washingtondc.craigslist.org/");
         // driver.findElement(By.id("query")).sendKeys("corolla");
       driver.findElement(By.linkText("electronics")).click();
         //linkText have to be exact same
        //partialLinkText have to match some of the text of the link
        //driver.findElement(By.partialLinkText("+garden")).click();


    }
}
