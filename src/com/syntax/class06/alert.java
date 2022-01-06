package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //enable the alert

        driver.findElement(By.cssSelector("button#alert")).click();

        //Switch the focus of Selenium to alert

        Alert simpleAlert = driver.switchTo().alert();

        simpleAlert.accept();



        driver.findElement(By.cssSelector("button#confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();

        System.out.println(confirmAlert.getText());
        confirmAlert.dismiss();


        driver.findElement(By.cssSelector("button#prompt")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();

        promptAlert.sendKeys("Moe");
        promptAlert.accept();




    }
}
