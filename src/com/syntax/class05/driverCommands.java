package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class driverCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("http://ebay.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        //print the size of list
        System.out.println("The size of the list containing links is: "+links.size());

        for (WebElement link:links) {
            //get the text out of a webElement.
           String  LinkText = link.getText();
           // only print the links that have some text and ignore the rest.

            if(!LinkText.isEmpty()){

                System.out.println(LinkText);

                //print all the links along with the text.
                // use the method .getAttribute to have the value of a particular attribute in the tag

               String  LinkAddress=link.getAttribute("href");
               System.out.println(LinkAddress);

                System.out.println("---------------------------");

            }



        }

    }


}
