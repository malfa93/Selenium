package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImpossible {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println("Title of the website is: "+title);
        System.out.println("URL of the website is: "+url);
        //driver.quit();
    }

}
