package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("moe_alfadhli@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("asdfgh");
        //driver.findElement(By.name("login")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
