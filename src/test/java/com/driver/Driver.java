package com.driver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

  public WebDriver driver;

  public WebDriver getDriver(String url){
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/windows/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    return driver;
  }

  public void closeDriver(){
    driver.close();
    driver.quit();
  }

}
