package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadAFile {

    public static String url = "https://the-internet.herokuapp.com/upload";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        WebElement choosefile = driver.findElement(By.cssSelector("input#file-upload"));

        // in order to upload the file

        choosefile.sendKeys("/Users/mohammedalfadhli/Desktop/Excel Stuff/Test123.xlsx");
//        locate the submit and click upload
        driver.findElement(By.cssSelector("input#file-submit")).click();


    }
}
