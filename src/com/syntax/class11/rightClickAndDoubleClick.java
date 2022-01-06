package com.syntax.class11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class rightClickAndDoubleClick {

    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);



        



    }
}
