package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathUsingText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/");
        WebElement alertElement = driver.findElement(By.xpath("//a[text()='Alerts & Modals']"));
        alertElement.click();



    }
}
