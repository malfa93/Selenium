package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class insta {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://syntaxprojects.com/window-popup-modal-demo.php");

        WebElement instaButton = driver.findElement(By.xpath("//a[@title='Follow @syntaxtech on Instagram']"));


        instaButton.click();

        Set<String> windowHandles = driver.getWindowHandles();

        Iterator<String> iterator = windowHandles.iterator();

        while(iterator.hasNext()){

            String handle = iterator.next();

            driver.switchTo().window(handle);
            System.out.println(handle);
            System.out.println(driver.getTitle());

        }


    }
}
