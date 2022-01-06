package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("http://syntaxprojects.com");
        WebElement buttonStart = driver.findElement(By.xpath("//a[@id='btn_basic_example']"));
        buttonStart.click();
        Thread.sleep(2000);

        WebElement buttonDemo = driver.findElement(By.xpath("//a[@class='list-group-item']"));
        buttonDemo.click();

        WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
        textField.sendKeys("Hello Mohammed");

        WebElement textButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        textButton.click();
    }
}
