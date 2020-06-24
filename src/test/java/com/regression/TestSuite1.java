package com.regression;

import com.pages.GooglePage;
import org.testng.annotations.Test;

public class TestSuite1 {

  @Test
  public void runTestCase1() throws InterruptedException {
    GooglePage googlePage=new GooglePage();
    googlePage.searchItem("Tea");
    Thread.sleep(7000);
    googlePage.closeDriver();
  }

}
