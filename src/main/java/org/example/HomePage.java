package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

   @BeforeMethod
  void setUpTest(){
       setupDriver("https://www.amazon.com");
   }


    @Test
    void tstDeals(){


    }
}