package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        //to maximize the window.
        driver.manage().window().maximize();

        //to show on full screen
        driver.manage().window().fullscreen();

    }
}
