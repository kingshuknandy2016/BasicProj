package com.pages;

import com.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends Driver {

  @FindBy(xpath = "//input[@name='q']")
  private WebElement searchOpt;

  public GooglePage(){
    getDriver("https://www.google.com/");
    PageFactory.initElements(driver,this);
  }

  public void searchItem(String itemName){
    searchOpt.sendKeys(itemName);
  }

}
