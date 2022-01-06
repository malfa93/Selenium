package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxTime {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/implicit-wait-example");

        for (int i = 1; i >0 ; i++) {
            Thread.sleep(11000);

            WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']["+i+"]"));

            cb.click();

        }










    }
}
