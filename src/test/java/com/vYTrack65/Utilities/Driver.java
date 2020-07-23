package com.vYTrack65.Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    private Driver(){ }

    private static WebDriver driver;

   public static WebDriver getDriver() {

       String browser = ConfigurationReader.getProperty("browser");

       if (driver == null) {

           switch (browser) {
               case "chrome":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;

               case "firefox":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver();
                   break;

               case "chrome-headless":
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                   break;

               case "firefox-headless":
                   WebDriverManager.firefoxdriver().setup();
                   driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                   break;

           }

       }
             return driver;

   }

   public static void closeDriver(){

       if (driver !=null){
           driver.quit();
           driver=null;
       }
   }
}
