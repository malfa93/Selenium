package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

        //      Switch to the desired frame as our desired webElement is inside that frame
        driver.switchTo().frame("frame1");
        //        getting the webElement
        WebElement text1 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is   :" + text1.getText());

//        as frame 2 doesn't lie inside frame 1 so inorder to get there we need to
//        switch our focus to the default page
        driver.switchTo().defaultContent();


//    switch to frame 2
        driver.switchTo().frame("frame2");
//        locate the webElement
        WebElement text2 = driver.findElement(By.cssSelector("h1#sampleHeading"));
        System.out.println("the text is   :" + text2.getText());


//in order to click on webElement "Form"
//switch the focus back to the default
        driver.switchTo().defaultContent();
// i can simply locate element as it is not inside the frame and perform operations on it


    }
}
