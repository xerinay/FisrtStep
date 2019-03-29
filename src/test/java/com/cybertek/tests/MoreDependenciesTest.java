package com.cybertek.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MoreDependenciesTest {
   @Test
   public void openBrowser(){
       System.out.println("opening browser");
   }
   @Test(dependsOnMethods = "openBrowser")
    public void login(){
       System.out.println("login");
   }
//   @Test(dependsOnMethods = "login")
//    public void logOut(){
//       System.out.println("logout");
//   }
   @AfterMethod
    public void cleanUp(){
       System.out.println("close browser");
   }
}
