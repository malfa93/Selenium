package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        //Thread.sleep(2000);
        driver.navigate().to("http://www.google.com");
        //Thread.sleep(2000);
        driver.navigate().back();
        //Thread.sleep(2000);
        driver.navigate().forward();
        //Thread.sleep(2000);
        driver.quit();

    }
}