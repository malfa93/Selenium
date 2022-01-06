package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class actionClass {

    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        // switch to iframe

        driver.switchTo().frame(0);

        // locate the draggable

        WebElement draggable = driver.findElement(By.cssSelector("div#draggable"));

        // locate the dropoff location

        WebElement droppable = driver.findElement(By.cssSelector("div#droppable"));

        Actions action = new Actions(driver);

        // drag the element and drop it off

                //action.dragAndDrop(draggable, droppable).perform();

        // another way of doing it:

        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform(); // use build when using multiple methods




    }
}
