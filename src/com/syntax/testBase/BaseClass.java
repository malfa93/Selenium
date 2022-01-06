package com.syntax.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;


    /**
     *This method will navigate to a website given a URL
     * @param url
     */
    public static void openWithSpecificUrl(String url){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);



    }

    /**
     * This Method will quit the opened browser
     */


    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }
}
